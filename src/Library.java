import java.util.ArrayList;
import java.util.List;

public class Library
{
    //Data members
    private List<Song> songLibrary = new ArrayList<Song>();
    //Functions
    public Library()
    {
        //STUB
    }

    public Song getSong(String title)
    {
        //STUB
    }

    public void addSong(Song song)
    {
        if(!this.songLibrary.contains(song))
            this.songLibrary.add(song);
    }

    public void removeSong(Song song)
    {
        if(this.songLibrary.contains(song))
            this.songLibrary.remove(song);
    }

    @Override
    public String toString()
    {
        //STUB
    }
}
