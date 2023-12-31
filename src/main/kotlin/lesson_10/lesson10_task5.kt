package lesson_10

/*
Задача 5* к Уроку 10.
Реализуй механизм авторизации в интернет-магазине и получения сохраненного ранее списка товаров.

Метод авторизации принимает логин и пароль, верифицирует пользователя, генерирует и возвращает токен доступа.
При неудачной авторизации возвращается null. Токен - текстовая строка, генерируемая методом авторизации (32 символа,
которые включают цифры и буквы англ. алфавита). Подробнее https://ru.wikipedia.org/wiki/JSON_Web_Token

Метод получения корзины принимает токен и возвращает список товаров (содержимое переменной корзины).

Распечатай содержимое корзины или, если вернется null, оповести пользователя о неудачной авторизации. Переменные логин,
пароль и корзина проинициализированы заранее и неизменяемы.
 */

const val USER_LOGIN = "Scorpio"
const val USER_PASSWORD = 12345
fun main() {
    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln().toInt()
    val token = login(userLogin, userPassword)
    if (token != null) {
        returnShoppingCart(token)
    } else println("Неудачная попытка авторизации")

}

fun login(userLogin: String, userPassword: Int): String? {
    val number = 0..9
    val symbol = 'a'..'z'
    var token: String? = null
    if (userLogin == USER_LOGIN && userPassword == USER_PASSWORD) {
        for (i in 0..32) {
            token += number.random().toString() + symbol.random()
        }
    }
    return token
}

fun returnShoppingCart(token: String) {
    val shoppingCart = listOf("Палатка", "Котелок", "Спальник")
    println("Содержимое корзины: ")
    shoppingCart.forEach {
        println(it)
    }
}