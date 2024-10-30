/**  
* The drone class is an extension of class robot which can fly, is not autonomous,
* and is teleoperated. 
*/
public class Drone extends Robot {
    /**  
     * Parametarized constructor that takes in one input serial number
     * and sets flies to true, autonomous to false, and teleoperated to true.
     * 
     * @param serialNumber takes in a robot's serial number
     * 
    */
    public Drone(int serialNumber){
        super(serialNumber, true, false, true);
    }
    /** 
     * Overrides the canFly method to return true as Drone's can fly.
     * 
     * @retun true
     */
    @Override
    public boolean canFly(){
        return true;
    }    
    /** 
     * Overrides the isAutonomous method to false as a Drone is not autonomous.
     * 
     * @return false
     */
    @Override
    public boolean isAutonomous(){
        return false;
    }
    /** 
     * Overrides the isTeleoperated method to true as a drone is
     * teleoperated.
     *  
     * @return true 
     */
    @Override
    public boolean isTeleoperated(){
        return true;
    }
}