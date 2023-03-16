import java.util.Scanner;

public class Character {
    private String name;
    private int age;
    private int sneak;
    private int strength;
    private int health;
    private int intelligence;

    public Character(String name, int age, int sneak, int strength, int health, int intelligence) {
        this.name = name;
        this.age = age;
        this.sneak = sneak;
        this.strength = strength;
        this.health = health;
        this.intelligence = intelligence;
    }

    public String chooseName() {
        return name;
    }
    public void charName(String name) {
        this.name = name;
    }
    public int chooseStrength() {
        return strength;
    }
    public void charStrength(int strength) {
        this.strength = strength;
    }
    public int chooseAge() {
        return age;
    }
    public void charAge(int age) {
        this.age = age;
    }
    public int chooseSneak() {
        return sneak;
    }
    public void charSneak(int sneak) {
        this.sneak = sneak;
    }
    public int health() {
        return health;
    }
    public void charHealth(int health) {
        this.health = health;
    }
    public int chooseIntelligence() {
        return intelligence;
    }
    public void charIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void sneaking() {
        System.out.println(this.name + " decides to sneak away from the bandits");
    }
    public void trapping() {
        System.out.println(this.name + " decides to set  a trap and catch the bandits off guard");
    }
    public void fighting() {
        System.out.println(this.name + " decides to stand their ground and fight the bandits");
    }
}


class NewChar {
    public static void main(String[] args) {
        // it would keep saying my scanner wasn't closed and this was the fix it said would help when i hovered over the yellow squigly line.
        try (Scanner scanner = new Scanner(System.in)) {
            //allowing user to choose how they want their character
            System.out.println("Character Creation");

            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Health (1-10): ");
            int health = scanner.nextInt();
            System.out.print("Sneak (1-10): ");
            int sneak = scanner.nextInt();
            System.out.print("Strength (1-10): ");
            int strength = scanner.nextInt();
            System.out.print("Intelligence (1-10): ");
            int intelligence = scanner.nextInt();

            Character Player = new Character(name, age, health, sneak, strength, intelligence);

            while (true) {
                System.out.println(Player.chooseName() + " is walking through a deserted town and decides to rest in a house. Right before falling asleep you hear a twig snap. You stand up and look out the window and see 3 bandits. What do you do?");
                System.out.println("Option 1: Sneak away from the bandits");
                System.out.println("Option 2: Stand your ground and fight the bandits");
                System.out.println("Option 3: Create a trap that will catch the bandit's off guard");

                int decision = scanner.nextInt();

                if (decision == 1) {
                    Player.fighting();
                    break;
                } else if (decision == 2) {
                    Player.sneaking();
                    break;
                } else if (decision == 3) {
                    Player.trapping();
                    break;
                } else {
                    System.out.print("Invalid choice");
                }
            }
        }
    }
}
