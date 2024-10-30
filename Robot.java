/** 
 * The Robot class characterizes the basic abilities of a Robot with key
 * information such as the robot's unique serial number, if it can fly, is
 * autonomous, and if it is teleoperated.
 */
public class Robot 
{
    /** Serial number of a robot */
    private int serialNumber;
    /** Stores whether robot can fly */
    private boolean flies;
    /** Stores wheter robot is autonomous */
    private boolean autonomous;
    /** Stores whether robot is teleoperated */
    private boolean teleoperated;

    /** 
     * Parameterized constructor. Initializes the robot with inputted values
     * 
     * @param serialNumber the serial number of a robot
     * @param flies whether robot can fly
     * @param autonomous whether a robot is autonomous
     * @param teleoperated whether a robot is autonomous
    */
    public Robot(int serialNumber, boolean flies, boolean autonomous, boolean teleoperated){
        this.serialNumber = serialNumber;
        this.flies = flies;
        this.autonomous = autonomous;
        this.teleoperated = teleoperated;
    }
    /** 
     * Sets the capabilities of the robot
     * 
     * @param flies whether robot can fly
     * @param autonomous whether a robot is autonomous
     * @param teleoperated whether a robot is autonomous
    */
    public void setCapabilities(boolean flies, boolean autonomous, boolean teleoperated){
        this.flies = flies;
        this.autonomous = autonomous;
        this.teleoperated = teleoperated;
    }
    /**  
     * Gets the serial number of the robot
     * 
     * @return serial number of the robot
    */
    public int getSerialNumber(){
        return this.serialNumber;
    }
    /** 
     * Gets whether robot can fly
     * 
     * @return true if robot can fly, false otherwise.
     */
    public boolean canFly(){
        return this.flies;
    }
    /** 
     * Gets whether robot is autonomous
     * 
     * @return true if robot is autonomous, false otherwise.
     */
    public boolean isAutonomous(){
        return this.autonomous;
    }
    /** 
     * Gets whether the robot is teleoperated
     * 
     * @return true if robot is teleoperated, false otherwise
     */
    public boolean isTeleoperated(){
        return this.teleoperated;
    }
    /** 
     * Returns the capabilities of the robot as a string
     * 
     * @return a string containing the robots capabilities
    */
    public String getCapabilities(){
        String capabilitiesList = "";
        if(canFly()){
            capabilitiesList += "canFly ";
        }
        if(isAutonomous()){
            capabilitiesList += "isAutonomous ";
        }
        if(isTeleoperated()){
            capabilitiesList += "isTeleoperated";
        }
        return capabilitiesList;
    }
    @Override
    /** 
     * Modifies the toString method to return a string containing the robots
     * serial number followed by a list of its capabilities.
     * 
     * @return a string of the robots serial number and capabilities
     */
    public String toString(){
        return "ID: <"+getSerialNumber()+">, Capabilities: <"+getCapabilities()+">";
    }

}
