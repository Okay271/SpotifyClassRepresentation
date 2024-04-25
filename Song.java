package SPOTSPOT;

public class Song
{
    // instance variables
    private String name;
    private Singer singerr;
    private double time;
    private String type;

    // constructor
    public Song(String nameS, Singer singerS, double timeS, String typeS)
    {
        this.name = nameS;
        this.singerr = singerS;
        this.time = timeS;
        this.type = typeS;
    }

    //getter methods
    public String getSongName()
    {
        return this.name;
    }

    public String getType()
    {
        return this.type;
    }

    public double getSongTime()
    {
        return this.time;
    }

    public String getSingerName()
    {
        return this.singerr.getNameSinger();
    }

    //toString method
    public String toString()
    {
        String info = "";
        info += "Name:   " + this.getSongName() + "\n";
        info += "Singer: " + this.getSingerName() + "\n";
        info += "Time:   " + this.getSongTime() + "\n";
        info += "Type:   " + this.getType() + "\n";
        return info;
    }
}


