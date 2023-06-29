package exercicio7

fun main() {
    println("Digite a base:")
    val base = readln().toDouble()
    println("Digite a altura:")
    val altura = readln().toDouble()
    val retangulo = Retangulo(base,altura)
    println("A área do seu retângulo é ${retangulo.area}")
}

