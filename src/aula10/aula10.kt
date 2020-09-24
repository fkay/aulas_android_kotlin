package aula10

fun main(){
    val pessoa1 = Pessoa("123", "Joao")
    val pessoa2 = Pessoa("123", "Joao")

    println("Pessoas são iguais = ${pessoa1 == pessoa2}")

    val func1 = Funcionario(1, "Joao")
    val func2 = Funcionario(2, "Jose")
    val func3 = Funcionario(3, "Maria")
    val pesq = Funcionario(3, "Maria")

    val listaFunc = listOf(func1, func2, func3)

    println("Lista contém func: ${listaFunc.contains(pesq)}")
}

class Pessoa(val RG:String, val nome:String){
    override fun equals(other: Any?): Boolean {
        return other?.let {
            val pessoa = (it as? Pessoa)
            pessoa?.let {
                it.RG == this.RG
            } ?: false
        } ?: false
    }
}

class Funcionario(val cod:Int, val nome:String) {
    override fun equals(other: Any?): Boolean {
        return other?.let{
            val func = (it as? Funcionario)
            func?.let {
                it.cod == this.cod
            } ?: false
        } ?: false
    }

}