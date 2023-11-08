// 1. Crie uma função que receba um número inteiro e retorne verdadeiro se o número for par e falso caso contrário. 
fun ePar(numero: Int): Boolean {
    return numero % 2 == 0
}
fun main(args: Array<String>) {
    val numero = 11
    val ehPar = ePar(11)
    println("o numero $numero é par? $ehPar" )
}



// 2. Crie uma função que receba um array de inteiros e retorne o maior número. 
fun maior(numeros: IntArray): Int {
    var maior = Int.MIN_VALUE

    for (numero in numeros) {
        if (numero > maior) {
            maior = numero
        }
    }

    return maior
}
fun main(args: Array<String>){
    var inteiros = intArrayOf(10,5,4,3,2,7,8,9)
    var oMaior = maior(inteiros)
    println("o maior numero é $oMaior")
}

// 3. Crie uma classe chamada "Pessoa" com os atributos "nome" e "idade". 
//    Em seguida, crie uma lista de objetos "Pessoa" e ordene a lista em ordem alfabética pelo atributo "nome".  
class Pessoa(val nome: String, val idade: Int)
fun main(args: Array<String>){
    val pessoa1 = Pessoa("João da Silva", 28)
    val pessoa2 = Pessoa("Maria das Dores", 30)
    val pessoas = listOf(pessoa1, pessoa2)
    pessoas.sortBy { it.nome }
    println(pessoas)
}

// 4. Crie uma função que receba uma string e retorne verdadeiro se a string for um palíndromo (ou seja, pode ser lida da mesma forma de trás para frente). 
fun ehPalindromo(palavra: String): Boolean {
    val palavraInvertida = palavra.reversed()
    return palavra == palavraInvertida
}
fun main(args: Array<String>) {
    val palavra = "arara"
    val ehPalindromo = ehPalindromo(palavra)

    println("A palavra $palavra é um palíndromo? $ehPalindromo")
}



// 5. Implemente uma função lambda que retorne o maior valor entre dois números.
fun maior(n1: Int, n2: Int): Int {
    return if (n1 > n2) n1 else n2
}
fun main(args: Array<String>) {
    val maiorNumero = maior(10, 20)

    println("O maior número é $maiorNumero")
}



// 6. Crie uma classe "ContaBancaria" com os atributos "saldo" e "limite". 
//    Adicione um método chamado "saque" que recebe um valor como parâmetro e subtrai do saldo da conta. 
//    Se o valor do saque for maior que o saldo da conta, o método deve lançar uma exceção com a mensagem "Saldo insuficiente". 
//nao roda dá erro no playground
class ContaBancaria(var saldo: Int, val limite: Int) {
    fun saque(valor: Int) {
        if (valor > saldo + limite) {
            throw SaldoInsuficienteException("Saldo insuficiente")
        }

        saldo -= valor
    }
}
class SaldoInsuficienteException(mensagem: String) : Exception(mensagem)
fun main(args: Array<String>) {
    val conta = ContaBancaria(100, 50)

    try {
        conta.saque(150)
    } catch (e: SaldoInsuficienteException) {
        println(e.message)
    }
}



// 7. Crie uma função que receba uma lista de strings e retorne a string mais longa da lista. 
    fun maiorString(strings: List<String>): String {
        var maiorString = strings.first()

        for (string in strings) {
            if (string.length > maiorString.length) {
                maiorString = string
            }
        }

        return maiorString
    }
    fun main(args: Array<String>) {
        val strings = listOf("casa", "carro", "moto", "avião")
        val maiorString = maiorString(strings)
    
        println("A maior string é $maiorString")
    }


// 8. Crie uma classe "Funcionario" com os atributos "nome", "idade" e "salario". Crie uma função que receba uma lista de funcionários e retorne o funcionário com o maior salário. 
class Funcionario(val nome: String, val idade: Int, val salario: Double)
fun maiorSalario(funcionarios: List<Funcionario>): Funcionario? {
    return funcionarios.maxBy { it.salario }
}
fun main(args: Array<String>) {
    val funcionarios = listOf(
        Funcionario("João da Silva", 30, 2000.0),
        Funcionario("Maria das Dores", 25, 1500.0),
        Funcionario("Pedro Souza", 35, 3000.0)
    )

    val funcionarioComMaiorSalario = maiorSalario(funcionarios)

    println("O funcionário com o maior salário é $funcionarioComMaiorSalario")
}



// 9. Crie uma função que receba uma lista de números inteiros e retorne uma lista com os números em ordem crescente, sem usar o método de ordenação da linguagem.
fun bubbleSort(numeros: List<Int>): List<Int> {
    var troca = true

    while (troca) {
        troca = false

        for (i in 0 until numeros.size - 1) {
            if (numeros[i] > numeros[i + 1]) {
                val aux = numeros[i]
                numeros[i] = numeros[i + 1]
                numeros[i + 1] = aux
                troca = true
            }
        }
    }

    return numeros
}
fun main(args: Array<String>) {
    val numeros = listOf(5, 3, 2, 1, 4)

    val numerosOrdenados = bubbleSort(numeros)

    println(numerosOrdenados)
}



