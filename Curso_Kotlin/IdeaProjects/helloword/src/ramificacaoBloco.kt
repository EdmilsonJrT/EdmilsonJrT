
import kotlin.IllegalArgumentException

interface Expressao1
class Numero1(val valor1:Int) : Expressao1
class Soma1(val esquerdo1:Expressao1, val direito1: Expressao1): Expressao1

fun avaliacao1(expressao1: Expressao1): Int =
   when (expressao1){
       is Numero1-> {
           println("Expressao com número: ${expressao1.valor1}")
           expressao1.valor1
       }
       is Soma1 -> {
           println("Soma das expressões: ${avaliacao1(expressao1.esquerdo1)} e ${avaliacao1(expressao1.direito1)}")
           avaliacao1(expressao1.esquerdo1) + avaliacao1(expressao1.direito1)
       }

       else-> {
           throw IllegalArgumentException("Expressao é desconhecida")
       }
   }

fun main(){
    val resultado = avaliacao1(Soma1(Soma1(Numero1(1),Numero1(2)),Numero1(4)))
    println(resultado)
}