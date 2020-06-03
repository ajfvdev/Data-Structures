
public class App {

    public static void main(String[] args) {
        Movies harrypotter = new Movies("Harry Potter", "Chris Columbus", 2001);
        Movies starwars = new Movies("Star Wars Episode 1", "George Lucas", 1999);
        Movies theInterview = new Movies("The interview", "Seth Rogen and James Franco", 2014);
        Movies naruto = new Movies("Naruto: The Last", "Masashi Kishimoto", 2018);
        Movies test = new Movies("test", "test", 0);
        

        MoviesList movies = new MoviesList();

        movies.insertFirst(harrypotter);
        movies.insertLast(starwars);
        movies.insertLast(theInterview);
        movies.insertLast(naruto);
        
        movies.insertIn(test, 0);

        movies.deleteIn(3);

        for (int i = 0; i < movies.getSize(); i++) {
            System.out.println("Name: " + movies.getMovie(i).getName() + 
            ", Director: " + movies.getMovie(i).getDirector() + 
            ", Year: " + movies.getMovie(i).getYear() );
        }

    }

}