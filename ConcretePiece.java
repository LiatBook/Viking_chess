import java.util.ArrayList;
import java.util.List;

public abstract class ConcretePiece implements Piece {
    //number of player
    protected int tag;
    //how is owner the game
    private final ConcretePlayer owner;
    //how much steps  player do
    int steps;
    //how much squares  player do
    int squares;
    //arreylist of steps
    protected ArrayList<Position> stepsArr = new ArrayList<>();
    //how much kills  player do
    private int kills;

   //constructor
    public ConcretePiece(ConcretePlayer owner, int tag) {
        this.owner = owner;
        this.tag = tag;
    }

    public int getSquares() {
        return squares;
    }

    public void setSteps() {
        this.steps++;
    }

    public int getSteps() {
        return steps;
    }

    public List<Position> getStepsList() {
        return stepsArr;
    }


    public void setKills() {
        this.kills++;
    }

    public int getKills() {
        return kills;
    }

    @Override
    public Player getOwner() {
        return owner;
    }

    public void setSquares(int i) {
        this.squares = i;
    }


}
