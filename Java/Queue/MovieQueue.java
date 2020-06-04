public class MovieQueue implements QueueServices {

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
    public void queueIn(Movie movie) {
        Node node = new Node(movie);
        if(isEmpty()){
            node.next = head;
            head = node;
        }else{
            Node pointer = head;
            while(pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = node;
            size++;
        }
    }

    @Override
    public Movie queueOut() {
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }else{
            Node data = head;
            head = head.next;
            data.next = null;
            return data.movie;
        }
    }

    @Override
    public Movie peek() {
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }else{
            return head.movie;
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

    public int getSize(){
        return size;
    }

}