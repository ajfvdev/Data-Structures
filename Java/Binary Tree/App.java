import java.util.Arrays;

public class App {
   
    public static void main(String[] args) {
    
        Movie harry = new Movie(500, "Harry", "JK", 2000);
        Movie starwars = new Movie(200, "Star Wars", "George Lucas", 1997);
        Movie spiderman = new Movie(600, "Spiderman", "Stan Lee", 2004);
        Movie naruto = new Movie(400, "Naruto: The Last", "Masashi Kishimoto", 2016);
        Movie matrix = new Movie(499, "Matrix", "IDK", 2006);
        Movie same = new Movie(400, "same", "IDK", 0);


        MoviesDAO binarytree = new MoviesDAO();

        System.out.println("Inserting....");
        Arrays.asList(harry, starwars, spiderman, naruto, matrix, same).forEach(binarytree::insert);

        System.out.println("Finished! \n\n\n");

        System.out.println("PreOrdering");
        binarytree.searchPreOrder();

        System.out.println("Finished! \n\n\n");

        System.out.println("InOrdering");
        binarytree.searchInOrder();

        System.out.println("Finished! \n\n\n");

        System.out.println("PostOrdering");
        binarytree.searchPostOrder();

        System.out.println("Finished!");


        System.exit(0);
    }
}