public class Battle

{
    public static String fight(Hero h, Monster m){
        int time = 1;
        int levelUpTimesChecker = h.currentLevel;
        while(time != 0){
            m.receiveAttack(h.attackRating);
            if(m.isDefeated()){
                h.receiveXP(m.xpValue);
                int levelUps = h.currentLevel - levelUpTimesChecker;
                h.healingPotions += m.goldValue / 3;
                time = 0;
                return h.name+" has defeated the "+m.type+" earning "+m.goldValue+" gold and "+ m.xpValue+" XP leveling up "+levelUps+" times.";
            }
            h.receiveAttack(m.attackRating);
            if(!h.hasHPRemaining()){
                if(h.healingPotions >0){
                    h.useHealingPotion();
                } else{
                    time = 0;
                    return "The " + m.type + " has defeated " +h.name+". Game over." ;
                }
            }
        }
        return "";
    }
    public static void main(String[] args){
        Monster mon = new Monster(); //remember the default is a goblin
        //A barbarian with 100 HP, 10 attack rating, 10 defense rating, and 10 potions
        Hero brb = new Hero("Barb the barbarian", 100, 10, 10, 10);
        //fight!
        String fightResult = Battle.fight(brb, mon);
        System.out.println(fightResult);
      }
    
}