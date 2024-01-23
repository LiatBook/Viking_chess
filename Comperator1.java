import java.util.Comparator;
//comparator for the second part 1
public class Comperator1 implements Comparator<ConcretePiece> {



    public Comperator1(){
    }


    @Override
    public int compare(ConcretePiece o1, ConcretePiece o2) {
        //compare between amount of steps
        if (o1.stepsArr.size() > o2.stepsArr.size()) {
            return 1;
        }
        //if the pawn/king has the same moves
        //we want to print how has minimal tag between thr two
        if(o1.stepsArr.size() == o2.stepsArr.size()){
            if(o1.tag > o2.tag){
                return 1;
            }
            return -1;
        }
        return -1;
    }
}
