package dio.felipe.diobank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = /*receber da base de dados*/"1245senha" == senha
    override fun toString(): String = """
         Nome: $nome
        Cpf: $cpf
        ClienteTipo: ${clienteTipo.descricao}
        
    """.trimIndent()

}