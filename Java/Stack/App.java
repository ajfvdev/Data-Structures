
public class App {
    
    public static void main(String[] args) {
    
        Movie harry = new Movie("Harry", "JK", 2000);
        Movie starwars = new Movie("Star Wars", "George Lucas", 1997);
        Movie spiderman = new Movie("Spiderman", "Stan Lee", 2004);
        Movie naruto = new Movie("Naruto: The Last", "Masashi Kishimoto", 2016);
        Movie matrix = new Movie("Matrix", "IDK", 2006);

        MovieStack stack = new MovieStack();

        stack.push(harry);
        stack.push(starwars);
        stack.push(spiderman);
        stack.push(naruto);
        stack.push(matrix);        

        while(!stack.isEmpty()){
            Movie movie = stack.pop();
            System.out.println(
                "Name:" + movie.getName() +
                "  Director:" + movie.getDirector() +
                "  Year:" + movie.getYear()
                );
        }

        System.exit(0);
    }
}