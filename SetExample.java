import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        // Create two sets
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // Add elements to the first set (MGA TANK)
        set1.add("ALISTAR");
        set1.add("BRAUM");
        set1.add("GALIO");
        set1.add("PANTHEON");
        set1.add("TAMH KENCH");

        // Add elements to the second set (MGA SUPPORT)
        set2.add("JANNAH");
        set2.add("THRESH");
        set2.add("KARMA");
        set2.add("TAMH KENCH");
        set2.add("GALIO");

        System.out.println("\nTank Champions: " + set1 + "\n");
        System.out.println("Support Champions: " + set2);
        // Union of sets
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("\nUnion of sets: " + unionSet);

        // Intersection of sets
        Set<String> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection of sets: " + intersectionSet);

        // Difference of sets (elements in set1 for set2)
        Set<String> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference of sets (set1 - set2): " + differenceSet);

        // Difference of sets (elements in set2 for set1)
        Set<String> differenceSet2 = new HashSet<>(set2);
        differenceSet2.removeAll(set1);
        System.out.println("Difference of sets (set2 - set1): " + differenceSet2);
    }
}
