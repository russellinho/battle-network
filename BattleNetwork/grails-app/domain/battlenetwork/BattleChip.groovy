package battlenetwork

class BattleChip {

    String name;
    char element;
    int damage;
    boolean[][] spread = new boolean[3][3];

    static constraints = {
        name minSize: 0, maxSize: 20
        element blank: false
        damage minSize: 0
    }

}
