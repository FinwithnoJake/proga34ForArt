package AllCreatures;

public class Brumme extends MiniBear {

    @Override
    public String getBearType() {
        return MiniBears.BRUMME.getBearType();
    }

    @Override
    public void act() {
        System.out.println(getBearType() + " didn't sleep too.");
        System.out.println(getBearType() + " jumped on brother to take Nils");
    }
}
