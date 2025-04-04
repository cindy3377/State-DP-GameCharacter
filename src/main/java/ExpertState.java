public class ExpertState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Training... (+20 XP)");
        character.addExperience(20);
        checkLevelUp(character);
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Meditating... (+15 HP)");
        character.addHealth(15);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Fighting... (-20 HP, +30 XP)");
        character.reduceHealth(20);
        character.addExperience(30);
        checkLevelUp(character);
    }

    private void checkLevelUp(GameCharacter character) {
        if (character.getExperience() >= 120) {
            System.out.println("Congratulations! You've reached Master level!");
            character.setState(new MasterState());
        }
    }

    @Override
    public String getLevelName() {
        return "Expert";
    }
}
