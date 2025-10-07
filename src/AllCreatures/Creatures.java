package AllCreatures;

import AllMoves.CreatureMoves;

public enum Creatures implements CreatureMoves {
    BEAR("Bear"),
    NILS("Nils"),
    MINIBEAR("MiniBear");

    private final String creatureType;
    Creatures(String creatureType){
        this.creatureType = creatureType;
    }

    @Override
    public void todosmth() {

    }
    @Override
    public String getCreatureType(){
        return creatureType;
    }

}
