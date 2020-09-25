package aula05

fun main() {
    var fat = Fatorial(5)
    fat.calculaFatorial()

    var aposentar = Aposentadoria(62, "F", 30)
    println("Pode aposentar: ${aposentar.podeAposentar()}")

    println(exercicio3(mutableListOf(2,3,5)))
}

class Fatorial(val num: Int){
    fun calculaFatorial() {
        var prod = num
        var fator = num -1
        while (fator > 1) {
            prod *= fator
            fator -= 1
        }
        println("O fatorial de $num é $prod")
    }
}

class Aposentadoria(val idade:Int, val sexo: String, val anosContrib: Int) {
    fun podeAposentar():Boolean {
        /*if(anosContrib <  30) {
            return false
        }
        if(sexo == "M") {
            return(idade >= 65)
        }
        return(idade >= 60 )*/
        return ((anosContrib >= 30) && ((sexo == "M" && idade >= 65) || (sexo == "F" && idade >=60)))
    }
}

fun exercicio3(lista: MutableList<Int>): Int {
    var resultado = 1
    //lista.forEach{ num -> resultado *= num }
    return lista.reduce{ total, num -> num * total}
    //return resultado
}
