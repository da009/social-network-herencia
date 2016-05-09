import java.util.ArrayList;
/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    // instance variables - replace the example below with your own
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;
    

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<>();
        photos = new ArrayList<>();
    }

    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }

    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }

    public void show()
    {
        // Show the text posts
        for(MessagePost message : messages)
            message.display();
        
        // Show the image posts
        for(PhotoPost photo : photos)
            photo.display(); 
    }
}
