package exercicio4

fun main() {
    println("Digite a base: ")
    val base = readln().toDouble()
    println("Digite a altura: ")
    val altura = readln().toDouble()
    calculaArea(base,altura)
}
fun calculaArea(base:Double,altura:Double){
   println("A area do retângulo é ${base*altura}")
}