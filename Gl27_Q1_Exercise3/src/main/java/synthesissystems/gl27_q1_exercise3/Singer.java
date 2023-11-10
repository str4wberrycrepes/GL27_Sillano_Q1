package synthesissystems.gl27_q1_exercise3;

public class Singer {
    private String Name;
    private int Performances;
    private double Earnings;
    private Song FavoriteSong;
    private static int TotalPerformances;
    
    public Singer(String n, int p, double e, Song s) {
        Name = n;
        Performances = p;
        Earnings = e;
        FavoriteSong = s;
    }
    
    public void performForAudience(int i) {
        FavoriteSong.play();
        Performances++;
        TotalPerformances++;
        Earnings += i * 100;
    }
    
    //Overload the performForAudience function
    public void performForAudience (int i, Singer s) {
        FavoriteSong.play();
        
        //Add to totalPerformances
        TotalPerformances += 2;
        
        //Add performances to both singers.
        Performances++;
        s.addPerformances(1);
        
        //Split Earnings 50/50 between the two singers
        Earnings += i * 100 / 2;
        s.addEarnings(i * 100 / 2);
    }
    
    public void outputFields(){
        System.out.println(Name + " currently has done " + Performances + " performance/s.");
        System.out.println("\n" + Name + " currently has made " + Earnings + " earnings.");
        System.out.println("\n" + Name + " currently has \"" + FavoriteSong.getName() + "\" as a favorite song.\n");
    }
    
    public void changeFavSong(Song s) {
        FavoriteSong = s;
    }
    
    //Getters / Setters
    
    public String getName() {
        return Name;
    }
    
    public int getPerformances() {
        return Performances;
    }
    
    public double getEarnings() {
        return Earnings;
    }
    
    public Song getFav() {
        return FavoriteSong;
    }
    
    public int getTotalPerformances() {
        return TotalPerformances;
    }
    
    public void addPerformances(int i) {
        Performances += i;
    }
    
    public void addEarnings(double d) {
        Earnings += d;
    }
}
