package aula06

class Cachorro(var raca:String, nome: String) : Animal(nome) {
    constructor(raca:String) : this(raca, "Sem nome") {
    }

    override fun fala() {
        println("Au Au!")
    }
}