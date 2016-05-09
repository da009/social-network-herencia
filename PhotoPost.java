import java.util.ArrayList;

/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    // instance variables - replace the example below with your own
    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author, String filename, String caption)
    {
        username = author;
        this.filename = filename;
        this.caption = caption;
        timestamp = 0;
        likes = 0;
        comments = new ArrayList<>();
    }

    public void like()
    {

    }

    public void unLike()
    {

    }

    public void addComment(String text)
    {

    }

    public String getImageFile()
    {
        String imageFile = "";
        return imageFile;
    }

    public String getCaption()
    {
        return caption;
    }

    public long getTimeStamp()
    {
        return timestamp;
    }

    public void display()
    {

    }

    public long timeString(long time)
    {
        long timeString = 0;
        return timeString;
    }
}
