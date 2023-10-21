package lesson_8

/*
Задача 1 к Уроку 8.
Скрипт считает количество просмотров рекламы за день. Напиши программу, которая сохраняет в массив данные просмотров
за неделю (числа использовать на свое усмотрение). Каждая ячейка хранит количество просмотров за день. Имея массив с
данными, нужно посчитать сколько всего было просмотров за неделю. Результат вычислений выведи в консоль.
 */
const val MONDAY = 26
const val TUESDAY = 32
const val WEDNESDAY = 29
const val THURSDAY = 45
const val FRIDAY = 12
const val SATURDAY = 89
const val SUNDAY = 79

fun main() {
    val array = intArrayOf(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)
    var result = 0
    for (i in array) {
        result += i
    }
    println(result)
}