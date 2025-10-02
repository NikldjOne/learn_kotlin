package com.example.kotlin_t_bank.block1_block2_task

data class Task(val id: Int, val title: String, var isDone: Boolean)

fun addTask(list: MutableList<Task>) {
    val id = if(list.isEmpty()) 1 else list.maxOf { it.id } + 1

    println("Введите заголовок вашей задачи")
    val titleInput = readLine() ?: "Неизвестно"

    println("Выполнена ли ваша задача true/false")
    val isDoneInput = readLine()?.toBooleanStrictOrNull() ?: false
    list.add(Task(id, titleInput, isDoneInput))
    println(list.toString())
}

fun removeTask(list: MutableList<Task>) {
    println("Введите id для удаления задачи")
    val idInput = readLine()
    val id = idInput?.toIntOrNull() ?: 0
    val index = list.indexOfFirst { it.id == id }
    if (index != -1) {
        list.removeAt(index)
    }else{
    println("Задача с таким id не найдена")
    }
}

fun editTaskDone(list: MutableList<Task>) {
    println("Введите id")
    val idInput = readLine()
    val id = idInput?.toInt() ?: (list.size + 1);
    val index = list.indexOfFirst { it.id == id }
    if (index != -1) {
        println("Выполнена ли задача? true/false")
        val isDone = readLine()?.toBooleanStrictOrNull() ?: false
        list[index].isDone = isDone
    } else {
        println("Задача с таким id не найдена")
    }
}

fun main() {
    val list: MutableList<Task> = mutableListOf()
    var commandInput = "";



    println("Введите команду add если хотите добавить задачу")
    println("Введите команду list если хотите вывести список")
    println("Введите команду remove если хотите удалить задачу")
    println("Введите команду edit если хотите изменить задачу выполнено? да/нет")
    println("Введите команду exit если хотите закончить выполнение программы")

    while (commandInput != "exit") {
        commandInput = readLine()?.lowercase() ?: ""
        when (commandInput) {
            "add" -> {
                addTask(list)
            }

            "list" -> {
                list.forEach {
                    val status = if (it.isDone) "[x]" else "[]"
                        println("${it.id}: ${it.title} $status ")
                }
            }

            "remove" -> {
                removeTask(list)
            }

            "edit" -> {
                editTaskDone(list)
            }

            "exit" -> {
                break;
            }
        }
    }
}

