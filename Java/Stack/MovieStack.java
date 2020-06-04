public class MovieStack implements StackServices {

    private Node head = null;
    private int size = 0;

    public class Node{
        public Movie movie;
        public Node next = null;
        
        public Node(Movie movie){
            this.movie = movie;
        }
    }

    @Override
    public void push(Movie movie) {
        Node node = new Node(movie);
        node.next = head;
        head = node;
        size++;
    }

    @Override
    public Movie pop() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }else{
            Node data = head;
            head = head.next;
            data.next = null;
            size--;
            return data.movie;
        }
    }

    @Override
    public boolean isEmpty() {
        if(head == null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Movie peek() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }else{
            return head.movie;
        }
    }    

    public int getSize(){
        return size;
    }

}