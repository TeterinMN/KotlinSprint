package lesson_7

/*
Задача 5* к Уроку 7

Создай программу, которая генерирует более сложные пароли.

 – пароль должен содержать цифры, строчные и заглавные буквы;
 – цифры и буквы должны располагаться в случайном порядке;
- минимальная длина пароля 6 символов;
- максимальная длина пароля должна задаваться пользователем.
 */
const val MIN_LENGTH_PASSWORD = 6
fun main() {
    val numberRange = 0..9
    val lowercaseLettersRange = 'a'..'z'
    val capitalLettersRange = 'A'..'Z'
    val arraySymbol = numberRange + lowercaseLettersRange + capitalLettersRange
    var password = ""

    while (true) {
        print("Введите максимальную длину пароля: ")
        val maxLengthPassword = readln().toInt()
        if (maxLengthPassword < MIN_LENGTH_PASSWORD) {
            println("Минимальная длина пароля 6 символов")
            continue
        } else
            for (i in 1..maxLengthPassword) {
                password += arraySymbol.random()
            }
        println(password)
        break
    }
}