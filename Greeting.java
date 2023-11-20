import java.util.*;
public class Greeting {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        PriorityQueue<String> nickname = new PriorityQueue();
        
        
        System.out.println("Enter the nicknames of 4 of your classmates: ");
        for (int i = 0; i < 4; i++) {
            String nicknames = input.nextLine();
            nickname.offer(nicknames);
        }
        System.out.println("Press H to say Hi to each of them:" );
        while (!nickname.isEmpty()) {
          String H = input.next().toUpperCase();
          if(H.equals("H")){
              String Hi = nickname.poll();
              System.out.println("Hi " + Hi + "!" );
          }
          else{
              System.out.println("Invalid input H nga e kulit mo." );
          } 
        }
        System.out.println("Done saying Hi." );
        
    }
}