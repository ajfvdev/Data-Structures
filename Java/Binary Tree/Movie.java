
public class Movie implements Comparable<Movie>{
    
    private String name, director;
    private int year;

    // Primary key
    private int id;

    public Movie(int id, String name, String director, int year){
        this.id = id;
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public Movie(Movie copy){
        this.id = copy.id;
        this.name = copy.name;
        this.director = copy.director;
        this.year = copy.year;
    }

    // Getters and setters

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDirector(){
        return this.director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public int compareTo(Movie movie) {
        if(id == movie.id){
            return 0;
        }else if(id < movie.id){
            return -1;
        }else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Movie [director=" + director + ", id=" + id + ", name=" + name + ", year=" + year + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((director == null) ? 0 : director.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + year;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        if (director == null) {
            if (other.director != null)
                return false;
        } else if (!director.equals(other.director))
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (year != other.year)
            return false;
        return true;
    } 

}