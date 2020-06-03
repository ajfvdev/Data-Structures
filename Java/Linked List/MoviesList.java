
public class MoviesList implements List {

    private int size = 0;
    private Nodo head = null;

    public class Nodo {
        public Movies movie;
        public Nodo next = null;

        public Nodo(Movies movie) {
            this.movie = movie;
        }
    }

    // Getters and setters
    public int getSize() {
        int size = this.size;
        return size;
    }

    // List methods:

    @Override
    public void insertFirst(Movies movie) {
        Nodo newNodo = new Nodo(movie);
        newNodo.next = this.head;
        this.head = newNodo;
        this.size++;
    }

    @Override
    public void insertLast(Movies movie) {
        if (isEmpty()) {
            insertFirst(movie);
        } else {
            Nodo newNodo = new Nodo(movie);
            Nodo point = this.head;
            while (point.next != null) {
                point = point.next;
            }
            point.next = newNodo;
            this.size++;
        }
    }

    @Override
    public void insertIn(Movies movie, int n) {
        if (isEmpty() || n == 0) {
            insertFirst(movie);
        } else {
            if (this.size == n) {
                insertLast(movie);
            } else {
                Nodo newNodo = new Nodo(movie);
                Nodo point = this.head;
                int count = 0;
                while (count < (n - 1) && point.next != null) {
                    point = point.next;
                    count++;
                }
                newNodo.next = point.next;
                point.next = newNodo;
                this.size++;
            }
        }
    }

    @Override
    public void deleteFirst() {
        if (!isEmpty()) {

            Nodo deleting = this.head;
            this.head = this.head.next;

            deleting.next = null;
            this.size--;
        }
    }

    @Override
    public void deleteLast() {
        if (!isEmpty()) {
            if (this.size == 1) {
                deleteFirst();
            } else {
                Nodo point = this.head;
                while (point.next.next != null) {
                    point = point.next;
                }
                point.next = null;
                this.size--;
            }
        }
    }

    @Override
    public void deleteIn(int n) {
        if (!isEmpty()) {
            if (this.size == 1 || n == 0) {
                deleteFirst();
            } else if (this.size == n) {
                deleteLast();
            } else {
                Nodo point = this.head;
                int count = 0;
                while (count < n - 1 && point.next.next != null) {
                    point = point.next;
                    count++;
                }
                Nodo deleting = point.next;
                point.next = point.next.next;

                deleting.next = null;
                this.size--;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Movies getMovie(int n) {
        if (isEmpty() || n > this.size) {
            return null;
        } else {
            if (n == 0) {
                return this.head.movie;
            } else {
                Nodo point = this.head;
                int count = 0;
                while (count < n && point.next != null) {
                    point = point.next;
                    count++;
                }
                return point.movie;
            }
        }
    }

}