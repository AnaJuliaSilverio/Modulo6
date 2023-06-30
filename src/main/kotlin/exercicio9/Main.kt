package exercicio9

import kotlin.system.exitProcess

fun main() {
    println("Digite o primeiro valor: ")
    val primeiroValor = readln().toInt()
    println("Digite o segundo valor: ")
    val segundoValor = readln().toInt()
    val calculadora = Calculadora(primeiroValor,segundoValor)
    while (true){
        println("Qual operação deseja realizar? ")
        println("1-Somar números\n2-Subtrair números\n3-Multiplicar números\n4-Dividir números\n5-Sair")
        when(readln()){
            "1"-> println(calculadora.somar())
            "2"-> println(calculadora.subtrair())
            "3"-> println(calculadora.multiplicar())
            "4"-> println(calculadora.dividir())
            "5"-> exitProcess(0)
            else-> println("Opção inválida")
        }
        println()
    }

}