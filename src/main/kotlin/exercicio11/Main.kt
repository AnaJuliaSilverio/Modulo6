package exercicio11

fun main() {
    println("Digite o preço de custo do produto: ")
    val custoProduto = readln().toDouble()
    println("Digite o acrescimo percentual: ")
    val acrescimo = readln().toDouble()
    println("O preço do produto deve ser: ${calculaValorVenda(custoProduto, acrescimo)}")
}

fun calculaValorVenda(custoProduto:Double,acrescimo:Double):Double{
    return custoProduto+(custoProduto*(acrescimo/100))
}