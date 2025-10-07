package AllCreatures;
import AllMoves.MiniBearMoves;

abstract class MiniBear implements MiniBearMoves{
    @Override
    public void fight(){
        System.out.println(getBearType() +  " starded fighting.");
    };

    @Override
    public void act() {
    };

    @Override
    public String getBearType() {return getBearType();}

    @Override
    public int hashCode(){
        return 0;
    }

}
