package Model

abstract class Curso(
    var nome: String,
    var codigo: Int,
    var professorTitular: ProfessorTitular,
    var professorAdjunto: ProfessorAdjunto,
    var quantidadeMaximaAlunos: Int,
    var listaDeAlunos: MutableList<Aluno>
    ){

    fun adicionaAluno(aluno: Aluno): Boolean{
        if(quantidadeMaximaAlunos <= listaDeAlunos.size){
            listaDeAlunos.add(aluno)
            return true
        }else{
            return false
        }
    }
    // ver uma forma de excluir um aluno
    // Ver na parte F como adiconar matricula com data no construtor
    fun excluirAluno(aluno: Aluno){

    }
}