public class Monster {
    private final String name;
    private final int attackPow;
    private int health;

    // Constructor
    public Monster(String name, int attackPow) {
        this.name = name;
        this.attackPow = attackPow;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getAttackPow() {
        return attackPow;
    }

    public int getHealth() {
        return health;
    }

    public void attackedBy(Monster attacker) {
        this.health -= attacker.attackPow;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void healed() {
        this.health += 8;
    }

    public static void main(String[] args) {
        Monster m1 = new Monster("Pikachu", 10);
        Monster m2 = new Monster("Eevee", 15);
        m1.attackedBy(m2);
        m2.attackedBy(m1);
        m2.attackedBy(m1);
        m2.healed();
        System.out.println(m1.getName() + "'s current health is " + m1.getHealth()); //⇒ Pikachu’s current health is …
        System.out.println(m2.getName() + "'s current health is " + m2.getHealth()); //⇒ Eevee‘s current health is …

    }
}
