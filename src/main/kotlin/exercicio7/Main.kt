package exercicio7

fun main() {
    println("Quantos alunos tem na sala: ")
    val numeroAlunos = readln().toInt()
    var contador = 0
    var soma= 0.0
    val array = DoubleArray(numeroAlunos)

    while (contador<+numeroAlunos){
        println("Digite a nota do aluno ${contador+1}")
        var valoRecebido = readln().toDouble()
        array[contador] = valoRecebido
        soma+=valoRecebido
        contador++
    }

    println("A média da turma é ${soma/numeroAlunos}")

}