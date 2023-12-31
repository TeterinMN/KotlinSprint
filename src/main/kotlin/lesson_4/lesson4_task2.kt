package lesson_4

/*
Задача 2 к Уроку 4.
При работе на таможенном терминале важно точно определить категорию каждого груза. Напиши программу, которая проверяет,
соответствует ли груз категории "Average". Эта категория имеет следующие параметры: вес от 35 кг до 100 кг
(включительно), и объем меньше 100 литров.

Создай программу, которая отображает соответствие данных груза категории "Average". Вывод программы может выглядеть так:
"Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".

- укажи предварительно заданные параметры категории;
- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
- сделай сравнение непосредственно внутри println() и без использования диапазонов.
 */

const val MINIMUM_WEIGHT = 35
const val MAXIMUM_WEIGHT = 100
const val VOLUME = 100
fun main() {
    val averageOneWeight = 20
    val averageOneVolume = 80
    val averageTwoWeight = 50
    val averageTwoVolume = 100
    println("Груз с весом $averageOneWeight кг и объемом $averageOneVolume л. соответствует категории 'Average': " +
            "${averageOneWeight >= MINIMUM_WEIGHT && averageOneWeight <= MAXIMUM_WEIGHT && averageOneVolume < VOLUME}")
    println("Груз с весом $averageTwoWeight кг и объемом $averageTwoVolume л. соответствует категории 'Average': " +
            "${averageTwoWeight >= MINIMUM_WEIGHT && averageTwoWeight <= MAXIMUM_WEIGHT && averageTwoVolume <= VOLUME}")
}