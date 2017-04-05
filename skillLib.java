package gameRPG;


/**
 *
 * @author User
 */
public class skillLib {
        
        public String nameo;
        public boolean onCooldown, used;
        public int cooldown;
        
        public skillLib(){
            nameo = "lulzz";
        }
        
        public void updateSkills(){
            
            if(used){
                onCooldown = true;
                used = false;
            }
            
            if(cooldown == 0){
                onCooldown = false;
            }
        }
    
        public void setType(int t){
            if(t == 0){
                System.out.print("Skill 1");
            }else if(t == 1){
                System.out.print("Skill 2");
            }else if(t == 2){
                System.out.print("Skill 3");
            }
        }
}
