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
            switch(inv[0]){
                case 0:
                    // Code
                    inv[1] = 1;
                    inv[2] = 2;
                    inv[3] = 3;
                    inv[4] = 4;
                    inv[5] = o.wepMod;
                    break;
                case 1:
                    // Code
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
