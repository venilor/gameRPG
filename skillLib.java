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
        
       // Method that updates skill cooldowns and availability
        public void updateSkills(){
            
            if(used){
                onCooldown = true;
                used = false;
            }
            
            if(cooldown == 0){
                onCooldown = false;
            }
        }
        
        // Test function, this will be where skill functions will be determined
        public void setType(int t){
            if(t == 0){
                System.out.println("Skill 1");
            }else if(t == 1){
                System.out.println("Skill 2");
            }else if(t == 2){
                System.out.println("Skill 3");
            }else if(t == 3){
                System.out.println("Skill 3");
            }
        }
}
