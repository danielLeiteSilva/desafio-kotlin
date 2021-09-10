import Model.DigitalHouseManager

fun main(){

    val manager = DigitalHouseManager(mutableSetOf(), mutableSetOf(), mutableSetOf(), mutableSetOf())


    //Professores Titulares
    manager.registrarProfessorTitular("Rogerio", "Santos", 1, "Android")
    manager.registrarProfessorTitular("Maria", "Angela", 3, "Full Stack")


    //Professores Adjuntos
    manager.registrarProfessorAdjunto("Rosana", "Almeira", 1, 3)
    manager.registrarProfessorAdjunto("Alan", "jose", 4, 8)


    //Cursos
    manager.registrarCurso("Full Stack", 1, 30)
    manager.registrarCurso("Android", 2, 30)

    //Alocar
    manager.alocarProfessores(1, 1, 1)

    //Matricular dois alunos Fullstack
    manager.registrarAluno("Marcos", "Oliveira", 1)
    manager.registrarAluno("Junior", "Santos", 2)

    manager.matricularAluno(1, 1)
    manager.matricularAluno(2, 1)

    //Matricular alunos curso android
    manager.registrarAluno("Marcos", "Oliveira", 1)
    manager.registrarAluno("Junior", "Santos", 2)
    manager.registrarAluno("Caroline", "Vieira", 3)

    manager.matricularAluno(1, 2)
    manager.matricularAluno(2, 2)
    manager.matricularAluno(3, 2)
}