// 10. Crie uma classe "Triangulo" com os atributos "base" e "altura". Adicione um método chamado "area" que calcula e retorna a área do triângulo.
class Triangulo(val base: Double, val altura: Double) {

    fun area(): Double {
        return (base * altura) / 2
    }
}
fun main(args: Array<String>) {
    val triangulo = Triangulo(10.0, 5.0)

    val area = triangulo.area()

    println("A área do triângulo é $area")
}

// 11. Crie uma função que receba uma lista de strings e retorne uma lista com todas as strings que começam com a letra "A", em ordem alfabética.
fun stringsQueComecamComA(strings: List<String>): List<String> {
    val stringsComA = strings.filter { it.startsWith("A") }

    return stringsComA.sorted()
}
fun main(args: Array<String>) {
    val strings = listOf("casa", "carro", "moto", "avião")

    val stringsComA = stringsQueComecamComA(strings)

    println(stringsComA)
}




// 12. Utilize um mapa para representar um dicionário de palavras e suas traduções.
fun main(args: Array<String>) {
    val dicionario = mutableMapOf<String, String>()

    dicionario["casa"] = "house"
    dicionario["carro"] = "car"
    dicionario["moto"] = "motorcycle"
    dicionario["avião"] = "airplane"

    println(dicionario)
}

// 13. Crie uma função de ordem superior chamada operacaoMatematica que aceita dois números e uma função lambda. 
//     A função operacaoMatematica deve aplicar a função lambda aos dois números e retornar o resultado. 
//     Em seguida, crie algumas funções lambda para realizar operações matemáticas, como soma, subtração, multiplicação e divisão. 
//     Use a função de ordem superior para realizar essas operações com diferentes pares de números.
fun operacaoMatematica(x: Int, y: Int, f: (Int, Int) -> Int): Int {
    return f(x, y)
}
fun soma(x: Int, y: Int) = x + y
fun subtracao(x: Int, y: Int) = x - y
fun multiplicacao(x: Int, y: Int) = x * y
fun divisao(x: Int, y: Int) = x / y
fun main(args: Array<String>) {
    val resultadoSoma = operacaoMatematica(10, 20, soma)
    val resultadoSubtracao = operacaoMatematica(10, 20, subtracao)
    val resultadoMultiplicacao = operacaoMatematica(10, 20, multiplicacao)
    val resultadoDivisao = operacaoMatematica(10, 20, divisao)

    println("O resultado da soma é $resultadoSoma")
    println("O resultado da subtração é $resultadoSubtracao")
    println("O resultado da multiplicação é $resultadoMultiplicacao")
    println("O resultado da divisão é $resultadoDivisao")
}



//14. Crie uma função de extensão chamada isPalindromo para a classe String que verifica se a string é um palíndromo. A função deve ignorar espaços em branco e ser case-insensitive (não distinguir maiúsculas de minúsculas). Em seguida, use essa função para verificar se algumas palavras são palíndromos.
fun String.isPalindromo(): Boolean {
    return this.toLowerCase().replace(" ", "").reversed() == this.toLowerCase().replace(" ", "")
}
fun main(args: Array<String>) {
    println("A palavra 'arara' é um palíndromo: ${"arara".isPalindromo()}")
    println("A palavra 'amor' é um palíndromo: ${"amor".isPalindromo()}")
}

//15. Vamos criar um programa que utilize funções de alta ordem para operar em um array de números inteiros. Você deve criar funções de alta ordem para realizar as seguintes operações: filtrarPares: Uma função que filtra e retorna apenas os números pares do array; dobrarValores: Uma função que dobra o valor de cada número no array; somarValores: Uma função que calcula a soma de todos os valores no array. Em seguida, crie um array de números inteiros e utilize as funções de alta ordem para realizar essas operações.
fun main(args: Array<String>) {
    val numeros = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Filtra e retorna apenas os números pares do array
    val numerosPares = filtrarPares(numeros)
    println("Números pares: $numerosPares")

    // Dobra o valor de cada número no array
    val numerosDobrados = dobrarValores(numeros)
    println("Números dobrados: $numerosDobrados")

    // Calcula a soma de todos os valores no array
    val soma = somarValores(numeros)
    println("Soma: $soma")
}

fun filtrarPares(numeros: Array<Int>): List<Int> {
    return numeros.filter { it % 2 == 0 }
}

fun dobrarValores(numeros: Array<Int>): List<Int> {
    return numeros.map { it * 2 }
}

fun somarValores(numeros: Array<Int>): Int {
    return numeros.sum()
}


// 16. Crie um programa que utilize coroutines para realizar uma contagem regressiva de 5 a 1, com um intervalo de 1 segundo entre cada contagem. 
//     Após a contagem, imprima "Tempo esgotado!".
//nao roda dá erro no playground
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

fun main(args: Array<String>) {
    // Inicia a contagem regressiva
    CoroutineScope(Dispatchers.Default).launch {
        for (i in 5 downTo 1) {
            delay(1000L)

            withContext(Dispatchers.Main) {
                println(i)
            }
        }

        // Imprime "Tempo esgotado!"
        println("Tempo esgotado!")
    }
}

    
