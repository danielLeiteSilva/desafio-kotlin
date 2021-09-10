package Model

abstract class Professor(var nome:String, var sobrenome: String, var tempoCasa: Int, var codigo: Int){

    override fun equals(other: Any?): Boolean {
        return (other is Professor && this.codigo == other.codigo)
    }
}