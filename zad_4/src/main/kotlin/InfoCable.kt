import Cable.*

class InfoCable: Cable.InfoCable {
    var cable: Braid

    constructor(_cable: Braid){
        cable = _cable
    }

    override fun quality(): Double{
        return cable.quality()
    }
    override fun length(){
        return cable.length()
    }

    override fun info() {
        println("Тип кабеля: ${cable.type}")
        println("Количество жил кабеля: ${cable.cores}")
        println("Диаметр кабеля: ${cable.d}")
        println("Качество ${quality()}")
    }

}