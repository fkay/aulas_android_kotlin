package aula07

interface IRecebivel {
    fun totalizarReceita(): Double
}

class RegistraRecebimentos {
    val recebiveis = ArrayList<IRecebivel>()

    fun adicionarRecebimento(recebivel: IRecebivel) {
        recebiveis.add(recebivel)
    }

    fun apresentarRecebimentos() {
        var total:Double = 0.0
        for (recebivel in recebiveis) {
            total += recebivel.totalizarReceita()
        }
        println("Total recebido: $total")
    }
}

class ItemVenda(val produto:String, val quantidade: Int, val valor:Double) : IRecebivel{
    override fun totalizarReceita(): Double {
        return(valor*quantidade)
    }

    fun ToString():String {
        return("$produto - qtd: $quantidade - valor unitário: R$ $valor")
    }
}

class Servico(val descricao:String, val horas: Int, val precoHora:Double) : IRecebivel{
    override fun totalizarReceita(): Double {
        return(horas*precoHora)
    }

    fun ToString():String {
        return("$descricao - horas: $horas - valor/hora: R$ $precoHora")
    }
}