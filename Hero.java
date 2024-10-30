public class Hero 
{
    public String name;
    public int hitPointsRemaining, hitPointsMax, attackRating, defenseRating, currentXP, currentLevel, healingPotions;

    public Hero(String name, int hpMax, int ar, int dr, int potions){
        this.name = name;
        hitPointsMax = hpMax;
        attackRating = ar;
        defenseRating = dr;
        healingPotions = potions;
        currentXP = 0;
        currentLevel = 1;
        hitPointsRemaining = hitPointsMax;

    }
    public boolean hasHPRemaining(){
        if(hitPointsRemaining > 0){
            return true;
        }else{
            return false;
        }
    }
    public void receiveAttack(int incAttack){
        if(incAttack >= defenseRating){
            hitPointsRemaining -= (incAttack - defenseRating);
        }
    }
    public void receiveXP(int xpReceived){
        currentXP += xpReceived;
        while(currentXP >= 10){
            currentXP -= 10;
            currentLevel++;
            hitPointsMax += 5;
            hitPointsRemaining = hitPointsMax;
        }
        
    }
    public void useHealingPotion(){
        if(healingPotions > 0){
            hitPointsRemaining = hitPointsMax;
            healingPotions--;
        }
    
    }
    // public static void main(String[] args){
    //     Hero brb = new Hero("Barb the barbarian", 100, 10, 10, 10);
    //     System.out.println(brb.name);
    //     System.out.println(brb.hitPointsRemaining);
    //     brb.receiveAttack(10);
    //     System.out.println(brb.hitPointsRemaining);
    //     brb.receiveXP(10);
    //     System.out.println(brb.currentXP);
    //     System.out.println(brb.currentLevel);
    //     System.out.println(brb.hitPointsMax);
    //     brb.useHealingPotion();
    //     brb.receiveAttack(20);
    //     System.out.println(brb.hitPointsRemaining);
    // }
}