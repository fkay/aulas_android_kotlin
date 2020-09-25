package aula09

fun main() {
    val jogo = mapOf(0 to "Ovos", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")

    val apelidos = mapOf(
        "João" to listOf("Juan", "Fissura", "MAromba"),
        "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
        "Maria" to listOf("Lukinha", "Jorge", "George")
    )

    apelidos.forEach {
        println(it.key)
        it.value.forEach {
            println("  ${it}")
        }
        //println(it.value)
    }

    val lista1 = mutableListOf<Int>()
    val lista2 = mutableSetOf<Int>()

    lista1.addAll(listOf(1,5,5,6,7,8,8,8))
    lista2.addAll(listOf(1,5,5,6,7,8,8,8))

    println(lista1)
    println(lista2)

    val prova = Prova()

    prova.somaTotal(lista2)


    val chapeu = Chapeu("XPTO", "Coco")
    val casaco = Casaco("hk", "chuva")

    val pecas1 = listOf<Peca>(chapeu, casaco)
    val pecas2 = listOf<Peca>(Chapeu("kk","xx"), Casaco("ll", "oo"))

    val guardaVol = GuardaVolumes()

    val ticket1 = guardaVol.guardarPecas(pecas1)
    val ticket2 = guardaVol.guardarPecas(pecas2)

    guardaVol.mostrarPecas()
    guardaVol.mostrarPecas(ticket2)
    guardaVol.devolverPecas(ticket1)
    guardaVol.mostrarPecas()

}

class Prova() {
    fun somaTotal(conjuntoDeInteiros: Set<Int>) : Int{
        var total = 0
        conjuntoDeInteiros.forEach {
            total += it
        }

        total = conjuntoDeInteiros.reduce { acc, i -> acc + i }

        println("O total é ${total}")
        return total
    }
}