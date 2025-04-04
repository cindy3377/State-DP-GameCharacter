public class NoviceState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Training... (+10 XP)");
        character.addExperience(10);
        if (character.getExperience() >= 30) {
            System.out.println("Level up to Intermediate!");
            character.setState(new IntermediateState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("You can't meditate at Novice level.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("You can't fight at Novice level.");
    }

    @Override
    public String getLevelName() {
        return "Novice";
    }
}
