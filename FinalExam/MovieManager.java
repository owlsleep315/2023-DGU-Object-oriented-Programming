import java.util.*;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class MovieManager {
    private List<Movie> movies;
    String filePath = "movie.csv";

    public MovieManager() {
        // TODO:
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void writeMoive(Movie movie) {
        // TODO:
    }

    public void searchMoviesByTitle(String title) {
        // TODO
    }

    public void searchMoviesByDirector(String director) {
        // TODO
    }

    public void printRandomMovies(int count) {
        // TODO
    }

    public void showAllMovies() {
        for (Movie movie : movies) {
            movie.print();
        }
    }

    private void loadMoviesFromCSV(String csvFilePath) {
        // TODOÚ
    }
}