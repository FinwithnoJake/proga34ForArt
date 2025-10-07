import AllExeptions.KillException;
import AllExeptions.RunException;
import AllCreatures.*;

public class Fight {
    Brumme brumme = new Brumme();
    Murre murre = new Murre();

    public void WhileFighting() {
        try {
            FightResults.life();
            FightResults.thinkaboutRun();
            System.out.println("everyone calmed down");
        } catch (RunException | KillException e) {
            System.out.println("Jesus, " + e.getMessage() + " eweryone is so angry");
        }
    }

}



//creating all people
//add play
//right por'adok
//EXEPTIONS!!!!!!!
//po suti svojej - main, no hoteloc' nemnogo povij'obivatc'a