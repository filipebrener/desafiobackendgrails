package desafiobackendgrails

class UrlMappings {

    static mappings = {
        "/dev/All/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
    }
}
