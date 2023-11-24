package lesson_11
/*
Задача 1 к Уроку 11.
Создай класс, который будет хранить данные пользователя. В свойствах должна храниться информация об уникальном
идентификаторе, логине, пароле и почте. Названием может быть, например, User. Создай два экземпляра класса с
произвольными данными и выведи в консоль содержимое их полей.
 */

fun main() {
    val userOne = User(1, "Scorpio", "12345", "Scorpio@ya.ru")
    val userTwo = User(2, "Tima", "54321", "Tima@ya.ru")

    println(userOne.id)
    println(userOne.login)
    println(userOne.password)
    println(userOne.email)
    println()
    println(userTwo.id)
    println(userTwo.login)
    println(userTwo.password)
    println(userTwo.email)

}