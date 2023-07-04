package exercicio5

fun main() {
    println("Digite o primeiro valor: ")
    val valor1 = readln().toInt()
    println("Digite o segundo valor: ")
    val valor2 = readln().toInt()
    calculaResul(valor1, valor2)
}
fun calculaResul(valor1:Int,valor2:Int){
    println("A soma é ${valor1+valor2}")
    println("A subtração é ${valor1-valor2}")
    println("A multiplicação é ${valor1*valor2}")
    if (valor2==0) println("A divisão não pode ser concluida,pois o segundo valor é 0")
    else println("A divisão é ${valor1/valor2}")
}