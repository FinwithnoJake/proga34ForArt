package AllCreatures;

public class Nils extends Creature {

    @Override
    public String getCreatureType() {
        return Creatures.NILS.getCreatureType();
    }

    @Override
    public void todosmth() {
        System.out.println(getCreatureType() + " was depressed");
    }
}
