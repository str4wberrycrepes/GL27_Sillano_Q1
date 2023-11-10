package synthesissystems.gl27_q1_exercise3;

public class Unit {
    private String Name;
    private String Model;
    private String Affiliation;
    private int id;
    
    public Unit(String n, String m, String a, int i) {
        Name = n;
        Model = m;
        Affiliation = a;
        id = i;
    }
    
    //Getters / Setters
    
    public String getName() {
        return Name;
    }
    
    public String getModel() {
        return Model;
    }
    
    public String getAffiliation() {
        return Affiliation;
    }
    
    public int getId() {
        return id;
    }
}
