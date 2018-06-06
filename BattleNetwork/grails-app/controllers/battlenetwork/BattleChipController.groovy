package battlenetwork

class BattleChipController {

    def scaffold = BattleChip

//    def index() { }

    def create() {
        respond new BattleChip(params)
    }

    def save(BattleChip battleChip) {
        if (battleChip == null) {
            render status: HttpStatus.NOT_FOUND
            return
        }

        if (battleChip.hasErrors()) {
            console.log("hello");
            respond battleChip.errors, view: 'create'
            return
        }

        battleChip.save flush: true

        request.withFormat {
            form multipartForm { redirect battleChip }
            '*' {respond battleChip, status: HttpStatus.CREATED}
        }
    }

}
