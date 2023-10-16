package lesson_6

/*
Задача 1 к Уроку 6.
На этапе авторизации в приложении пользователь, не имея аккаунта, выбрал регистрацию. Нужно создать блок программы,
который сначала предлагает создать логин и пароль, затем запрашивает их, чтобы войти в приложение.

Если логин или пароль введены неверно, выводится соответствующее сообщение и данные запрашиваются заново. Если данные
верны, выводится сообщение – “Авторизация прошла успешно”.
 */

fun main() {
    println("Для регистрации придумайте логин и пароль")
    print("Логин: ")
    val userLogin = readln()
    print("Пароль: ")
    val userPassword = readln()
    var authenticated = false

    while (!authenticated) {
        println("Для входа в приложение авторизуйтесь")
        print("Логин:")
        val tempUserLogin = readln()
        print("Пароль: ")
        val tempUserPassword = readln()
        if (tempUserLogin == userLogin && tempUserPassword == userPassword) {
            println("Авторизация прошла успешно")
            authenticated = true
        } else
            println("Логин или пароль введены неверно")
    }
}