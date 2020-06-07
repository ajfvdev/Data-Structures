
public interface BinaryTreeServices <T extends Comparable> {
    
    public void insert(T movie);
    public boolean exists(int id);
    T getMovie(int id);
    public boolean isLeaf();
    public void delete(int id);
    public void searchPreOrder(); // Order: root, left and last right
    public void searchInOrder(); //  Order: left, root and last right
    public void searchPostOrder(); // Order: left, right, and last root
    public boolean isEmpty();
    
}