
public class MoviesDAO implements BinaryTreeServices<Movie> {

    // This example was made with recursion implementation.

    private Movie value;
    private MoviesDAO left, right;
    private MoviesDAO parent;

    @Override
    public boolean isEmpty() {
        return value == null;
    }

    @Override
    public boolean isLeaf() {
        return value != null && left == null && right == null;
    }

    private void insertImpl(Movie movie, MoviesDAO parent) {
        if (value == null) {
            this.value = movie;
            this.parent = parent;
        } else {
            if (movie.compareTo(value) < 0) {
                if (left == null)
                    left = new MoviesDAO();
                left.insertImpl(movie, this);
            } else if (movie.compareTo(value) > 0) {
                if (right == null)
                    right = new MoviesDAO();
                right.insertImpl(movie, this);
            } else {
                System.out.println("Movie ID:{"+ movie.getId() +"} already exist's");
            }
        }
    }

    @Override
    public void insert(Movie movie){
        insertImpl(movie, null);
    }

    @Override
    public boolean exists(int id) {
        if (value == null) {
            return false;
        } else {
            if (id == value.getId()) {
                return true;
            } else if (id < value.getId() && left != null) {
                return left.exists(id);
            } else if(id > value.getId() && right != null){
                return right.exists(id);
            }else{
                return false;
            }
        }
    }

    @Override
    public Movie getMovie(int id) {
        if (value == null) {
            return null;
        } else {
            if (id == value.getId()) {
                return value;
            } else if (id < value.getId() && left != null) {
                return left.getMovie(id);
            } else if(id > value.getId() && right != null){
                return right.getMovie(id);
            }else{
                return null;
            }
        }
    }

    @Override
    public void searchPreOrder() {
        if(value != null){
            System.out.println(value);
            if(left != null) left.searchPreOrder();
            if(right != null) right.searchPreOrder();
        }
    }

    @Override
    public void searchInOrder() {
        if(value != null){
            if(left != null) left.searchInOrder();
            System.out.println(value);
            if(right != null) right.searchInOrder();
        }
    }

    @Override
    public void searchPostOrder() {
        if(value != null){
            if(left != null) left.searchPostOrder();
            if(right != null) right.searchPostOrder();
            System.out.println(value);
        }
    }

    private MoviesDAO minimum(){
        if(left != null && !left.isEmpty()){
            return left.minimum();
        } else{
            return this;
        }
    }

    private void deleteImpl(int id){
        if(left != null && right != null){
            // two children's
            MoviesDAO minimum = right.minimum();
            this.value = minimum.value;
            right.delete(minimum.value.getId());
        }else if(left != null || right != null){
            // one children
            MoviesDAO sustitute = left != null ? left : right;
            this.value = sustitute.value;
            this.left = sustitute.left;
            this.right = sustitute.right;
        }else{
            // zero children
            if(parent != null){
                if(this == parent.left) parent.left = null;
                if(this == parent.right) parent.right = null;
                parent = null;
            }
            value = null;
        }
    }

    @Override
    public void delete(int id) {
        if(value != null){
            if(id == value.getId()){
                deleteImpl(id);
            }else if(id < value.getId() && left != null){
                left.delete(id);
            }else if(id > value.getId() && right != null){
                right.delete(id);
            }
        }
    }

}