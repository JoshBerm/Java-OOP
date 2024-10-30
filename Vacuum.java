/** 
 * Subclass Vacuum extends Robot as a robot without the abilities to
 * fly or be teleoperated, but they are autonomous and can clean.
 */
public class Vacuum extends Robot {

    /** 
     * Paramaterized constructor taking in one parameter serial number,
     * setting flies to false, autonomous to true, and teleoperated to false.
     * 
     * @param serialNumber
     */
    public Vacuum(int serialNumber){
        super(serialNumber, false, true, false);
    }
    /** 
     * Getter method canClean returns true as a vacuum can clean
     * 
     * @return true
     */
    public boolean canClean(){
        return true;
    }
    /** 
     * getCapabilities overrides Robot by extending canClean to its return String.
     * 
     * @returns a string containing capabilities of vacuum
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
    /** 
     * Vacuums cannot fly.
     * 
     * @return false
     */
    @Override
    public boolean canFly(){
        return false;
    }
    /**
     * Vacuums are autonomous.
     * 
     * @return true
     */
    @Override
    public boolean isAutonomous(){
        return true;
    }
    /** 
     * Returns false as vacuums are not teleoperated
     * 
     * @return false
     */
    @Override
    public boolean isTeleoperated(){
        return false;
    }

}
