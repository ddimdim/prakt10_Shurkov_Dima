import java.lang.Exception

fun main(){
    try {
        var braid = " "
        var cores = 0
        var d = 0.0
        println("Введите тип кабеля")
        var type = readLine()!!.toString()
        while (cores<=0 || cores>5) {
            println("Введите количество жил кабеля")
            cores = readLine()!!.toInt()
            if (cores <= 0 || cores > 5) println("Всего может быть от 1 до 5 жил в кабеле")
        }

        while (d<=0)
        {
            println("Введите диаметр кабеля")
            d = readLine()!!.toDouble()
            if (d<=0) println("Диаметр не может быть таким")
        }
        while (braid!="Да" && braid != "Нет") {
            println("В кабеле есть оплетка? (Да или Нет)")
            braid = readLine()!!.toString()
            if (braid!="Да" && braid != "Нет") println("Введите Да или Нет!!!!!!!!!")
        }
        var cable1 = Braid(braid, type, cores, d)

        var newcable1 =InfoCable(cable1)
        newcable1.quality()
        newcable1.info()
        newcable1.length()
    }
    catch (e: Exception)
    {
        println("Данное было введено неверно")
    }



}