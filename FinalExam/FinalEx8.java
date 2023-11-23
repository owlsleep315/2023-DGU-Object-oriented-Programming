import java.util.Scanner;


public class FinalEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieManager movieManager = new MovieManager();

        boolean exit = false;

        while (!exit) {
            System.out.println("===== Movie Management Program =====");
            System.out.println("1. Add Movie");
            System.out.println("2. Search Movies by Title");
            System.out.println("3. Search Movies by Director");
            System.out.println("4. Randomly Select Movies");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter movie title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter movie genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter movie director: ");
                    String director = scanner.nextLine();
                    System.out.print("Enter movie release year: ");
                    String releaseYear = scanner.nextLine();

                    Movie movie = new Movie(title, genre, director, releaseYear);
                    movieManager.addMovie(movie);
                    movieManager.writeMoive(movie);

                    break;

                case 2:
                    System.out.print("Enter movie title to search: ");
                    String searchTitle = scanner.nextLine();
                    System.out.println("Search results for movies with title '" + searchTitle + "':");
                    movieManager.searchMoviesByTitle(searchTitle);
                    break;

                case 3:
                    System.out.print("Enter movie director to search: ");
                    String searchDirector = scanner.nextLine();
                    System.out.println("Search results for movies directed by '" + searchDirector + "':");
                    movieManager.searchMoviesByDirector(searchDirector);
                    break;

                case 4:
                    System.out.print("Enter the number of random movies to print: ");
                    int count = scanner.nextInt();
                    if(count >= 0){
                        movieManager.printRandomMovies(count);
                    }
                    break;

                case 0:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;


                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println();
                    break;
            }
        }
    }


}