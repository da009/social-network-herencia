import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    // instance variables - replace the example below with your own
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;
    
    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        username = author;
        message = text;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }
    
    /**
     * Adds a like to the cont of likes
     */
    public void like()
    {
        likes++;
    }
    
    /**
     * Remove a like to the cont of likes
     */
    public void unLike()
    {
        if (likes<0)
            likes = 0;
        else
            likes--;
    }

    /**
     * Add a comment to the post
     */
    public void addComment(String text)
    {
        comments.add(text);
    }

    /**
     * Return the message
     */
    public String getText()
    {
        return message;
    }

    /**
     * Retrun the time to the post publising
     */
    public long getTimeStamp()
    {
        return timestamp;
    }

    /**
     * Print for screen the post whit his information
     */
    public void display()
    {
        System.out.println("User: " + username);
        System.out.println("Message: " + message);
        System.out.println("Likes: " + likes);
        if(comments.size()==0)
            System.out.println("There are not comments.");
        else
        {
            System.out.println("Comments:");
            for(int cont=0; cont<comments.size(); cont++)
                System.out.println(cont+1 + " " + comments.get(cont));
        }
        System.out.println("Sent: " + timeString(System.currentTimeMillis()) + " ago. \n");
    }

    /**
     * Return a String whit the text of time ago for the message publising
     */
    public String timeString(long time)
    {
        long seconds = (time-timestamp)/1000; 
        long minutes = 0;
        long hours = 0;
        long days = 0;
        long months = 0;
        long years = 0;
        while(seconds >= 60)
        {
            seconds = seconds -60;
            minutes++;
            while(minutes >= 60)
            {
                minutes = minutes -60;
                hours++;
                while(hours >= 24)
                {
                    hours = hours -24;
                    days++;
                    while(days >= 30)
                    {
                        days = days -30;
                        months++;
                        while(months >= 12)
                        {
                            months = months -12;
                            years++;
                        }
                    }
                }
            }
        }
        String timeString = " ";
        if(years > 0)
            timeString += years + " years,";
        else if(months > 0)
             timeString += months + " months, ";
        else if(days > 0)
             timeString += days + " days, ";
        else if(hours > 0)
             timeString += hours + " hours, ";
        else if(minutes > 0)
             timeString += minutes + " minutes, ";
        else if(seconds > 0)
             timeString += seconds + " seconds";
        return timeString;
    }
}
