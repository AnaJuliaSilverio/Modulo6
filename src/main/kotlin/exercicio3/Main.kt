package exercicio3

fun main() {
    println("Digite seu nome: ")
    val nome = readln()
    println("$nome, digite sua altura: ")
    var altura = readln().toDouble()
    if (altura>100) altura /= 100
    println("$nome, agora digite seu peso: ")
    val peso = readln().toDouble()
    println("$nome, seu IMC foi classificado em: ${calculoImc(peso,altura)}")

}
fun calculoImc(peso:Double,altura:Double):String{
    val imc = peso/(altura*altura)
    if (imc<18.5) return "Magreza"
    else if (imc>18.5 && imc<24.9) return "Normal"
    else if (imc>25 && imc<29.9) return "Sobrepeso"
    else if (imc>30 && imc<39.9) return "Obesidade"
    else return "Obesidade grave"
}
