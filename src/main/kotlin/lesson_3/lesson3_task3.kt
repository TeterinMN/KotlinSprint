package lesson_3

/*
Задача 3 к Уроку 3.
Пишем программу, которая будет помогать учить таблицу умножения. В отдельную переменную будет записываться число
(объявить и проинициализировать), а выводиться будет таблица умножения для этого числа. Таблица должна корректно
печататься, если в исходную переменную подставлять разные числа.
Пример вывода:
6 x 1 = 6
6 x 2 = 12
…
6 x 9 = 54
 – Вместо числа 6 использовать данные из объявленной переменной;
 – Вычислять значения прямо в строке;
 – Вывод всей таблицы нужно сделать в одной функции println(), которая вызывается один раз.
 */

fun main() {
    val number = 2
    println(
        """
         |$number x 1 = ${number * 1} 
         |$number x 2 = ${number * 2} 
         |$number x 3 = ${number * 3} 
         |$number x 4 = ${number * 4} 
         |$number x 5 = ${number * 5} 
         |$number x 6 = ${number * 6} 
         |$number x 7 = ${number * 7} 
         |$number x 8 = ${number * 8} 
         |$number x 9 = ${number * 9} 
         |$number x 10 = ${number * 10} 
    """.trimMargin()
    )
}