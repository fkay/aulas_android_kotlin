package aula09

class GuardaVolumes() {
    var contador = 0
    val volumes: MutableMap<Int, List<Peca>> = mutableMapOf()

    fun guardarPecas(listaDePecas: List<Peca>): Int {
        val chave = contador
        contador++
        volumes.put(chave, listaDePecas)
        return chave
    }

    fun mostrarPecas() {
        volumes.forEach { key, value ->
            println(key)
            value.forEach {
                println("  -  ${it.marca} - ${it.modelo}")
            }
        }
    }

    fun mostrarPecas(numero: Int) {
        volumes[numero]?.forEach {
            println("${it.marca} - ${it.modelo}")
        }
    }

    fun devolverPecas(numero: Int) {
        volumes.remove(numero)
    }
}