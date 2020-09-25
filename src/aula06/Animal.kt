package aula06

open class Animal(var nome: String = "Sem nome") {
    open fun fala(){
        println("Som de um animal qualquer")
    }

    fun dorme() {
        println("zzzzzzz")
    }
}
