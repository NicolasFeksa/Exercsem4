/*
fun main() {

    println("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    val num2 =  readLine()!!.toInt()

    val resultado = somar(num1, num2)
    println("A soma dos números é: $resultado")
}

fun somar(num1: Int, num2: Int): Int {
    return num1 + num2
}
*/

//2
/*

fun numbPar(numero: Int): Boolean {
    return numero % 2 == 0
}
fun main() {
    println("Digite um número: ")
    var numero = readln()!!.toInt()

    if (numbPar(numero)) {
        println("$numero é par")
    } else {
        println("$numero é impar")
    }
}
*/
//3
/*
fun palin(str: String): Boolean {
    return str == str.reversed()

}
fun main() {
    println("Digite uma palavra: ")
    var palavra = readln()
    if (palin(palavra)) {
        println("A palavra é um palíndromo: ")
    } else {
        println("A palabra não é: ")
    }
}

*/
//4
/*
fun encontrarMaiorValor(array: IntArray): Int {
    var maiorValor = Int.MIN_VALUE
    for( valor in array) {
        if (maiorValor < valor) {
            maiorValor = valor
        }
    }
    return maiorValor
}

fun main() {
    val array = intArrayOf(10, 20, 30, 5, 15)
    val maiorValor = encontrarMaiorValor(array)
    println("O maior valor no array é: $maiorValor")
}
*/
//5
fun filtrarStrings(array: Array<String>): List<String>{
    return array.filter {it.length > 5}
}

fun main() {
    val arrayStr = arrayOf("Lucas", "Arthur", "Pão", "Cimento")
    val novaLista = filtrarStrings(arrayStr)
    println(novaLista)
}














