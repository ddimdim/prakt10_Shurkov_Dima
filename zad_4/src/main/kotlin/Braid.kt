import Cable.*

class Braid(var braid: String, type: String, cores: Int, d: Double): Cable(type, cores, d) {
    override fun quality(): Double {
        return if (braid == "Да") 2*super.quality()
        else 0.7*super.quality()

    }
}