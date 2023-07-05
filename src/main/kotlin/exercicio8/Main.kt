package exercicio8

fun main() {
    println("Digite seu nome: ")
    divideNome(readln())
}
fun divideNome(nome:String){
    var vetorNome = nome.split(" ")
    for (i in vetorNome.indices){
        println(vetorNome[i])
    }
}