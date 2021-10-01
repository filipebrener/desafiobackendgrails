package desafiobackendgrails

import java.text.SimpleDateFormat

class PostDTO{

    Long id
    String titulo
    String resumo
    Integer cliques
    String data_inclusao
    String data_publicacao
    Integer votos_positivos
    Integer votos_negativos
    Long favoritos
    Long comentarios
    String url
    SiteDTO blog
    String thumbnail

    PostDTO(Post post){
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm")
        this.id = post.id
        this.titulo = post.titulo
        this.resumo = post.resumo
        this.cliques = post.cliques
        this.data_inclusao = formater.format(post.data_inclusao)
        this.data_publicacao = formater.format(post.data_publicacao)
        this.votos_positivos = post.votos_positivos
        this.votos_negativos = post.votos_negativos
        this.favoritos = post.favoritos
        this.comentarios = post.comentarios
        this.url = post.url
        this.blog = new SiteDTO(post.site)
        this.thumbnail = post.thumbnail
    }

    def anularURL(){
        this.url = null;
    }

    def nullToZero(){
        if (! this.comentarios){
            this.comentarios = 0;
        }
        if(! this.favoritos){
            this.favoritos = 0;
        }
    }

}
