import java.util.ArrayList;
import java.util.List;

public class User
{
    //Data members
    private String name;
    private String password;
    private List<Playlist> playlists = new ArrayList<Playlist>();

    //Functions
    public User(String name, String password)
    {
        this.name=name;
        this.password=password;
    }

    public String getName()
    {
        return this.name;
    }

    public boolean attemptLogin(String password)
    {
        //STUB
        return false;
    }

    public void addPlaylist(Playlist playlist)
    {
        this.playlists.add(playlist);
    }

    public List<Playlist> getPlaylists()
    {
        return this.playlists;
    }

    public void selectPlaylist(String name)
    {
        //STUB
    }

    @Override
    public String toString()
    {
        return this.name+", "+this.playlists.size()+" playlists";
    }

}
