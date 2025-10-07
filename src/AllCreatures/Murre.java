package AllCreatures;

public class Murre extends MiniBear {

    @Override
    public String getBearType() {
        return MiniBears.MURRE.getBearType();
    }

    @Override
    public void act() {
        System.out.println(getBearType() + " jumped first.");
        System.out.println("For not long thinking " + getBearType() + " catched Nils and took him away");
    }
}
