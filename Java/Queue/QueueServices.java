
public interface QueueServices {
    
    public void queueIn(Movie movie);
    public Movie queueOut();
    public Movie peek();
    public boolean isEmpty();

}