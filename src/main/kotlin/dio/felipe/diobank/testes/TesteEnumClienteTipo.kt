package dio.felipe.diobank.testes

import dio.felipe.diobank.ClienteTipo.*

fun main() {
    values().forEach { it ->
        println("${it.name} - ${it.descricao}")
    }

}