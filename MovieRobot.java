/**
 * Abstract class MovieRobot extends Robot as a template for subclasses of 
 * MovieRobot detailing basic characteristics
 * 
 */
public abstract class MovieRobot extends Robot {
    /** Catchphrase of a movie robot */
    private String catchphrase;
    /** Paramaterized constructor
     * 
     * @param serialNumber the serial number of a robot
     * @param flies whether robot can fly
     * @param autonomous whether a robot is autonomous
     * @param teleoperated whether a robot is autonomous
     * @param catchphrase a robots catchphrase
     */
    public MovieRobot(int serialNumber, boolean flies, boolean autonomous, boolean teleoperated, String catchphrase){
        super(serialNumber, flies, autonomous, teleoperated);
        this.catchphrase = catchphrase;
    }
    /** Overloaded constructor for objects lacking a catchphrase
     * @param serialNumber the serial number of a robot
     * @param flies whether robot can fly
     * @param autonomous whether a robot is autonomous
     * @param teleoperated whether a robot is autonomous
     */
    public MovieRobot(int serialNumber, boolean flies, boolean autonomous, boolean teleoperated){
        this(serialNumber, flies, autonomous, teleoperated, null);
    }
    /** 
     * getter method for catchphrase
     * @return catchphrase
     */
    public String getCatchphrase(){
        return this.catchphrase;
    }
    /** Abstract method for any subclasses */
    public abstract boolean canSpeak();
    /**
     * Overriden getCapabilities method returning a string of a Robot's
     * capabilities in addition to if it can speak.
     * 
     * @return a string containing MovieRobots capabilities
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
        return capabilitiesList;
    }
    /** Overriden toString returning a string with a robots catchphrase
     * if there is one present after its capabilities.
     * 
     * @return a string of serial number, capabilities, catchphrase
     */
    @Override
    public String toString(){
        if(canSpeak()){
            return "ID: <"+getSerialNumber()+">, Capabilities: <"+getCapabilities()+"> \""+getCatchphrase()+"\"";
        }else{
            return "ID: <"+getSerialNumber()+">, Capabilities: <"+getCapabilities()+">";
        }
    }

}
