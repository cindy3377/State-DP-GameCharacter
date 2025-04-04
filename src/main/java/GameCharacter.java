public class GameCharacter {
    private String name;
    private int experience;
    private int health;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.experience = 0;
        this.health = 100;
        this.state = new NoviceState(); // Start at novice
    }

    public void train() {
        state.train(this);
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void addExperience(int points) {
        experience += points;
    }

    public void addHealth(int points) {
        health += points;
        if (health > 100) health = 100;
    }

    public void reduceHealth(int points) {
        health -= points;
        if (health < 0) health = 0;
    }

    public int getExperience() {
        return experience;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void printStatus() {
        System.out.println("\n--- Character Status ---");
        System.out.println("Name: " + name);
        System.out.println("Level: " + state.getLevelName());
        System.out.println("Experience: " + experience);
        System.out.println("Health: " + health);
    }
}
