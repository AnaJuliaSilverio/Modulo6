package exercicio8

fun main() {
    println("Digite o valor de y:")
    var y = readln().toInt()
    println("Digite o valor de x:")
    var x = readln().toInt()
    val temp = y
    y=x
    x=temp
    println("O valor de Y agora é $y e o de X agora é $x")
}

