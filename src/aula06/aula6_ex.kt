package aula06

fun main() {
    val cliente = Cliente(1,"Fabricio", "xxxxxxxx", "336562321")
    val conta = Conta(123456, cliente)

    val contaPoupanca = Poupanca(0.0055, 123457, cliente)
    val contaCorrente = ContaCorrente(300.0, 123458, cliente)

    println(conta.deposito(400.0))
    println(conta.saque(1000.0))
    println(conta.saque(200.0))
    println(conta.consultarSaldo())

    println(contaPoupanca.deposito(200.0))
    println(contaPoupanca.recolherJuros())
    println(contaPoupanca.saque(300.0))
    println(contaPoupanca.saque(200.0))
    println(contaPoupanca.consultarSaldo())

    println(contaCorrente.deposito(200.0))
    println(contaCorrente.saque(300.0))
    println(contaCorrente.saque(200.0))
    println(contaCorrente.consultarSaldo())


}

class Cliente(val numero: Int, val sobrenome: String, val RG: String, val CPF: String){

}

open class Conta(val numeroConta: Int, val cliente: Cliente, var saldo: Double = 0.0){
    fun deposito(valor: Double) : String {
        saldo += valor
        return("Depósito de $valor e saldo atual é $saldo")
    }

    open fun saque(valor: Double) : String {
        if(valor > saldo) {
            return("Saldo insuficiente")
        } else {
            saldo -= valor
            return("Saque de $valor e saldo atual é $saldo")
        }
    }

    fun consultarSaldo() : String {
        return ("saldo atual é $saldo")
    }
}

class Poupanca(var taxaJuros: Double, numeroConta: Int, cliente: Cliente)
    : Conta(numeroConta, cliente) {
    fun recolherJuros() : String {
        val saldoAnt = saldo
        saldo += (taxaJuros * saldo)
        //return("O juros rendeu: ${taxaJuros * saldoAnt} e o novo saldo é ${saldo}")
        return("O juros rendeu: %.2f  e o novo saldo é %.2f".format(taxaJuros * saldoAnt, saldo))
    }
}

class ContaCorrente(var limite:Double, numeroConta: Int, cliente: Cliente)
    : Conta(numeroConta, cliente) {
    fun depositarCheque(valor: Double): String {
        return super.deposito(valor)
    }

    override fun saque(valor: Double): String {
        if(valor > saldo + limite) {
            return("Saldo insuficiente")
        } else {
            saldo -= valor
            return("Saque de $valor e saldo atual é $saldo")
        }
    }
}