/** TeeOneThousand is a concrete class of MovieRobot without the abilities to 
 * fly, be autonomous, or be teleoperated, but it can clean
 */
public class TeeOneThousand extends MovieRobot {

    /** Paramaterized Constructor
     * @param serialNumber the serial number of a robot
     * @param canFly whether robot can fly
     * @param isAutonomous whether a robot is autonomous
     * @param isTeleoperated whether a robot is autonomous
     */
    public TeeOneThousand(int serialNumber, boolean canFly, boolean isAutonomous, boolean isTeleoperated){
        super(serialNumber, false, false, false);
    }
    /** TeeOneThousand cant speak
     * @return false
     */
    public boolean canSpeak(){
        return false;
    }
    /** TeeOneThousand cannot fly
     * @return false
     */
    @Override
    public boolean canFly(){
        return false;
    }
    /** TeeOneThousand is not autonomous
     * @return false
     */
    @Override
    public boolean isAutonomous(){
        return false;
    }
    /** TeeOneThousand is not teleoperated
     * @return false
     */
    @Override
    public boolean isTeleoperated(){
        return false;
    }
    /** TeeOneThousand can clean
     * @return true
     */
    public boolean canClean(){
        return true;
    }
    /** Overriden getcapabilities method to include the ability to clean
     * @return string consisting of capabilities.
     */
    @Override
    public String getCapabilities(){
        String capabilitiesList = "";
        if(canFly()){
            capabilitiesList += "canFly ";
        }
        if(isAutonomous()){
            capabilitiesList += "isAutonomous ";
        }
        if(isTeleoperated()){
            capabilitiesList += "isTeleoperated ";
        }
        if(canClean()){
            capabilitiesList += "canClean";
        }
        return capabilitiesList;
    }


}
