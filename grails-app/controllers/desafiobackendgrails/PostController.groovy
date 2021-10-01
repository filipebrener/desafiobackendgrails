package desafiobackendgrails

import grails.converters.*
import java.util.stream.Collectors
import static org.springframework.http.HttpStatus.*

class PostController {

    PostService postService

    def index(String search){
        def result
        if(!search){
            result = postService.list()
        } else {
            search = "%" + search + "%"
            result = postService.findAllByTituloOrResumoLike(search,search)
        }
        def resultDTO= result.stream().sorted()
                .map({new PostDTO(it) })
                .peek({it.anularURL()})
                .peek({it.nullToZero()})
                .collect(Collectors.toList())
        response.status = 200
        render resultDTO as JSON
    }

    def clique(Long id){
        def result = postService.get(id)
        if(!result) {
            render status: NOT_FOUND
            return
        }
            def resultDTO = new PostDTO(result)
            resultDTO.nullToZero()
            response.status = 200
            render resultDTO as JSON
    }

}
