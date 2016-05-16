import java.util.ArrayList;

/**
 * Write a description of class Comments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comments extends Post
{
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class Comments
     */
    public Comments(String author)
    {
        super(author);
        comments = new ArrayList<>();
    }
    
    /**
     * Add a comment
     */
    public void addComment(String comment)
    {
        comments.add(comment);
    }
    
    /**
     * return the ArrayList of comments as a String
     */
    public ArrayList<String> getComments()
    {
        return comments;
    }
}
