
public class Movies {

    private String name, director;
    private int year;

    // Builder's
    public Movies(Movies copy){
        this.name = copy.name;
        this.director = copy.director;
        this.year = copy.year;
    }

    public Movies(String name, String director, int year){
        this.name = name;
        this.director = director;
        this.year = year;
    }

    // Getters and setters:

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        String name = this.name;
        return name;
    }

    public void setDirector(String director){
        this.director = director;
    }
    public String getDirector(){
        String director= this.director;
        return director;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        int year = this.year;
        return year;
    }
}