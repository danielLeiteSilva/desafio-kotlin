package Model

class DigitalHouseManager(
    var listaDeAlunos: List<Aluno>,
    var listaDeProfessores: List<Professor>,
    var listaDeCursos: List<Curso>,
    var listaDeMatricula: List<Matricula>){

    fun registrarCurso(nomeCurso: String, codigoCurso: Int, quantidadeMaximaAlunos: Int){

    }

    fun excluirCurso(codigoCurso: Int){

    }

    fun registrarProfessorAdjunto(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int, quantidadeDeHoras: Int){

    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){

    }

    fun excluirProfessor(codigoProfessor: Int){

    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){

    }

    fun alocarProfessores(codigoCurso: Int,
                          codigoProfessorTitular: Int, codigoProfessorAdjunto:
                          Int){

    }

}