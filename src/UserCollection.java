import java.util.ArrayList;
import java.util.List;

public class UserCollection
{
    //Data members
    private List<User> userList = new ArrayList<User>();

    //Functions
    public UserCollection()
    {
        //STUB
    }

    public boolean userExists(String username)
    {
        return this.userList.contains(username);
    }

    public User login(String username, String password)
    {
        if(this.userExists(username))
        {
            //If the password is correct then return the user
            //STUB
        }
        //If the user doesnt exist or the password is wrong the method returns null
        return null;
    }

    public void addUser(User add)
    {
        this.userList.add(add);
    }

    @Override
    public String toString()
    {
        //STUB
    }
}
