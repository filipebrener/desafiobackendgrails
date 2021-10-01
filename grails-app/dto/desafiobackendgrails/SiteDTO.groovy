package desafiobackendgrails

class SiteDTO{

    Long id
    String nome
    Autor autor

    SiteDTO(Site site){
        this.id = site.id
        this.nome = site.nome
        this.autor = site.autor
    }

}
