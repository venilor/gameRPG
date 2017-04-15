package gameRPG;

/**
 *
 * @author User
 */
public class statTree{
        
    public statTree(){
        // Contructor Stuff here
    }
    
    public void statMod(int i, playerUnit o){ // maybe??
        // Switch Statement to determine which stat node was chosen
        switch(i){
            case 1:
                o.block += 5;
                break;
                
            case 2:
            case 4:
            case 7:
                o.atkMod += 5;
                break;
                
            case 3:
            case 6:
            case 8:
                o.speedMod += 5;
                break;
                
            case 5:
            case 9:
                o.stats[6] += 5;
                break;
                
            default:
                System.out.print("ERROR WRONG STAT INDEX");
                break;
        }
    }
}
