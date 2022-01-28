package dio.felipe.diobank.testes

import dio.felipe.diobank.Funcionario

class ImprimeRelatorioFuncionario(funcionario: Funcionario) {
    companion object{
        fun imprime(funcionario: Funcionario)
        {
            println(
                funcionario.toString()
            )
        }

    }
}