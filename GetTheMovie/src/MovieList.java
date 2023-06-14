import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    private List<String> movies;

    public MovieList(String pathname) {
        movies = new ArrayList();
        File file = new File(pathname);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                movies.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }
    }

    public String getRandomMovie() {
        //Returns a string with a random movie title from the list.
        int movieIndex = (int) (Math.random() * movies.size());
        return movies.get(movieIndex);
    }
}
