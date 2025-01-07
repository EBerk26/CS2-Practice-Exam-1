public class StarshipExplorer {
    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";

    public static void main(String[] args) {
        new StarshipExplorer();
    }
    int RandInt(int UpperBound){
        return (int)(Math.random()*(UpperBound+1));
    }
    public StarshipExplorer() {
        System.out.println("Hello World! Good luck on your exams!");
        Alien[] aliens = new Alien[50];
        for(int x=0;x<aliens.length;x++){
            aliens[x] = new Alien(1+RandInt(74),RandInt(100));
        }
        displayAliens(aliens);
        System.out.println(checkEnergy(aliens));
        System.out.println(decipher(alienLanguage));
    }

    String decipher(String alienLanguage){
        String english ="";
        String message = alienLanguage;
        while(message.contains("*")){
            english=english+message.charAt(message.indexOf('*')+1);
            message = message.substring(message.indexOf('*')+1);
        }
        return english;
    }
    void displayAliens(Alien[] aliens){
        for(int x=0;x<aliens.length;x++){
            aliens[x].printInfo();
        }
    }
    boolean checkEnergy(Alien[] aliens){
        boolean[] energyLevelArray = new boolean[76];
        for(int x=0;x<aliens.length;x++){
            if(energyLevelArray[aliens[x].getEnergyLevel()]){
                return true;
            } else {
                energyLevelArray[aliens[x].getEnergyLevel()] = true;
            }
        }
        return false;
    }
}
class Alien{
    private int energyLevel;
    private int hostilityIndex;

    public Alien(int energyLevel, int hostilityIndex) {
        this.energyLevel = energyLevel;
        this.hostilityIndex = hostilityIndex;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getHostilityIndex() {
        return hostilityIndex;
    }

    public void setHostilityIndex(int hostilityIndex) {
        this.hostilityIndex = hostilityIndex;
    }
    public void printInfo(){
        System.out.println("Energy Level: "+energyLevel+". Hostility Index: "+hostilityIndex);
    }

}