package Model

class ProfessorAdjunto(var especialidade: String, nome: String, sobrenome: String, tempoCasa: Int, codigo: Int):
    Professor(nome, sobrenome, tempoCasa, codigo) {
}