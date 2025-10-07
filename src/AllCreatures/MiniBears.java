package AllCreatures;
import AllMoves.MiniBearMoves;

public enum MiniBears implements MiniBearMoves{
    BRUMME("Brumme"),
    MURRE("Murre"),
    MINIBEARSFIGHT ("Both");

    private final String bearType;
    MiniBears(String bearType){
        this.bearType = bearType;
    }

    public String getBearType(){
        return bearType;
    }

    @Override
    public void fight() {

    };
    @Override
    public void act(){};
}
