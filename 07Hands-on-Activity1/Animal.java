/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kahitano;

/**
 *
 * @author Complab503-1PC
 */
import java.util.*;

abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();
}
class Bird extends Animal {
        public void eat(){
            System.out.print("The Bird eat Cereals ");
}
        public void sleep(){
            System.out.print(" and the Bird sleep 3hours a day ");
}
        public void makeSound(){
            System.out.println("\nTweet Tweet");
        }
}
        
class Cat extends Animal {
        public void eat(){
            System.out.print("The eats chocolates");
        }
        public void sleep(){
            System.out.print(" and Cats love to sleep nonstop");
        }
        public void makeSound(){
            System.out.println("\nMEEEEEOWWWWWWW");
        }
}                
class Dog extends Animal {
        public void eat(){
            System.out.print("dogs loves to eat bone");          
        }
        public void sleep() {
            System.out.print(" and the dogs loves to sleep 5hours");
            
        }
        public void makeSound() {
            System.out.println("\nARFFFFF ARFFF");
        }
}

   

    
        
