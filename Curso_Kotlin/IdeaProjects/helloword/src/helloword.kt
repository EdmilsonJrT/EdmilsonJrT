fun main(){
    val nome= "World"
    println ("Hello $nome!!")
    println(max(19,10))
    println("Soma é : ${soma(10,20)}")
}
 fun max (a: Int, b: Int): Int = if(a>b) a else b
fun soma (a: Int, b: Int): Int  {
    return a+b
}