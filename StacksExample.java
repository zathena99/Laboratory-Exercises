import java.util.*;

//Fruit Basket
class StacksExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> basket = new Stack<>();
        String[] fruits = {"Apple", "Strawberry", "Grapes", "Banana"};

        System.out.println("Catch and eat any of these fruits: ('A' for Apple, 'S' for Strawberry, 'G' for Grapes, 'B' for Banana)");

        System.out.print("How many fruits would you like to catch? ");
        int numFruits = scanner.nextInt();

        for (int i = 1; i <= numFruits; i++) {
            System.out.print("Fruit " + i + " of " + numFruits + ": ");
            String choice = scanner.next().toUpperCase();

            switch (choice) {
                case "A":
                    basket.push(fruits[0]);
                    break;
                case "S":
                    basket.push(fruits[1]);
                    break;
                case "G":
                    basket.push(fruits[2]);
                    break;
                case "B":
                    basket.push(fruits[3]);
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
                    i--; 
                    break;
            }
        }

        System.out.println("Your basket now has: " + basket);

        while (!basket.isEmpty()) {
            System.out.print("Press 'E' to eat a fruit: ");
            String eat = scanner.next().toUpperCase();
            if (eat.equals("E")) {
                basket.pop();
            } else {
                System.out.println("Invalid input. Try again.");
            }

            System.out.println("Fruit(s) in the basket: " + basket);
        }

        System.out.println("No more fruits in the basket.");
    }
}