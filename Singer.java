package SPOTSPOT;

import java.util.ArrayList;

public class Singer {
    
    //instance variables 
    private String name;
    private ArrayList <Song> songs;

    //constructor
    public Singer(String nameS)
    {
        this.name = nameS;
        this.songs = new ArrayList<Song>();
    }
}
