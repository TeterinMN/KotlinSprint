package lesson_2

/*
Задача 3 к Уроку 2.
Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а время прибытия
вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */

fun main() {
    val hour = 9
    val minutes = 39
    val travelTime = 457
    val totalMinutes = minutes + travelTime
    val hoursOnTheRoad = totalMinutes / 60 + hour
    val minutesOnTheRoad = travelTime % 60

    println(String.format("%02d:%02d", hoursOnTheRoad, minutesOnTheRoad))
}