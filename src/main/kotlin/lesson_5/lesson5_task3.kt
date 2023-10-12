package lesson_5

/*
Задача 3 к Уроку 5.
Для алгоритма простого приложения-лотереи, нужно угадать два числа от 1 до 100. Если угадать только одно – игрок
получает утешительный приз. Напиши программу, проверяющую выигрыш.

Пользователь должен вводить числа в консоль. Правильные числа заранее известны и хранятся в переменных.
Оформить ввод текстовыми аннотациями о том, что нужно вводить. Вывести отдельным сообщением, какие числа были нужны
для победы.

 – Если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”
 – Если угадано только одно число, вывести “Вы выиграли утешительный приз!”
 – Если не угадано ничего, вывести “Неудача! Крутите барабан!”
 */

fun main() {
    val firstCorrectNumber = 23
    val secondCorrectNumber = 67
    print("Введите первое число: ")
    val firstNumberUser = readln().toInt()
    print("Введите второе число: ")
    val secondNumberUser = readln().toInt()

    if (firstNumberUser == firstCorrectNumber
        && secondNumberUser == secondCorrectNumber
    )
        println("Поздравляем! Вы выиграли главный приз!")
    else if (firstNumberUser == firstCorrectNumber || firstNumberUser == secondCorrectNumber
        || secondNumberUser == secondCorrectNumber || secondNumberUser == firstCorrectNumber
    )
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача! Крутите барабан!")
    println("Были загаданы числа: $firstCorrectNumber и $secondCorrectNumber")
}