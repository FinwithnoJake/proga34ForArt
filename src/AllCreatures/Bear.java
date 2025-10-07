package AllCreatures;

public class Bear extends Creature {

    @Override
    public String getCreatureType() {
        return Creatures.BEAR.getCreatureType();
    }

    @Override
    public void todosmth() {
        System.out.println(getCreatureType() + " push Nils to her children.");
    }

}
