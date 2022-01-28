package dio.felipe.diobank.testes

import dio.felipe.diobank.Cliente
import dio.felipe.diobank.ClienteTipo

fun main() {
    val maria = Cliente(
        nome = "Maria",
        cpf = "123.123.123-25",
        clienteTipo = ClienteTipo.PF,
        senha = "1245senha"
    )
    val josue = Cliente(
        nome = "Josue",
        cpf = "741.123.258-25",
        clienteTipo = ClienteTipo.PJ,
        senha = "12senha147"
    )

    println(maria)
    TesteAutenticacao().autentica(maria)
    println(josue)
    TesteAutenticacao().autentica(josue)

}