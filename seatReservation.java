import java.util.Scanner;

		public class seatReservation {
		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int[][] seats = new int[10][4];
		        System.out.println("Bus Seat Reservation:");
		        while (true) {
		            System.out.println("Col 1 Col 2 Col 3 Col 4");
		            for (int i = 0; i < seats.length; i++) {
		                System.out.print("row " + (i + 1) + " | ");
		                for (int j = 0; j < seats[i].length; j++) {
		                    System.out.print(seats[i][j] == 0 ? "* " : "X ");
		                }
		                System.out.println();
		            }
		            System.out.print("Enter row and column no. to reserve separated by space (enter negative no. to exit): ");
		            int row = in.nextInt();
		            int column = in.nextInt();
		            if (row < 0 || column < 0) {
		                break;
		            }
		            seats[row - 1][column - 1]++;
		        }
		    }

	}