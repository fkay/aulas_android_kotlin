package aula05

fun main() {
    val cliente = Cliente("Fabricio", "Kassardjian")
    val conta = Conta(123456, 300.0, cliente)

    conta.deposito(400.0)
    conta.saque(1000.0)
    conta.saque(200.0)
}

class Cliente(val nome: String, val sobrenome: String){

}

class Conta(val numeroConta: Int, var saldo: Double, val cliente: Cliente){
    fun deposito(valor: Double) {
        saldo += valor
        println("Depósito de $valor e saldo atual é $saldo")
    }

    fun saque(valor: Double) {
        if(valor > saldo) {
            println("Saldo insuficiente")
        } else {
            saldo -= valor
            println("Saque de $valor e saldo atual é $saldo")
        }
    }
}