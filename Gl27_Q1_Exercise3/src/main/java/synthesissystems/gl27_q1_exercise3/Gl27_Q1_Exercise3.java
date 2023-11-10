package synthesissystems.gl27_q1_exercise3;

public class Gl27_Q1_Exercise3 {
    public static void main(String[] args) {
        //Create three instances of class "Unit"
        Unit Aerial = new Unit("Aerial", "Ericht", "Mercury", 93);
        Unit LFrith = new Unit("LFrith", "GUND-Arm", "Terra", 27);
        Unit Banshee = new Unit("Banshee", "Psycho Frame", "ZFFD", 35);
        
        //Create two instances of class "Song"
        Song Raining_In_Manila = new Song("Raining In Manila", "OPM", "Raining In Manila");
        Song Fallen = new Song("Fallen", "OPM", "Fallen");
        
        //Create 2 instances of class "Singer"
        Singer Lola_Amour = new Singer("Lola Amour", 0, 0, Fallen);
        Singer Saan_Banda = new Singer("Saan Banda", 0, 0, Fallen);
        
        //Output Values before operations
        Lola_Amour.outputFields();
        Saan_Banda.outputFields();
        System.out.println("Total Performances: " + Lola_Amour.getTotalPerformances());
        
        //Perform for 12 people
        Lola_Amour.performForAudience(12, Saan_Banda);
        
        //Change favorite song
        Lola_Amour.changeFavSong(Raining_In_Manila);
        
        //Output Values after operations
        Lola_Amour.outputFields();
        Saan_Banda.outputFields();
        System.out.println("Total Performances: " + Lola_Amour.getTotalPerformances());
        
        //Unit Outputs
        System.out.println("\n====================");
        System.out.println("\n\n2ynthetis Systems : Units Online.");
        
        System.out.println("\nUnit: " + Aerial.getName() + "\nFramework Model: " + Aerial.getModel() + "\nAffiliation: " + Aerial.getAffiliation() + "\nID: " + Aerial.getId());
        System.out.println("\nUnit: " + LFrith.getName() + "\nFramework Model: " + LFrith.getModel() + "\nAffiliation: " + LFrith.getAffiliation()+ "\nID: " + LFrith.getId());
        System.out.println("\nUnit: " + Banshee.getName() + "\nFramework Model: " + Banshee.getModel() + "\nAffiliation: " + Banshee.getAffiliation()+ "\nID: " + Banshee.getId());
    }
}