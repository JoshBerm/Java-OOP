public class Monster
{
    public String type;
    public int hitPoints, attackRating, xpValue, goldValue;

    public Monster(String type, int hp, int attackR, int xp, int gold){
        this.type = type;
        hitPoints = hp;
        attackRating = attackR;
        xpValue = xp;
        goldValue = gold;

    }
    public Monster(){
        this.type = "goblin";
        hitPoints = 10;
        attackRating = 1;
        xpValue = 1;
        goldValue = 1;

    }
    public boolean isDefeated(){
        if(hitPoints <= 0){
            return true;
        } else{
            return false;
        }
    }
    public void receiveAttack(int incAttack){
        hitPoints -= incAttack;
    }
//     public static void main(String[] args){
//         Monster mon = new Monster(); //remember the default is a goblin
//         System.out.println(mon.isDefeated());
//         mon.receiveAttack(10);
//         System.out.println(mon.isDefeated());
//         System.out.println(mon.type);
//         System.out.println(mon.hitPoints);
//         System.out.println(mon.attackRating);
//         System.out.println(mon.xpValue);
//         System.out.println(mon.goldValue);
    
//       }
}