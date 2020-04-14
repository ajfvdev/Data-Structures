
public interface List{

    public void insertFirst(Movies movie);
    public void insertLast(Movies movie);
    public void insertIn(Movies movie, int n);

    public void deleteFirst();
    public void deleteLast();
    public void deleteIn(int n);

    public boolean isEmpty();
    public Movies getMovie(int n);
}