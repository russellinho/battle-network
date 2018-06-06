package battlenetwork

class BattleChip {

    String name;
    String element;
    int damage;
    //boolean[][] spread = new boolean[3][3];

    static constraints = {
        name size: 3..20
        element nullable: false, inList: ["Fire", "Water", "Electric"]
        damage minSize: 0
    }

}
