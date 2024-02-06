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

    // Getter methods
    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getAttackPow() {
        return attackPow;
    }

    // Method to deduct health when attacked by another monster
    public void attackedBy(Monster m) {
        health -= m.getAttackPow();
        if (health < 0) {
            health = 0; // Ensure health doesn't go below 0
        }
    }

    // Method to heal the monster
    public void healed() {
        health += 8;
        if (health > 100) {
            health = 100; // Ensure health doesn't exceed 100
        }
    }

    public static void main(String[] args) {
        Monster m1 = new Monster("Pikachu", 10);
        Monster m2 = new Monster("Eevee", 15);
        m1.attackedBy(m2);
        m2.attackedBy(m1);
        m2.attackedBy(m1);
        m2.healed();
        System.out.println(m1.getName() + "'s current health is" + m1.getHealth()); //⇒ Pikachu’s current health is …
        System.out.println(m2.getName() + "'s current health is" + m2.getHealth()); //⇒ Eevee‘s current health is …

    }
}
