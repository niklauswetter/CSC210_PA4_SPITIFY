import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserCollection
{
    //Data members
    private List<User> userList = new ArrayList<User>();

    //Functions
    public UserCollection()
    {
        //Default constructor
    }

    public boolean userExists(String username)
    {
        for(User u: this.userList)
        {
            if(u.getName().equals(username))
                return true;
        }
        return false;
    }

    public User login(String username, String password)
    {
        if(userExists(username))
        {
            User temp = this.findUser(username);
            if(temp != null && temp.attemptLogin(password))
            {
                System.out.println("Welcome to Spitify, "+username);
                return temp;
            }
        }
        System.out.println("Invalid Login");
        return null;
    }

    public void addUser(User add)
    {
        if(!userExists(add.getName()))
            this.userList.add(add);
    }

    @Override
    public String toString()
    {
        Collections.sort(this.userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        String result = "";
        for(User u:this.userList)
            result+=u.getName()+": "+u.getPlaylists().size()+" playlists\n";
        return result;
    }

    //Private helper functions
    private User findUser(String username)
    {
        for(User u:this.userList)
        {
            if(u.getName().equals(username))
                return u;
        }
        return null;
    }

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
