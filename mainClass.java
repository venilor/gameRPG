package gameRPG;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author User
 */
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playerUnit objecto = new playerUnit();
        objecto.levelUp(0);
        System.out.print("Health: "+objecto.health);
        System.out.print("\n"+objecto.skills.get(0).nameo);
    }
    
}
