package desafiobackendgrails

class Autor {

    String nome
    static mapping = {
        table 'autor'
    }

    static constraints = {
        version false
    }
}
