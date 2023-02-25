package Cable

abstract class Cable {
    var type: String
    var cores: Int
    var d: Double
    constructor(_type: String, _cores: Int, _d: Double){
        type = _type
        cores = _cores
        d = _d
    }

    open fun quality(): Double{
        return d/cores
    }
    open fun info(){
        println("Тип кабеля: $type")
        println("Количество жил кабеля: $cores")
        println("Диаметр кабеля: $d")
    }
    open fun length(){
        var dlina = 0.0
        while (dlina<=0.0) {
            println("Введите длину кабеля")
            dlina = readLine()!!.toDouble()
            if (dlina<=0.0) println("Длина кабеля не может быть такой")
            else if (dlina < 5.0 && dlina>0.0) println("Не такой уж и длинный кабель")
            else println("Кабель довольно-таки длинный")
        }
    }
    interface InfoCable{
        fun quality(): Double
        fun info()
        fun length()
    }
}