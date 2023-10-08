package lesson_4

/*
Задача 5* к Уроку 4.
Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих условий:
- корабль не имеет повреждений;
- число экипажа составляет от 55 до 70 человек (включительно);
- на борту есть более 50 ящиков провизии;
- погода благоприятная или неблагоприятная.

Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:
- на борту рекомендованный состав экипажа - 70 человек;
- погода благоприятна;
- на борту есть 50 и более ящиков провизии.

Напиши программу, которая будет определять, может ли корабль отправиться в плавание. В качестве входных данных
используй информацию, введенную через консоль:
- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Программа должна анализировать эти данные и выводить результат в консоль.
 */
const val IS_PRESENCE_OF_DAMAGE = true
const val IS_FAVORABLE_WEATHER = true
const val MINIMUM_NUMBER_OF_CREW = 55
const val MAXIMUM_NUMBER_OF_CREW = 70
const val MINIMUM_PROVISIONS = 50
fun main () {
    print("Есть ли у корабля повреждения? true/false ")
    val damage = readln().toBoolean()
    print("Благоприятная погода или нет? true/false ")
    val wither = readln().toBoolean()
    print("Какова численность экипажа? ")
    val numberOfCrew = readln().toInt()
    print("Сколько ящиков с провизией загружено? ")
    val provisions = readln().toInt()

    if ((damage != IS_PRESENCE_OF_DAMAGE && wither == IS_FAVORABLE_WEATHER && numberOfCrew >= MINIMUM_NUMBER_OF_CREW
        && numberOfCrew <= MAXIMUM_NUMBER_OF_CREW && provisions >= MINIMUM_PROVISIONS) || (damage == IS_PRESENCE_OF_DAMAGE
                && wither == IS_FAVORABLE_WEATHER && numberOfCrew == MAXIMUM_NUMBER_OF_CREW && provisions >= MINIMUM_PROVISIONS))
        println("Корабль может отправится в плавание")
    else
        println("Корабль не может отправится в плавание")

}