/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost extends Comments
{
    private String message;
    // private String username;
    // private long timestamp;
    // private int likes;
    // private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
       super(author);
       this.message = text;
    }
    
    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getText(){
        return message;
    }
    
    /**
     * Print the author for the post
     */
    public void printShortSumary()
    {
        System.out.println("This it's a message-post written by: " + getUsername());
    }
}