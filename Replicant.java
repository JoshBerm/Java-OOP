/** Subclass Replicant extends MovieRobot with the ability to speak
 * and the unique ability to fight. Replicant cannot do anything else.
 */
public class Replicant extends MovieRobot {
    /** Parameterized Constructor
     * @param serialNumber the serial number of a robot
     * @param canFly whether robot can fly
     * @param isAutonomous whether a robot is autonomous
     * @param isTeleoperated whether a robot is autonomous
     * @param catchphrase like tears in rain...
     */
    public Replicant(int serialNumber, boolean canFly, boolean isAutonomous, boolean isTeleoperated){
        super(serialNumber, false, false, false,"like tears in rain...");

    }
    /** Canspeak returns true
     * @return true
     */
    public boolean canSpeak(){
        return true;
    }
    /** canFly returns false
     * @return false
     */
    @Override
    public boolean canFly(){
        return false;
    }
    /** isAutonomous returns false
     * @return false
     */
    @Override
    public boolean isAutonomous(){
        return false;
    }
    /** isTeleoperated returns false
     * @return false
     */
    @Override
    public boolean isTeleoperated(){
        return false;
    }
    /** canFight returns true
     * @return true
     */
    public boolean canFight(){
        return true;
    }
    /** Overriden getcapabilities including canfight
     * @return a string of capabilities
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
        if(canSpeak()){
            capabilitiesList += "canSpeak";
        }
        if(canFight()){
            capabilitiesList +=" canFight";
        }
        return capabilitiesList;
    }
}
