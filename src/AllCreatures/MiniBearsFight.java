package AllCreatures;

public class MiniBearsFight extends MiniBear {

    @Override
    public String getBearType() {
        return MiniBears.MINIBEARSFIGHT.getBearType();
    }

    @Override
    public void act() {
        System.out.println(getBearType() + " started to hit each other.");
        System.out.println("They " + getBearType() + " rolled, floundered, bit, puffed and growled.");
    }
}
