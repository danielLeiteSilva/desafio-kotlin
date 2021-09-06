package Model

abstract class Curso(
    var nome: String,
    var codigo: Int,
    var professorTitular: ProfessorTitular,
    var professorAdjunto: ProfessorAdjunto,
    var quantidadeMaximaAlunos: Int,
    var listaDeAlunos: List<Aluno>
    )