package gameRPG;

/**
 *
 * @author User
 */
public class Equipment {
        public int inv[] = new int[3]; // Atk, Speed/weight modifier, Type, atkType
                                       // Types include: 0 = Sword, 1 = Axe, 2 = Spear, 3 = Dagger, 4 = Greatsword,
                                       // 5 = Greataxe, 6 = Halberd, 7 = Hammer, 8 = Greathammer, 9 = Shield,
                                       // 10 = Bow
        
                                       // atkTypes include: 0 = Slashing, 1 = Blunt, 2 = Piercing
        
        public Equipment(int wType){
            switch(inv[0]){
                case 0:
                    System.out.print("lul");
                    
            }
        }
}
