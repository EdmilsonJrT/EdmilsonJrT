fun fizzBuzz(numer: Int) = when{
    numer % 15 == 0 -> "FizzBuzz  "
    numer % 3 == 0 -> "Fizz  "
    numer % 5 == 0 -> "Buzz  "
    else -> "$numer "
}

fun main(){
    for (num in 1..100){
        println(fizzBuzz(num))
    }
}