package gameRPG;

/**
 *
 * @author User
 */
public class Equipment {
        public int inv[] = new int[6]; // Type, Atk, Speed/weight modifier, atkType, Accuracy, Unit Weapon Modifier
                                       // Types include: 0 = Sword, 1 = Axe, 2 = Spear, 3 = Dagger, 4 = Greatsword,
                                       // 5 = Greataxe, 6 = Halberd, 7 = Hammer, 8 = Greathammer, 9 = Shield,
                                       // 10 = Bow
        
                                       // atkTypes include: 0 = Slashing, 1 = Blunt, 2 = Piercing
                
        public Equipment(int wType, playerUnit o){
            // Determines item info based on type
            switch(wType){
                case 0:
                    // Bronze Sword
                    inv[0] = 0;
                    inv[1] = 4;
                    inv[2] = 7;
                    inv[3] = 0;
                    inv[4] = 95;
                    inv[5] = o.wepMod;
                    break;
                case 9:
                    // Wooden Shield
                    inv[0] = 9;
                    inv[1] = 5;
                    inv[2] = -5;
                    inv[3] = 1;
                    inv[5] = o.blockMod;
                    break;
                case 2:
                    // Code
                    break;
                case 3:
                    // Code
                    break;
            }
        }
}
