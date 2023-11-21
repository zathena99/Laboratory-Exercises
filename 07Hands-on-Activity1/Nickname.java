import java.util.Scanner;

public class Nickname {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n1, n2, n3;
    String n4, n5, n6, n7, n8, n9;
    int number;

    System.out.println("Enter three nicknnames: ");
    n1 = sc.nextLine();
    n2 = sc.nextLine();
    n3 = sc.nextLine();

    System.out.println("\nPossible nicknames are: ");

    System.out.println("1- " + (n4 = n1.concat(" " + n2)));
    System.out.println("2- " + (n5 = n1.concat(" " + n3)));
    System.out.println("3- " + (n6 = n2.concat(" " + n1)));
    System.out.println("4- " + (n7 = n2.concat(" " + n3)));
    System.out.println("5- " + (n8 = n3.concat(" " + n1)));
    System.out.println("6- " + (n9 = n3.concat(" " + n2)));

    System.out.print("\nEnter 1-6 to select a name: ");
    number = sc.nextInt();

    switch (number) {
      case 1:
        System.out.println("\nThe initials for " + n4 + " is " + n1.charAt(0) + n2.charAt(0));
        System.out.println("Suggested nickname: " + n1.toLowerCase() + "_" + n2.toLowerCase());
        break;
      case 2:
        System.out.println("\nThe initials for " + n5 + " is " + n1.charAt(0) + n3.charAt(0));
        System.out.println("Suggested nickname: " + n1.toLowerCase() + "_" + n3.toLowerCase());
        break;
      case 3:
        System.out.println("\nThe initials for " + n6 + " is " + n2.charAt(0) + n1.charAt(0));
        System.out.println("Suggested nickname: " + n2.toLowerCase() + "_" + n1.toLowerCase());
        break;
      case 4:
        System.out.println("\nThe initials for " + n7 + " is " + n2.charAt(0) + n3.charAt(0));
        System.out.println("Suggested nickname: " + n2.toLowerCase() + "_" + n3.toLowerCase());
        break;
      case 5:
        System.out.println("\nThe initials for " + n8 + " is " + n3.charAt(0) + n1.charAt(0));
        System.out.println("Suggested nickname: " + n3.toLowerCase() + "_" + n1.toLowerCase());
        break;
      case 6:
        System.out.println("\nThe initials for " + n9 + " is " + n3.charAt(0) + n2.charAt(0));
        System.out.println("Suggested nickname: " + n3.toLowerCase() + "_" + n2.toLowerCase());
        break;
      default:
        System.out.println("Your entered number exceed the limit.");
    }
    
    
    sc.close();
  }
}
