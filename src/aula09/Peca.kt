package aula09

abstract class Peca(open val marca:String, open val modelo: String) {
    abstract fun retirada()
}

class Chapeu(override val marca: String, override val modelo: String) : Peca(marca, modelo) {
    override fun retirada() {
        TODO("Not yet implemented")
    }
}

class Casaco(override val marca: String, override val modelo: String) : Peca(marca, modelo) {
    override fun retirada() {
        TODO("Not yet implemented")
    }
}