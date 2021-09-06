package Model

class ProfessorTitular(var horasMonitoria: Int, nome: String, sobrenome: String, tempoCasa: Int, codigo: Int):
    Professor(nome, sobrenome, tempoCasa, codigo) {
}