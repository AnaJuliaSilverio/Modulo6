package exercicio3

class Caixa(private var qtdProduto:Int) {
    private var produtos = DoubleArray(qtdProduto)
    private var soma = 0.0
    var precoTotal = ""
        get() = String.format("O valor total a ser pago é de R$ %.2f",soma)

    fun adicionarPreco(){
        for (i in 0 until qtdProduto){
            println("Digite o preço do produto ${i+1}")
            produtos[i]= readln().toDouble()
            soma +=produtos[i]
        }
    }

}