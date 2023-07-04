package exercicio2

fun main() {
    println("Digite seu nome: ")
    println(exibeNome(readln()))
}
fun exibeNome(nome:String):String{
    return "Meu nome é $nome"
}