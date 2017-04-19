package gameRPG;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class mainClass {
    
    private static List<playerUnit> units = new ArrayList<>();
    
    // Most everything in the main function is completely testing right now
    public static void main(String[] args) {
        playerUnit object1 = new playerUnit("Cody");
        playerUnit object2 = new playerUnit("Blake");
        playerUnit object3 = new playerUnit("Austin");
        playerUnit object4 = new playerUnit("Damian");
        
        units.add(object1);
        units.add(object2);
        units.add(object3);
        units.add(object4);
        
        object1.levelUp(0, 1);
        
        object2.levelUp(1, 1);
        object2.levelUp(1, 6);
        object2.levelUp(1, 6);
        
        object3.levelUp(2, 1);
        object3.levelUp(2, 6);
        
        object4.levelUp(3, 1);
        object4.levelUp(3, 6);
        object4.levelUp(3, 6);
        object4.levelUp(3, 6);
        
        // Test print statements
        System.out.println("\nUnit Name: "+object1.name);
        System.out.println("Health: "+object1.health);
        System.out.println("Attack: "+object1.dmg[0]);
        System.out.println("Block: "+object1.block);
        System.out.println("Speed: "+object1.speed);
        System.out.println("Dodge: "+object1.stats[6]+"\n");
        
        System.out.println("Unit Name: "+object2.name);
        System.out.println("Health: "+object2.health);
        System.out.println("Attack: "+object2.dmg[0]);
        System.out.println("Block: "+object2.block);
        System.out.println("Speed: "+object2.speed);
        System.out.println("Dodge: "+object2.stats[6]+"\n");
        
        System.out.println("Unit Name: "+object3.name);
        System.out.println("Health: "+object3.health);
        System.out.println("Attack: "+object3.dmg[0]);
        System.out.println("Block: "+object3.block);
        System.out.println("Speed: "+object3.speed);
        System.out.println("Dodge: "+object3.stats[6]+"\n");
        
        System.out.println("Unit Name: "+object4.name);
        System.out.println("Health: "+object4.health);
        System.out.println("Attack: "+object4.dmg[0]);
        System.out.println("Block: "+object4.block);
        System.out.println("Speed: "+object4.speed);
        System.out.println("Dodge: "+object4.stats[6]+"\n");
        
        detOrder();
    }
    
    public static void detOrder(){
        // Temporary Array for Turn Order
        playerUnit[] tempPls = new playerUnit[units.size()];
        
        // w = increments each iteration of the while loop
        // j = index of the fastest unit
        int w=0; int j=0;
        
        // While loop for running through Units List
        while(units.size() > 0){
            // Advanced for loop for determining largest speed value each pass
            for(playerUnit a: units){
                playerUnit fastest = new playerUnit("temp");
                fastest = units.get(j);
                if(a.speed > fastest.speed){
                    fastest = a;
                    j=units.indexOf(a);
                }
            }
            
            // Adds fastest unit to temp Array and removes them from Units List
            tempPls[w] = units.get(j);
            units.remove(j);
            j=0;
            
            w += 1;
        }
        
        System.out.println();
        
        // Test Prints out the Turn Order of Units
        for(playerUnit b: tempPls){
            System.out.println("Unit Name: "+b.name);
        }
    }
    
}
