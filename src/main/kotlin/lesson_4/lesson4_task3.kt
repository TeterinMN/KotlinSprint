package lesson_4

/*
Задача 3 к Уроку 4.
На территории агрокомплекса функционирует система автоматического мониторинга условий для роста растений.
Напиши программу, которая будет определять, подходят ли текущие условия для успешного роста бобовых культур.

Критерии благоприятных условий включают:
- наличие солнечной погоды;
- открытый тент;
- влажность воздуха составляет 20%;
- текущее время года - не зима.

Программа должна выводить результат анализа условий в формате: “Благоприятные ли условия сейчас для роста бобовых?
true/false”

Для проверки работы программы, инициализируй переменные следующими значениями:
- погода сегодня - солнечная;
- тент на данный момент - открыт;
- влажность воздуха - 20%;
- текущее время года - зима.

И типами данных - boolean, boolean, int, String.
 */

const val AIR_HUMIDITY = 20
const val SEASON = "Зима"
const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
fun main() {
    val airHumidity = 20
    val season = "Зима"
    val isSunny = true
    val isAwingOpen = true
    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            isSunny == IS_SUNNY && isAwingOpen == IS_AWNING_OPEN && airHumidity == AIR_HUMIDITY && season != SEASON
        }",
    )
}