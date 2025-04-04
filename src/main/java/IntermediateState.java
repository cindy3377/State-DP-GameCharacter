public class IntermediateState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Training... (+15 XP)");
        character.addExperience(15);
        if (character.getExperience() >= 70) {
            System.out.println("Level up to Expert!");
            character.setState(new ExpertState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Meditating... (+10 HP)");
        character.addHealth(10);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("You can't fight at Intermediate level.");
    }

    @Override
    public String getLevelName() {
        return "Intermediate";
    }
}
