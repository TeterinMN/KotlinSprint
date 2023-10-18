package lesson_7

/*
Задача 4 к Уроку 7.
Cоздай таймер, который сперва запрашивает у пользователя количество секунд, которые нужно засечь.
 – таймер должен показывать каждую секунду, сколько времени осталось до конца;
 – по истечении времени, вывести сообщение в консоль: “Время вышло”;
 – таймер должен быть написан, используя цикл for.
 */

fun main() {
    print("Введите количество секунд: ")
    val timerCount = readln().toInt()
    for (i in timerCount downTo 0) {
        println(i)
        Thread.sleep(1000)
    }
    println("\nВремя вышло")
}