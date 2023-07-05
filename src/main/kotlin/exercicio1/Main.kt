package exercicio1

fun main() {
    println("Digite o primeiro valor: ")
    val valor1 = readln().toInt()
    println("Digite o segundo valor: ")
    val valor2 = readln().toInt()
    println("A soma entre os valores é ${calculaSoma(valor1,valor2)}")

}
fun calculaSoma(valor1:Int,valor2: Int):Int{
    val inicio = minOf(valor1,valor2)
    val fim = maxOf(valor1,valor2)
    var soma = 0
    for (i in inicio .. fim){
        if (i%13!=0)soma+=i
    }
    return soma
}
