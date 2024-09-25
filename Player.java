// public enum Player {
//     player1, player2, player3, player4
// }
public abstract class Player {
    protected String name;
    protected int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeMove();

    // Common methods for both player types
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }
}

