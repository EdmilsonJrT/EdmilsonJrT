class Pessoa (
    val nome: String,
    val idade: Int
    )
class Retangulo(val altura:Int, val largura: Int){
    val isQuadrado
        get() = altura == largura
}
fun main(){
    val retangulo: Retangulo = Retangulo(11,10)
    val pessoa1: Pessoa= Pessoa("Micael", 23)
    val pessoa2: Pessoa=Pessoa("Edmilson", 23)
    println("Pessoa1: ${pessoa1.nome}")
    println("Pessoa2: ${pessoa2.nome}")
    println(retangulo.isQuadrado)
}
