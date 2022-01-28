package dio.felipe.diobank

data class Banco(
    val nome: String,
    val numero: Int
){
    fun info() = "instituicao: $nome identificacao: $numero"
}
