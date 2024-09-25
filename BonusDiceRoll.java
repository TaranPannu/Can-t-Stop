// Base class
public class DiceRoll {
    protected int die1;
    protected int die2;

    public void rollDice() {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

    public int getTotal() {
        return die1 + die2;
    }
}

// Derived class (inherits from DiceRoll)
public class BonusDiceRoll extends DiceRoll {
    private int die3;

    // Overriding rollDice to add an extra die
    @Override
    public void rollDice() {
        super.rollDice(); // Calls DiceRoll's rollDice() method
        die3 = (int)(Math.random() * 6) + 1;
    }

    // Overriding getTotal to include the third die
    @Override
    public int getTotal() {
        return die1 + die2 + die3;
    }
}
