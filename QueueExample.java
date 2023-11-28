import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

// Movie Time
public class QueueExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter movie " + (i + 1) + " of 3: ");
            String movie = input.nextLine();
            movies.add(movie);
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter snack " + (i + 1) + " of 3: ");
            String snack = input.nextLine();
            snacks.add(snack);
        }

        System.out.println("Movies to watch are: ");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("Snacks available are: ");
        for (String snack : snacks) {
            System.out.println(snack);
        }

        while (!snacks.isEmpty()) {
            System.out.println("Snacks remaining: " + snacks);

            System.out.println("Press S each time you finish a snack.");
            String response = input.nextLine();

            if (response.equalsIgnoreCase("S")) {
                String snack = snacks.remove();

            }
        }

        System.out.println("No more snacks.");

        input.close();
    }
}