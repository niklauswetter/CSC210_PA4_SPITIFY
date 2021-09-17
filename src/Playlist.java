import java.util.ArrayList;
import java.util.List;

public class Playlist
{
    //Data members
    private String name;
    private List<Song> playlist = new ArrayList<Song>();
    //Functions
    public Playlist(String name)
    {
        this.name = name;
    }

    public Playlist(String name, List<Song> contents)
    {
        this.name = name;
        for(Song s:contents)
            this.addSong(s);
    }

    public String getName()
    {
        return this.name;
    }

    public void addSong(Song song)
    {
        if(!this.playlist.contains(song))
            this.playlist.add(song);
    }

    public void Play()
    {
        //STUB
    }

    public void removeSong(Song song)
    {
        if(this.playlist.contains(song))
            this.playlist.add(song);
    }

    //No toString?

}
