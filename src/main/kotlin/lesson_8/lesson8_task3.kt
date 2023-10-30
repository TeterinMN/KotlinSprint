package lesson_8

/*
Задача 3 к Уроку 8
Представь, что ты работаешь над приложением с рецептами (кстати, это приложение мы вместе будем разрабатывать
на практике AndroidSprint). Напиши код, который проверяет, есть ли нужный ингредиент в рецепте.
 – создай массив, в котором будет храниться список ингредиентов для определенного блюда;
 – далее через консоль запроси у пользователя информацию об ингредиенте, который он хочет найти;
 – произведи поиск элемента по массиву, используя цикл for;
 – если ингредиент в списке есть, выведи в консоль сообщение - “Ингредиент [название] в рецепте есть”;
 – если нет, сообщать: “Такого ингредиента в рецепте нет”.

Нужно доработать код, который проверяет наличие ингредиента в рецепте.
Однако, не используя цикл для поиска.
 */

fun main() {
    val listOfIngredients = arrayOf("курица", "соль", "майонез", "сметана", "чеснок", "перец", "зелень")
    print("Введите название искомого ингредиента: ")
    val ingredientSearch = readln()
    if (listOfIngredients[0] == ingredientSearch || listOfIngredients[1] == ingredientSearch ||
        listOfIngredients[2] == ingredientSearch || listOfIngredients[3] == ingredientSearch ||
        listOfIngredients[4] == ingredientSearch || listOfIngredients[5] == ingredientSearch ||
        listOfIngredients[6] == ingredientSearch)
    println("Ингредиент $ingredientSearch в рецепте есть")
    else
    println("Такого ингредиента в рецепте нет")
}