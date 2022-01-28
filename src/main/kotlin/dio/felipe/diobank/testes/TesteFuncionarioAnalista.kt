package dio.felipe.diobank.testes

import dio.felipe.diobank.Analista
import dio.felipe.diobank.testes.ImprimeRelatorioFuncionario as imprimeRelatorioFuncionario

fun main() {
    val doe = Analista(
        nome = "Doe",
        cpf = "123.125.123-45",
        salario = 2120.00
    )
    imprimeRelatorioFuncionario.imprime(doe)
}
