/**
 * Subclass of MovieRobot HAL9000 that can fly, is not autonomous
 * and is not teleoperated with a catchphrase.
 */
public class HAL9000 extends MovieRobot {
   /** Parameterized constructor
    * @param serialNumber true
    * @param isAutonomous false
    * @param isTeleoperated false
    * @param catchphrase I can't let you do that Dave.
    */
   public HAL9000 (int serialNumber, boolean isAutonomous, boolean isTeleoperated){
    super(serialNumber, true, false, false, "I can't let you do that Dave.");
   }
   /** Overriden canFly method as HAL9000 can fly
    * 
    * @returns true
    */
   @Override
   public boolean canFly(){
    return true;
   }
   /** Overriden isAutonomous method returning false
    * @return false
    */
   @Override
    public boolean isAutonomous(){
    return false;
   }
   /** Overriden isTeleoperated method returning false
    * @return false
    */
   @Override
   public boolean isTeleoperated(){
    return false;
   }
   /** Abstract method canSpeak as HAL9000 can speak
    * @return true
    */
   public boolean canSpeak(){
    return true;
   }
}
