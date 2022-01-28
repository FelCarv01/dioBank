package dio.felipe.diobank.testes

import dio.felipe.diobank.Gerente
import dio.felipe.diobank.testes.ImprimeRelatorioFuncionario as imprimeRelatorioFuncionario


fun main() {
    val joo = Gerente(
        nome = "Joo",
        cpf = "123.125.123-45",
        salario = 2120.00,
        senha = "senha123"
    )
    imprimeRelatorioFuncionario.imprime(joo)
    TesteAutenticacao().autentica(joo)

}
