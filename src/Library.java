import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library
{
    //Data members
    private List<Song> songLibrary = new ArrayList<Song>();
    //Functions
    public Library()
    {
        //Default constructor
    }

    public Song getSong(String title)
    {
        for(Song s: this.songLibrary)
        {
            if(s.getTitle().equals(title))
                return s;
        }
        return null;
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
        Collections.sort(this.songLibrary, new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        String result = "";
        for(Song s:this.songLibrary)
            result+=s+"\n";
        return result;
    }

    //Private helper methods
    //If return > 0 s1 comes after s2, if return < 0 s1 comes before s2
    private int compareStrings(String s1, String s2)
    {
        for(int i = 0; i< s1.length() && i< s2.length(); i++)
        {
            if((int)s1.charAt(i) == (int)s2.charAt(i))
                continue;
            else
                return (int)s1.charAt(i)-(int) s2.charAt(i);
        }

        if(s1.length()<s2.length())
            return (s1.length()-s2.length());
        else if (s1.length()>s2.length())
            return (s1.length()-s2.length());
        else
            return 0;
    }
}
