
/**
 * Write a description of class Post here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Post
{
    private String username;
    private long timestamp;
    private int likes;

    /**
     * Constructor for objects of class Post
     */
    public Post(String author)
    {
       this.username = author;
       this.timestamp = System.currentTimeMillis();
       likes = 0;
    }
    
    /**
     * returns the username for this post
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * Metodo para dar un like.
     */
    public void like(){
        likes++;
    }
    
    /**
     * Metodo para quitar un like en caso de que los haya.
     */
    public void unlike(){
        if(likes != 0)
           likes--; 
    }
    
    /**
     * return the number of likes as int
     */
    public int getLikes()
    {
        return likes;
    }
    
    /**
     * Metodo que devuelve la estampa de tiempo en el momento de crear el post
     */
    public long getTimeStamp(){
        return timestamp;
    }
    
    /**
     * Metodo para pasar el tiempo a minutos y segundos.
     */
    public String timeString(long time){
        String info = "";
        int sec =  (int)(time / 1000) % 60;
        int min =  (int)((time / (1000*60)) % 60);
        if(min > 0)
            info += min + " Minutes, ";
        info += sec + " Seconds\n";
        return info;
    }
    
    /**
     * Metodo que muestra toda la info del post
     */
    public void display(){
        String info = "";
        long time = System.currentTimeMillis() - getTimeStamp();
        info += username + "\n=====================\n" + "Posted: ";
        info += timeString(time);
        info += "_____________________\nLikes: " + likes + "\n=====================\n\n";
        System.out.println(info);
    }
}
