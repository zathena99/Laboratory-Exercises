/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kahitano;

import java.util.*;

public class RunAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bird b = new Bird();
        Cat c = new Cat();
        Dog d = new Dog(); 
        
        System.out.println("Choose Animal");
        System.out.println("Press B for Bird");
        System.out.println("Press C for Cat");
        System.out.println("Press D for Dog");
        System.out.print("Input: ");
        String xyz = sc.nextLine().toUpperCase();
        
        if (xyz.matches("B")){
            b.eat();
            b.sleep();
            b.makeSound();
         
        } else if (xyz.matches("C")){
            c.eat();
            c.sleep();
            c.makeSound();
            
        } else if (xyz.matches("D")){
            d.eat();
            d.sleep();
            d.makeSound();
                 
        } else {
            System.out.println("Invalid Input");
        }
        
        
    }
    
}
