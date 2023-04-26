//1
/*
fun somar(vararg numeros: Int): Int {
     var soma = 0
    for(numero in numeros) {
            soma += numero
    }
    return soma
}
fun main() {
    val resultado = somar(1,2,3,4,5,6,)
    println(resultado)

}
 */
//2
/*
fun numeros(array: IntArray, n: Int):  List<Int> {
    return array.filter { it > n }
}
fun main() {
    val listanumeros = intArrayOf(2,3,4,6,7,3,23,7)
    var numeromaiorque4 = numeros(listanumeros, 4)
    println(numeromaiorque4)
}

 */
//3
/*
fun transformandoArray(transformFunc: (Int) -> Int, intArray: IntArray): List<Int> {
    return intArray.map { transformFunc(it) }
}

fun main() {
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val transformedArray = transformandoArray({ it + 1 }, intArray)
    println(transformedArray)

}

 */
//4
fun filterStringsStartingWithChar(arr: Array<String>, char: Char): List<String> {
    return arr.filter { it.startsWith(char) }
}
fun main() {
    val arr = arrayOf("banana", "abacaxi", "maçã", "laranja", "melancia")
    val char = 'm'

    val result = filterStringsStartingWithChar(arr, char)

    println(result)
}

