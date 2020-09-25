package aula04

fun main() {
    meuNome("Fabricio", "Kassardjian")
    println("O maior numero entre 3 e 5 é ${qualNumeroEhMaior(3,5)}")

    val pessoa1 = Pessoa("Fabricio", "Kassardjian", 35)
    val pessoa2 = Pessoa("José", "Silva")
    val pessoa3 = Pessoa()

    println("O primeiro nome do obejto 1 é: ${pessoa1.getPrimeiroNome()}")
}

fun qualNumeroEhMaior(num1: Int, num2: Int): Int {
    if (num1 > num2) {
        return num1
    }
    return num2
}

fun meuNome(nome: String, sobrenome: String) {
    println("Meu nome é $nome $sobrenome")

}

// constructor é opcional, a não se que tenha alguma anotação
class Pessoa constructor(val nome: String, val sobrenome: String, var idade: Int) {

    init {  // executada no inicio da objeto
        println(nome)
        println(sobrenome)
        println(idade)
    }

    constructor(nome: String, sobrenome: String):this(nome, sobrenome, 0)

    constructor(nome: String = "Teste"):this(nome, "Teste2", 30)



    fun getPrimeiroNome():String {
        return nome;
    }

    //var nome = nome
    //var sobrenome = sobrenome
    //var idade = idade
}