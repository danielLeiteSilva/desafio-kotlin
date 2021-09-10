package Model

class ProfessorTitular(nome: String, sobrenome: String, tempoCasa: Int, codigo: Int, var especialidade: String):
    Professor(nome, sobrenome, tempoCasa, codigo) {

    override fun equals(other: Any?): Boolean {
        return (other is ProfessorTitular && this.codigo == other.codigo)
    }

    override fun toString(): String {
        return "${nome} ${sobrenome}"
    }
}