import java.util.*;
import java.util.regex.*;

class BloodData {

    private String BloodType;
    private String RhFactor;
    
    public BloodData() {
        this.BloodType = "O";
        this.RhFactor = "+";
    }
    
    public String getBloodType() {
        return BloodType;
    }
    
    public String getRhFactor() {
        return RhFactor;
    }
    
    public void setBloodType(String bloodType) {
        this.BloodType = bloodType;
    }
    
    public void setRhFactor(String rhFactor) {
        this.RhFactor = rhFactor;
    }
    
    public void display() {
        System.out.println(BloodType + RhFactor + " is added to the bloodbank.");
    }
}
    
public class RunBloodData {
        public static void main (String[] args) {
            
            Scanner sc = new Scanner (System.in);
            BloodData bd = new BloodData();
            String inp1,inp2;
            
        do {

            System.out.print("Enter blood type of patient(O, A, B, AB): ");  
            inp1 = sc.nextLine().toUpperCase();

            Pattern p = Pattern.compile("[OAB]|AB|");
            Matcher m = p.matcher(inp1);

            if (m.matches()) {
                bd.setBloodType(inp1);
                break;
            }
            else {
                System.out.println("Please enter O, A, B, or AB only");
            }

        } while (true);

        do {

            System.out.print("Enter the Rhesus factor (+ or -): ");
            inp2 = sc.nextLine();

            Pattern p2 = Pattern.compile("[-+]| |");
            Matcher m2 = p2.matcher(inp2);    

            if (m2.matches()) {
                bd.setRhFactor(inp2);
                break;
            }
            else {
                System.out.println("Please enter '+' or '-' only");
            }

        } while (true);

                if (inp1.isEmpty() && inp2.isEmpty()) {
                    BloodData bd2 = new BloodData();
                    bd2.display();
                }
                else {
                    System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank");
                }
        
                sc.close();

    }
}