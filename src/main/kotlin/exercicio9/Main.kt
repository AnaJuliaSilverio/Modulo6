package exercicio9

fun main() {
    println("Quantos funcionários tem na empresa? ")
    var funcionarios = Funcionario()
    funcionarios.qtdFuncionario = readln().toInt()
    funcionarios.inserirFuncionarios()
    funcionarios.infoFerias()
}