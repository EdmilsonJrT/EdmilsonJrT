import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(){
    try {
        println(porcentagem(101))
    }catch (e: IllegalArgumentException){
        println(e.message)
    }
    println(lerIdade())
}

fun porcentagem(nume: Int): String{
  return if (nume in 1..100){
      "$nume%"
  } else {
      throw IllegalArgumentException("O numero deve estar entre 1 e 100")
  }
}
fun lerIdade(): Int? {
   val reader = FileReader(File("src/idade.txt"))
    val buffer = BufferedReader(reader)
    try {
        val nmr = buffer.readLine()
        return Integer.parseInt(nmr)
    }catch (e: NumberFormatException){
        return null
    } finally {
        buffer.close()
    }
}