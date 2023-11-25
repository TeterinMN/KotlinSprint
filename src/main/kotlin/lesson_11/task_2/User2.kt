package lesson_11.task_2

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun aboutUser() {
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun getBio() {
        print("Введите свой пол: ")
        bio = readln()
    }

    fun passwordChange() {
        print("Введите свой пароль: ")
        val pwd = readln()
        if (password == pwd) {
            print("Придумайте новый пароль: ")
            this.password = readln()
            println("Ваш пароль изменен")
        } else println("Не корректный пароль!")

    }
}