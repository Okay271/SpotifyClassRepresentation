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
     //get methods
     public String getNameSinger()
     {
         return this.name;
     }
 
     public int getNumberOfSongs()
     {
         return this.songs.size();
     }
 
     //other methods
     public void addSong(Song sng)
     {
         this.songs.add(sng);
     }
 
     //toString method
     public String toString()
     {
         String info = "";
         info += "-----" + this.getNameSinger() + "-----\n";
         for (int i = 0; i < this.songs.size(); i++)
         {
             info += (i + 1) + ". " + this.songs.get(i).getSongName() + "\n";
         }
         info += "Total Number Of Songs: " + this.getNumberOfSongs(); 
         return info;
    }
}
