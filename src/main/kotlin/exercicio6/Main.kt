package exercicio6

fun main() {
    println("Digite o tamanho do vetor: ")
    var vetor = retornaVetor(readln().toInt())
    println("O menor valor desse vetor é ${menorValor(vetor)}")
}
fun retornaVetor(tamanho:Int):IntArray{
    var array = IntArray(tamanho)
    for (i in 0 until tamanho){
        println("Digite o valor da posição ${i+1}: ")
        array[i] = readln().toInt()
    }
    return array
}
fun menorValor(array: IntArray):Int{
    var menor = array[0]
    for (i in 1 until array.size){
        if (menor>array[i]) menor = array[i]
    }
    return menor
}