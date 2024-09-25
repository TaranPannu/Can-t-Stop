import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name) {
        super(name);  // Calling the constructor of the base class
        random = new Random();  // Initialize the Random instance
    }

    @Override
    public void makeMove() {
        // Computer makes a move by generating random values
        int move = random.nextInt(6) + 1;  // Simulates a dice roll (1-6)
        System.out.println(name + " (Computer) rolled a " + move);
        // Update score based on the move (for example)
        addScore(move);
    }
}
