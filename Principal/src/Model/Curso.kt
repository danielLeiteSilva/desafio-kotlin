package Model

class Curso(var nome: String, var codigo: Int, var quantidadeMaximaAlunos: Int){

    var listaDeAlunos: MutableSet<Aluno> = mutableSetOf()
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null

    constructor(nome: String, codigo: Int, quantidadeMaximaAlunos: Int, listaDeAlunos: MutableSet<Aluno>, professorTitular: ProfessorTitular, professorAdjunto: ProfessorAdjunto
                ): this(nome, codigo, quantidadeMaximaAlunos){

        this.nome = nome
        this.codigo = codigo
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos
        this.listaDeAlunos = listaDeAlunos
        this.professorAdjunto = professorAdjunto
        this.professorTitular = professorTitular
    }

    fun adicionaAluno(aluno: Aluno): Boolean{
        if(quantidadeMaximaAlunos <= listaDeAlunos.size){
            this.listaDeAlunos.add(aluno)
            return true
        }else{
            println("Não foi possível matricular o aluno")
            return false
        }
    }

    fun excluirAluno(aluno: Aluno){
        listaDeAlunos.remove(aluno)
    }

    override fun equals(other: Any?): Boolean {
        return (other is Curso && this.codigo == other.codigo)
    }
}