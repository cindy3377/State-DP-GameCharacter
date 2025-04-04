import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your character's name: ");
        String name = scanner.nextLine();

        GameCharacter character = new GameCharacter(name);

        while (!(character.getState() instanceof MasterState)) {
            character.printStatus();
            System.out.println("\nChoose an action:");
            System.out.println("1. Train");
            if (character.getState() instanceof IntermediateState || character.getState() instanceof ExpertState)
                System.out.println("2. Meditate");
            if (character.getState() instanceof ExpertState)
                System.out.println("3. Fight");

            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    character.train();
                    break;
                case "2":
                    character.meditate();
                    break;
                case "3":
                    character.fight();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("\n🎉 Game Over! You've reached Master Level. 🎉");
        scanner.close();
    }
}
