package Model
//Classe responsável por gerenciar o serviço
class DigitalHouseManager(
    var listaDeAlunos: MutableSet<Aluno>,
    var listaDeProfessores: MutableSet<Professor>,
    var listaDeCursos: MutableSet<Curso>,
    var listaDeMatricula: MutableSet<Matricula>){


    fun registrarCurso(nomeCurso: String, codigoCurso: Int, quantidadeMaximaAlunos: Int){
        try {
            listaDeCursos.add(Curso(nomeCurso, codigoCurso, quantidadeMaximaAlunos))
            println("Curso registrado com sucesso!")
        }catch (error: Exception){
            println("Houve um erro ao registrar o curso $error")
        }
    }


    fun excluirCurso(codigoCurso: Int){
        try {
            listaDeCursos.forEach{ curso ->
                if(curso.codigo == codigoCurso){
                    listaDeCursos.remove(curso)
                }
            }
        }catch (error: Exception){
            println("Error para excluir o curso $error")
        }

    }


    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        try {
            val tempoDeCasaAdjunto = 0
            listaDeProfessores.add(ProfessorAdjunto(nome, sobrenome, tempoDeCasaAdjunto, codigoProfessor,  quantidadeDeHoras))
            println("Professor Adjunto registrado com sucesso!")
        }catch (error: Exception){
            println("Não foi possível adicionar um professor adjunto $error")
        }

    }


    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        try {
            val tempoDeCasaTitular = 0
            listaDeProfessores.add(ProfessorTitular(nome, sobrenome, tempoDeCasaTitular, codigoProfessor, especialidade))
            println("Professor Titular registrado com sucesso!")
        }catch (error: Exception){
            println("Não foi possível adicionar um professor titular $error")
        }

    }

    fun excluirProfessor(codigoProfessor: Int){
        try {
            var professor: Professor? = listaDeProfessores.find {
                it.codigo == codigoProfessor
            }
            if(professor != null){
                listaDeProfessores.remove(professor)
            }
        }catch (error: Exception){
            println("Não foi possível excluir o professor $error")
        }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoDoAluno: Int){
        try {
            listaDeAlunos.add(Aluno(nome, sobrenome, codigoDoAluno))
            println("Aluno registrado com sucesso!")
        }catch (error: Exception){
            println("Não foi possível registrar um aluno $error")
        }
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        try {
            var cursoMatricula: Curso? = listaDeCursos.find {
                it.codigo == codigoCurso
            }
            var alunoMatricula: Aluno? = listaDeAlunos.find {
                it.codigo == codigoAluno
            }
            if(cursoMatricula != null && alunoMatricula != null){
                var resultadoMatricula = cursoMatricula.adicionaAluno(alunoMatricula)
                if(resultadoMatricula){
                    listaDeMatricula.add(Matricula(alunoMatricula, cursoMatricula))
                    println("Aluno matriculado com sucesso!")
                }else{
                    println("Não foi possível matricular o aluno")
                }
            }
        }catch (error: Exception){
            println("Não foi possível matricular um aluno $error")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        try {
            var professorT: Professor? = listaDeProfessores.find {
                it.codigo == codigoProfessorAdjunto
            }
            var professorA: Professor? = listaDeProfessores.find {
                    it.codigo == codigoProfessorTitular
                    && it.hashCode() != professorT.hashCode()
            }
            if (professorA != null) {
                if(professorT != null){
                    var cursoAlocar: Curso? = listaDeCursos.find {
                        it.codigo == codigoCurso
                    }
                    if(cursoAlocar != null){
                        cursoAlocar.professorTitular = professorT as ProfessorTitular?
                        cursoAlocar.professorAdjunto = professorA as ProfessorAdjunto?
                        println("Professores alocados com sucesso!")
                    }
                }
            }
        }catch (error: Exception){
            println("Houve erro ao alocar os professores $error")
        }
    }
}