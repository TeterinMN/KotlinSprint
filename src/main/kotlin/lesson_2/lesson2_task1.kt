package lesson_2

/*
Задача 1 к Уроку 2.
Задача на среднее арифметическое. В классе с углубленным изучением английского языка учится 4 человека.
У них следующие баллы по профильному предмету 3, 4, 3, 5. Пишем часть школьного софта, который посчитает средний балл
по английскому для этого класса.
 – Написать выражение, которое высчитывает средний балл;
 – Распечатать результат в консоль;
 – В консоли должно быть выведено дробное число с 2 знаками после запятой.
 */

fun main() {
    val totalStudents = 4.0
    val oneStudent = 3
    val twoStudent = 4
    val threeStudent = 3
    val fourStudent = 5
    val averageScore = (oneStudent + twoStudent + threeStudent + fourStudent) / totalStudents
    println(String.format("%.2f", averageScore))
}