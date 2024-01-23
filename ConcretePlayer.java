public class ConcretePlayer implements Player {

    //true-if player one
    private boolean isPlayerOne;
    //numbers of wines
    private int wins;
//constructor
    public ConcretePlayer(boolean isPlayerOne) {
        this.isPlayerOne = isPlayerOne;
        this.wins = 0;
    }

    //set the number of wines by group
    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public boolean isPlayerOne() {
        return isPlayerOne;
    }

    @Override
    public int getWins() {
        return wins;
    }
}
