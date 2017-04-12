package gameRPG;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class mainClass {

    
    public static void main(String[] args) {
        playerUnit objecto = new playerUnit();
        objecto.levelUp(0);
        System.out.print("Health: "+objecto.health);
        System.out.print("\n"+objecto.skills.get(0).nameo);
    }
    
}
