package lesson_5

/*
Задача 2 к Уроку 5.
Изменить пример из видео урока. В уроке создавался блок кода, считывающий возраст. И если возраст больше или
равен 18 лет, показывали экран с ограниченным контентом (выводили это сообщение в консоль в качестве имитации).
Новое условие:
 – Пользователь должен вводить не возраст, а год рождения;
 – Возраст пользователя высчитывать на основании текущего года;
 – Вычисляемый результат должен сравниваться с константой, в которой хранится возраст совершеннолетия (18);
 – Если год рождения подходит, выводить сообщение “Показать экран со скрытым контентом”.
 */

const val AGE_OF_MAJORITY = 18
fun main() {
    print("Введите год своего рождения: ")
    val userAge = readln().toInt()
    val currentYear = 2023
    if (currentYear - userAge >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("Доступ запрещен")
}