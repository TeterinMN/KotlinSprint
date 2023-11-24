package lesson_11

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