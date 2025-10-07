import AllCreatures.Creature;
import AllCreatures.Creatures;
import AllExeptions.*;

import java.util.Random;

public class FightResults extends Creature {

    @Override
    public String getCreatureType(){return Creatures.MINIBEAR.getCreatureType();};
    @Override
    public void todosmth() {
        System.out.println(getCreatureType() + " fighted");
    }
    private static boolean isAlive = false;

    public static void life() throws KillException {
        Random random = new Random();
        if (random.nextBoolean()) {
            throw new KillException("Brumme killed Murre!");
        } else {
            isAlive = true;
            System.out.println("all ends not bad");
        }
    }

    public static boolean isAlive() {
        return isAlive;
    }

    public static void thinkaboutRun() {
        if (!isAlive()) {
            throw new RunException("Nils has no way to run");
        }
        System.out.println("Nils can try to escape");
    }

    static class BecomingFree {
        public void Thinking() {
            try {
                thinkaboutRun();
                System.out.println("Nils is thinking");
            } catch (RunException e) {
                System.out.println("Unfortunately " + e.getMessage());
            }
        }
    }

}
