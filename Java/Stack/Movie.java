public class Movie {
    
    private String name, director;
    private int year;

    public Movie(String name, String director, int year){
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public Movie(Movie copy){
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


}