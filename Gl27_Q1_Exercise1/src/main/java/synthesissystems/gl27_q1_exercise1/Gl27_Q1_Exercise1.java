package synthesissystems.gl27_q1_exercise1;

public class Gl27_Q1_Exercise1 {
    public static void main(String[] args) {
        //Create Variables
        String Name1, Name2, Name3;
        int Pity1, Pity2, Pity3;
        Boolean Offbanner1, Offbanner2, Offbanner3;
        
        //Assign values to the variables
        Name1 = "Himeko";
        Name2 = "Bronya";
        Name3 = "Kafka";
        
        Pity1 = 43;
        Pity2 = 0;
        Pity3 = 74;
        
        Offbanner1 = true;
        Offbanner2 = false;
        Offbanner3 = false;
        
        
        System.out.println("Character 1 \nName: " + Name1 + "\nNumber of pulls used: " + Pity1 + "\nOn banner character: " + Offbanner1);
        System.out.println("\nCharacter 2 \nName: " + Name2 + "\nNumber of pulls used: " + Pity2 + "\nOn banner character: " + Offbanner2);
        System.out.println("\nCharacter 3 \nName: " + Name3 + "\nNumber of pulls used: " + Pity3 + "\nOn banner character: " + Offbanner3);
        
        int TotalPity = Pity1 + Pity2 + Pity3;
        Boolean BothOffBanner = Offbanner2 == true && Offbanner3 == true;
        Boolean MorePulls = Pity1 > Pity3;
        
        System.out.println("\nTotal pulls used: " + TotalPity + "\nCharacter 2 and Character 3 are both off banner: " + BothOffBanner + "\nCharacter 1 used more pulls than Character 3: " + MorePulls);
    }
}
