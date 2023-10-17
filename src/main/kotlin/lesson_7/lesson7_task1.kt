package lesson_7

/*
Задача 1 к Уроку 7.
Создай программу, которая генерирует шестизначные пароли. Пусть пароль будет состоять из чередующихся цифр и строчных
букв латинского алфавита (без специальных символов). Например, k5p6m2. Выведи сгенерированный пароль в консоль.
 */

fun main() {
    val numericArray = 0..9
    val characterArray = 'a'..'z'
    var password = ""

    for (i in 0..<3) {
        password += numericArray.random()
        password += characterArray.random()

    }
    println(password)



}