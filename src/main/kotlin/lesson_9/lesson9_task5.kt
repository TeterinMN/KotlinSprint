package lesson_9

import java.util.*

/*
Задача 5* к Уроку 9.
Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).
- результат должен исключать повторы;
- список должен выводиться в алфавитном порядке;
- все элементы списка выведены в одну строку, разделяя слова запятыми;
- первый элемент должен быть распечатан с заглавной буквы.
 */

fun main() {
    println("Введите пять ингредиентов:")
    val listOfIngredients: MutableList<String> = mutableListOf()
    var count = 1
    for (i in 0..4) {
        print("Ингредиент №$count - ")
        listOfIngredients.add(readln())
        count++
    }
    val sortedList = listOfIngredients.sorted().joinToString(", ")
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println(sortedList)
}