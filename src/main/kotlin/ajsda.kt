import kotlin.math.sqrt
import kotlin.math.pow
fun main() {
    print("Digite o primeiro número: ")
    val numero1 = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val numero2 = readLine()!!.toDouble()

    val adicao = somar(numero1, numero2)
    val subtracao = subtrair(numero1, numero2)
    val multiplicacao = multiplicar(numero1, numero2)
    val divisao = dividir(numero1, numero2)
    val raizQuadrada1 = raizQuadrada(numero1)
    val raizQuadrada2 = raizQuadrada(numero2)
    val potencia = elevarAoQuadrado(numero1, numero2)

    println("Adição: $adicao")
    println("Subtração: $subtracao")
    println("Multiplicação: $multiplicacao")
    println("Divisão: $divisao")
    println("Raiz quadrada do primeiro número: $raizQuadrada1")
    println("Raiz quadrada do segundo número: $raizQuadrada2")
    println("Potência: $potencia")
}
fun somar(numero1: Double, numero2: Double): Double {
    return numero1 + numero2
}

fun subtrair(numero1: Double, numero2: Double): Double {
    return numero1 - numero2
}

fun multiplicar(numero1: Double, numero2: Double): Double {
    return numero1 * numero2
}

fun dividir(numero1: Double, numero2: Double): Double {
    return numero1 / numero2
}

fun raizQuadrada(numero: Double): Double {
    return sqrt(numero)
}

fun elevarAoQuadrado(numero1: Double, numero2: Double): Double {
    return numero1.pow(numero2)
}
