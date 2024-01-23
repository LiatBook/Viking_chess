import java.util.Comparator;
import java.util.function.Predicate;
//comparator for the second part 2
public class Comperator2 implements Comparator<ConcretePiece> {

   //help to print if we have equals in tags
    private boolean isPlayerOneWin;

    public Comperator2(boolean isPlayerOneWin) {
        this.isPlayerOneWin = isPlayerOneWin;
    }


    @Override
    public int compare(ConcretePiece o1, ConcretePiece o2) {
        //compare between amount of kills
        if (o1.getKills() > o2.getKills()) {
            return 1;
        }
        //if thr number of kills are equels then we print in the order of tags
        if (o1.getKills() == o2.getKills()) {
            if (o1.tag < o2.tag) {
                return 1;
            }
            if (o1.tag == o2.tag) {
                if (isPlayerOneWin && (!o1.getOwner().isPlayerOne())) {
                    return -1;
                }
                return 1;
            }
        }
        return -1;
    }
}
