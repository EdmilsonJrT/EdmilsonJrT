fun obterMnemonica(cor: Cor)=
    when(cor){
        Cor.VERMELHO -> "Ver "
        Cor.AMARELO -> "alguém"
        Cor.VERDE -> " viver"
        Cor.AZUL -> " além é"
        Cor.LARANJA -> " legal"
    }
fun obterTemperatura(cor:Cor): String{
    return when(cor){
        Cor.VERMELHO,Cor.LARANJA,Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "Frio"

    }
}
fun main(){
    val mnemonica1= obterMnemonica(Cor.VERMELHO)
    val mnemonica2= obterMnemonica(Cor.AMARELO)
    val mnemonica3=obterMnemonica(Cor.VERDE)
    val mnemonica4= obterMnemonica(Cor.AZUL)
    val mnemonica5= obterMnemonica(Cor.LARANJA)
    val temperatura= obterTemperatura(Cor.VERDE)
    println(mnemonica1)
    println(mnemonica2)
    println(mnemonica3)
    println(mnemonica4)
    println(mnemonica5)
  println(temperatura)

}