package exercicio7

fun main() {
    println("Digite seu nome:")
    val nome = readln()
    println("Digite seu salário fixo:")
    val salario = readln().toDouble()
    println("Digite seu total de vendas:")
    val vendas = readln().toDouble()
    infoVendedor(nome,salario,vendas)
}

fun infoVendedor(nome:String,salario:Double,totalVendas:Double){
    var salarioFinal =salario+(totalVendas * 0.15)
    println("Nome:$nome\nSalario Fixo:$salario\nTotal de vendas:$totalVendas\nSalário com comissão:$salarioFinal")
}