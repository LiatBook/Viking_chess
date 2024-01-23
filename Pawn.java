public class Pawn extends ConcretePiece{
    private String type; //choose the color of every Pawn
    private static final String PLAYER_ONE_TYPE = "♟"; //black pawn
    private static final String PLAYER_TWO_TYPE = "♙"; //white pawn
    private boolean a; //use for string to string




    public Pawn(ConcretePlayer owner, int tag) {
        super(owner,tag);
        if (owner.isPlayerOne()) {
            type = PLAYER_ONE_TYPE;
            a = true;
        }
        else{
            type = PLAYER_TWO_TYPE;
            a = false;
        }
    }



    @Override
    public String toString() {
        if(a)
        {
            return "D"+ tag +": ";
        }
        return "A"+ tag+": ";
    }


    @Override
    public String getType() {
        return type;
    }

    public String getName() {
        return this.toString();
    }
}

