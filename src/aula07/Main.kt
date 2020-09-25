package aula07

fun main() {
    val servico01 = Servico("pintura", 8, 75.0)
    val item01 = ItemVenda("Tinta", 2, 105.0)

    val recebimentos = RegistraRecebimentos()

    recebimentos.adicionarRecebimento(servico01)
    recebimentos.adicionarRecebimento(item01)

    recebimentos.apresentarRecebimentos()
}

class Gol: Carro {
    override val chassi: String = "GH89087"
    override val modelo: String = "2020"

    override fun acelera() {
        println("Gol acelerando")
    }

    override fun freia() {
        println("Gol freiando")
    }

}

open class Fusca: Carro {
    override val chassi: String = "GH89087"
    override val modelo: String = "2020"

    override fun acelera() {
        println("Fusca acelerando")
    }

    override fun freia() {
        println("Fusca freiando")
    }

}

class NewBettle : Fusca() {

}

interface Carro {
    val chassi: String
    val modelo: String

    fun acelera()

    fun freia()
}