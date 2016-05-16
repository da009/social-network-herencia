
/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    private String group;
    
    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String username, String group)
    {
        super(username);
        this.group = group;
    }

    public String getGroup()
    {
        return group;
    }
    
    public void printJoinInfo()
    {
        System.out.println("User: " + getUsername());
        System.out.println("Group-post: " + group);
    }
}
