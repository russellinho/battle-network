package battlenetwork

class Navi {

    final SUFFIX = ".EXE";

    String name;
    int memory;
    short attack;
    short defense;
    short magicAttack;
    short magicDefense;
    short dexterity;
    short agility;

    static constraints = {
        name blank: false, nullable: false, size: 4..12
        memory minSize: 2, maxSize: 24
        attack minSize: 5
        defense minSize: 5
        magicAttack minSize: 5
        magicDefense minSize: 5
        dexterity minSize: 5
        agility minSize: 5
    }

    static hasMany = [
        chips: BattleChip
    ]

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
