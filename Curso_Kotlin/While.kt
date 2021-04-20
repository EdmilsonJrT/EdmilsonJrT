fun main(){
    var temperatura: Int
    var somatorio: Int = 0
    var quantidade: Int = 0

    do{
        println("Digite uma temperatura (ou 999 para sair):")
        temperatura= readLine()!!.toInt()
        if (temperatura !=999){
            somatorio += temperatura
            quantidade++
        }
    }while (temperatura!= 999)
    println("A media das temperaturas é = ${somatorio/quantidade}")
}