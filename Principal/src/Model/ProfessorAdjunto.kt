package Model

class ProfessorAdjunto(nome: String, sobrenome: String, tempoCasa: Int, codigo: Int, var horasMonitoria: Int):
    Professor(nome, sobrenome, tempoCasa, codigo) {

    override fun equals(other: Any?): Boolean {
        return (other is ProfessorAdjunto && this.codigo == other.codigo)
    }

    override fun toString(): String {
        return "${nome} ${sobrenome}"
    }
}