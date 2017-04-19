/**
 *
 * @author User
 */
package gameRPG;

import java.util.ArrayList;
import java.util.List;



public class playerUnit {
        public String name;
        public int level, health, healthMod, speed, speedMod, pos, lastI, atkRate = 100;
        public int dmg[] = new int[2]; // [Damage, Damage Type]
        public int wepMod=0, block, tempBlock, blockMod, atkMod;
        public boolean turnStart;
        public double exp;
        public int stats[] = new int[7]; // [str,dex,vit,int,wis,lck,evd]
        private Equipment equipObj[] = new Equipment[5];
        private statTree statObj = new statTree();
        public List<skillLib> skills = new ArrayList<>();
        
        // Constructor Parameters still to be considered
        public playerUnit(String n){
            
            for(int i = 0; i < 7; i++){
                stats[i] = 7;
            }
            
            name = n;
            
            speed = stats[1]/2;
            health = stats[2]*5;
            level = 1;
            exp = 0;
            
            // 0 = Main Hand    1 = Offhand
            equipObj[0] = new Equipment(0,this);
            equipObj[1] = new Equipment(9,this);
        }
        
        // Update Methods to change values depending on modifiers or stats
        public void updateAtkRate(){
            if(stats[1] >= 10){
                atkRate += (stats[1] - 10);
            }
        }
        
        public void updateSpeed(){
            speed = stats[1]/2 + speedMod + equipObj[0].inv[2] + equipObj[1].inv[2];
        }
        
        public void updateHealth(){
            health = stats[2]*5 + healthMod;
        }
        
        public void updateDmg(){
            dmg[0] = equipObj[0].inv[1] + equipObj[0].inv[5] + atkMod;
            dmg[1] = equipObj[0].inv[3];
        }
        
        public void updateBlock(){
            block = equipObj[1].inv[1] + equipObj[1].inv[5];
        }
        
        // Method that recharges block at the end of a turn or after a hit
        public void chargeBlock(int blockDamage){
            if(turnStart == true){
                tempBlock = block;
            }else{
                tempBlock += blockDamage/2;
            }
        }
        
        // Method that calls multiple methods to level up character
        // Parameeters are the Skill index and the Stat index for the trees
        public void levelUp(int sk, int st){
            learnSkill(sk);
            statObj.statMod(st, this);
            updateSpeed();
            updateHealth();
            updateDmg();
            health += 10;
            level += 1;
        }
        
        // Method for usability that takes the Skill index and adds to the list
        // of skills
        public void learnSkill(int s){
            
            skills.add(new skillLib());
            lastI = skills.size()-1;
            skills.get(lastI).setType(s);
        }
}
