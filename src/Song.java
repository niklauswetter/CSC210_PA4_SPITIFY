public class Song
{
    //Data members
    private String title;
    private String artist;
    private int timesPlayed;

    //Functions
    public Song(String title, String artist)
    {
        this.title=title;
        this.artist=artist;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getArtist()
    {
        return this.artist;
    }

    public int getTimesPlayed()
    {
        return this.timesPlayed;
    }

    public void play()
    {
        //STUB--maybe
        this.timesPlayed++;
    }

    @Override
    public String toString()
    {
        return this.title+" by "+this.artist+", "+this.timesPlayed+" play(s)";
    }

}
