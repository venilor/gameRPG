/**
 *
 * @author User
 */
package gameRPG;

import java.util.ArrayList;
import java.util.List;



public class playerUnit {
        public String name;
        public int level, health, speed, pos, lastI;
        public double exp;
        public int stats[] = new int[5]; // [str,dex,vit,int,wis,lck]
        private Equipment equipObj[] = new Equipment[5];
        private statTree statObj = new statTree();
        public List<skillLib> skills = new ArrayList<>();
        
        // Constructor Parameters still to be considered
        public playerUnit(){
            
            for(int i = 0; i < 5; i++){
                stats[i] = 7;
            }
            
            speed = stats[1]/2;
            health = stats[2]*5;
            level = 1;
            exp = 0;
        }
        
        public void levelUp(int s){
            learnSkill(s);
            health += 10;
            level += 1;
        }
        
        public void learnSkill(int s){
            
            skills.add(new skillLib());
            lastI = skills.size()-1;
            skills.get(lastI).setType(s);
        }
        
        public void statUP(){
            
        }
}
