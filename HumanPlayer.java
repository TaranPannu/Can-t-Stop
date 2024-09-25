public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);  // Calling the constructor of the base class
    }

    @Override
    public void makeMove() {
        // In a real game, you would take input from the user (e.g., via the GUI)
        System.out.println(name + " is making a move...");
        // Example placeholder for player input
    }
}
