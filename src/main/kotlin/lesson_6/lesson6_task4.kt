package lesson_6

import kotlin.random.Random

/*
Задача 4 к Уроку 6.
Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9.
Игроку дается 5 попыток, чтобы угадать это число.

 – если игрок угадывает число, выводится сообщение “Это была великолепная игра!” и программа завершает работу;
 – если не угадывает, то отображается "Неверно" или что-то на твое усмотрение и оставшееся количество попыток;
 – после истечения попыток выводится сообщение “Было загадано число N”.
 */
const val NUMBERS_OF_ATTEMPTS = 5
fun main() {
    val hiddenNumber = Random.nextInt(1, 10)
    var count = 1
    while (count <= NUMBERS_OF_ATTEMPTS) {
        print("Введите число от 1 до 9: ")
        val choiceUser = readln().toInt()
        if (choiceUser != hiddenNumber) {
            println("Неверно")
            count++
        } else {
            println("Это была великолепная игра!")
            break
        }
    }
    println("Было загадано число: $hiddenNumber")
}