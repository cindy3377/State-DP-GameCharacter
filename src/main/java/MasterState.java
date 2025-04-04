public class MasterState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("You have reached Master level. No further training needed.");
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("You have reached Master level. No need to meditate.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("You have reached Master level. No need to fight.");
    }

    @Override
    public String getLevelName() {
        return "Master";
    }
}
