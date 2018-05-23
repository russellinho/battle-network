package battlenetwork

import org.springframework.http.HttpStatus

class NaviController {

    def scaffold = Navi

//    def index() { }

    def create() {
        respond new Navi(params)
    }

    def save(Navi navi) {
        if (navi == null) {
            render status: HttpStatus.NOT_FOUND
            return
        }

        if (navi.hasErrors()) {
            respond navi.errors, view: 'create'
            return
        }

        navi.setName(navi.name + navi.SUFFIX);
        navi.save flush: true

        request.withFormat {
            form multipartForm { redirect navi }
            '*' {respond navi, status: HttpStatus.CREATED}
        }
    }

}
