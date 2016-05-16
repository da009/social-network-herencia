/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost extends Comments
{
    private String filename;
    private String caption;
    // private String username;
    // private long timestamp;
    // private int likes;
    // private ArrayList<String> comments;


    /**
     * Constructor for objects of class MessagePost
     */
    public PhotoPost(String author, String filename, String caption)
    {
       super(author);
       this.filename = filename;
       this.caption = caption;
    }
    
    /**
     * Meotdo que devuelve el nombre del archivo
     */
    public String getImageFile(){
        return filename;
    }
    
    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getCaption(){
        return caption;
    }
}
