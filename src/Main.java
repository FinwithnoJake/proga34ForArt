import AllCreatures.*;

public class Main {
    public static void main(String[] args) {

        Bear bear = new Bear();
        Nils nils = new Nils();
        Brumme brumme = new Brumme();
        Murre murre = new Murre();
        Fight fight = new Fight();
        MiniBearsFight mbFight = new MiniBearsFight();

        //get all types
        bear.getCreatureType();
        nils.getCreatureType();
        brumme.getBearType();
        murre.getBearType();

        //making text
        bear.todosmth();
        nils.todosmth();
        murre.act();
        brumme.act();
        mbFight.act();


        new FightResults.BecomingFree().Thinking();
        fight.WhileFighting();




    }
}