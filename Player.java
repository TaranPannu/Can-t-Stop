// public enum Player {
//     player1, player2, player3, player4
// }
public abstract class Player {
    // Common fields
    protected String name;
    protected int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // Abstract method
    public abstract void makeMove();

    // Common methods
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
