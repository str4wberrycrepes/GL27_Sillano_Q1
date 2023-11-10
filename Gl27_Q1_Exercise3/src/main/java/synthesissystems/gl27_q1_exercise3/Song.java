package synthesissystems.gl27_q1_exercise3;

public class Song {
    private String Name;
    private String Genre;
    private String Album;
    
    public Song(String n, String g, String a) {
        Name = n;
        Genre = g;
        Album = a;
    }
    
    public void play() {
        System.out.println("\nPlaying: " + Name + "\n");
    }
    
    //Getters / Setters
    
    public String getName() {
        return Name;
    }
    
    public String getGenre() {
        return Genre;
    }
    
    public String getAlbum() {
        return Album;
    }
}
