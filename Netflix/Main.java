import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Inception", "Sci-Fi", 148),
                new Movie("The Matrix", "Sci-Fi", 136),
                new Movie("Interstellar", "Sci-Fi", 169),
                new Movie("Titanic", "Romance", 195),
                new Movie("The Notebook", "Romance", 123),
                new Movie("La La Land", "Romance", 128),
                new Movie("The Dark Knight", "Action", 152),
                new Movie("Mad Max: Fury Road", "Action", 120),
                new Movie("Gladiator", "Action", 155)
        );

        User user = new User("Chris");
        user.watchMovie(movies.get(4), 148); 
        user.watchMovie(movies.get(1), 100); 
        user.watchMovie(movies.get(5), 195); 

        user.recommendMovies(movies);
    }
}
