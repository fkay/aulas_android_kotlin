package aula11

import java.lang.ClassCastException
import java.lang.Exception
import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main() {
    val pessoa = Pessoa(null)

    pessoa.getNome()
}

class Pessoa(val nome: String?) {

    fun getNome(){
        try {
            val e = 2.0 as Pessoa
            val list = listOf(1,2,3)
            println(list.get(3))
            val d = "teste".toDouble()
            println(nome!!)
            var x=5/0
        } catch (ex: ArithmeticException) {
            println("Divisão por zero")
        } catch (ex: NullPointerException) {
            println("Tentativa de acessar objeto nulo")
        } catch (ex: IndexOutOfBoundsException) {
            println("tentativa de acessar indice incorreto")
        } catch (ex: NumberFormatException) {
            println("Falha em transformar os dados")
        }
        catch (ex: Exception) {
            println(ex)
            println("Ocorreu um erro ${ex.localizedMessage}")
            //ex.stackTrace
        } finally {
            println("Finalmente terminei")
        }
    }

}