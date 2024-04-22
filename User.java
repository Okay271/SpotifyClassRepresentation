package SPOTSPOT;

import java.util.ArrayList;

public class User
{
    // instance  variables
    private String name;
    private String favSinger;
    private ArrayList <Playlist> playlists;

    // constructor
    public User(String nameU, String favSingerU)
    {
        this.favSinger = favSingerU;
        this.name = nameU;
        this.playlists = new ArrayList<Playlist>();
    }

    //getter methods
    public String getUserName()
    {
        return this.name;
    } 

    public String getFavSinger()
    {
        return this.favSinger;
    }

    public int getNumberPlaylists()
    {
        return this.playlists.size();
    }

    //other methods
    public void addPlaylist(Playlist plys)
    {
        this.playlists.add(plys);
    }

    //toString
    public String toString()
    {
        String info= "";
        info += "User Name:           " + this.getUserName() + "\n"; 
        info += "Favorite Singer:     " + this.getFavSinger() + "\n"; 
        info += "Number Of Playlists: " + this.getNumberPlaylists() + "\n";
        for (int i = 0; i < this.playlists.size(); i++)
        {
            info += (i + 1) + ". " + this.playlists.get(i).getPlaylistName() + "(" + this.playlists.get(i).getNumberOfSongs() + " songs)" + "\n";
        }
        return info;
    }
}