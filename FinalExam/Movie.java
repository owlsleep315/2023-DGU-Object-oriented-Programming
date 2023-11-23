public class Movie {
    private String title;
    private String genre;
    private String director;

    private String releaseYear;

    public Movie(String title, String genre, String director, String releaseYear) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void print(){
        System.out.println("Title: " + this.title);
        System.out.println("Genre: " + this.genre);
        System.out.println("Director: " + this.director);
        System.out.println("Release Year: " + this.releaseYear);
        System.out.println();
    }
}