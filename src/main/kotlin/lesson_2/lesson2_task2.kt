package lesson_2

/*
Задача 2 к Уроку 2.
В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров, которым назначили
зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:
– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.
Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде
целых чисел.
*/

fun main() {
    val permanentEmployees = 50
    val interns = 30
    val wagesOfEmployees = 30000
    val internsSalary = 20000
    val totalSalariesOfPermanentEmployees = wagesOfEmployees * permanentEmployees
    val totalSalaryOfEmployees = internsSalary * interns + totalSalariesOfPermanentEmployees
    val totalEmployees = permanentEmployees + interns
    val averageSalary = totalSalaryOfEmployees / totalEmployees

    println(totalSalariesOfPermanentEmployees)
    println(totalSalaryOfEmployees)
    println(averageSalary)
}