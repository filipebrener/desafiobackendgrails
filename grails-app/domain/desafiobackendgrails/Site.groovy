package desafiobackendgrails

class Site {

    Boolean ativo
    String endereco
    String nome
    String rss
    String sobre
    Integer tentativas
    Date ultima_verificacao
    Integer posts_dia
    Autor autor

    static belongsTo = {
        autor_id: Autor
    }

    static mapping = {
        table "site"
    }

    static constraints = {
    }

}
