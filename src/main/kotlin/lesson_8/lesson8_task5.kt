package lesson_8

/*
Задача 5* к Уроку 8.
Напиши программу, которая должна создавать массив из определенного количества ингредиентов, которые будет вводить
пользователь.
- элементы вводятся по одному;
- перед вводом элементов сначала запрашивается количество планируемых ингредиентов;
- запрещено использовать список или динамический массив.
 */

fun main() {
    print("Введите количество ингредиентов: ")
    val numberOfIngredients = readln().toInt()
    var arrayIngredients: Array<String> = arrayOf()
    for (i in 1..numberOfIngredients) {
        print("Название ингредиента ${i}: ")
        val temp = readln()
        arrayIngredients += temp
    }
    println(arrayIngredients.joinToString())
}