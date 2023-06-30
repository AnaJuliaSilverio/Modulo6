package exercicio2

fun main() {

    while (true){
        println("Digite um número: ")
        val valor = readln().toInt()
        if (valor<1 || valor>7) println("Digite um valor entre 1 e 7")
        else{
            when(valor) {
                1 -> println("Domingo")
                2 -> println("Segunda")
                3 -> println("Terça")
                4 -> println("Quarta")
                5 -> println("Quinta")
                6 -> println("Sexta")
                7 -> println("Sábado")
            }
            break
        }
    }
}