package lesson_5

/*
Задача 1 к Уроку 5.
Нужно написать часть модуля для авторизации пользователя. Для входа в приложение пользователь должен доказать,
что он не бот. Для этого программа предлагает решить простой математический пример – сложить два числа
(сообщить об этом пользователю).

Имитируй эти действия в консоли, путем считывания данных с клавиатуры. При успешном решении вход в программу
символизируется сообщением “Добро пожаловать!". В противном случае вывести сообщение "Доступ запрещен."
 */

fun main() {
    val firstTerm = 5
    val secondTerm = 8
    print("Для входа в приложение решите пример $firstTerm + $secondTerm = ")
    val answerUser = readln().toInt()
    if (firstTerm + secondTerm == answerUser)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}