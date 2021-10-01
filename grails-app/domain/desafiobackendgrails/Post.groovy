package desafiobackendgrails

class Post implements Comparable<Post>{

    Integer cliques
    Date data_inclusao
    Date data_publicacao
    String resumo
    String titulo
    String url
    Integer votos_negativos
    Integer votos_positivos
    Boolean ativo
    Integer tentativas
    Long favoritos
    Long comentarios
    String thumbnail
    Site site

    static belongsTo = {
        site_id: Site
    }

    static mapping = {
        table "blog_post"
    }
    
    static constraints = {    
    }

    @Override
    int compareTo(Post o) {
        if(this.data_inclusao.before(o.data_inclusao)){
            return 1
        } else {
            return -1
        }
    }
}
