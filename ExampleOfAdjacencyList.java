import java.util.ArrayList;

//Example of AdjacenyList
public class ExampleOfAdjacencyList {

    public static void main(String[] args) {

        ArrayList<ArrayList> aList = new ArrayList<>();



        char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};



        int num = 7;

        

        for(int i = 0; i <= num; i++){

            aList.add(new ArrayList<>());

        }



        aList.get(0).add("B");

        aList.get(1).add("A");

        aList.get(1).add("C");


        aList.get(2).add("B");
        aList.get(2).add("D");

        aList.get(2).add("E");



        aList.get(3).add("C");

        aList.get(3).add("E");

        aList.get(3).add("F");

        aList.get(3).add("G");



        aList.get(4).add("C");

        aList.get(4).add("D");

        aList.get(4).add("F");



        aList.get(5).add("D");

        aList.get(5).add("E");



        aList.get(6).add("D");




        int v = 0;

        for(int i = 0; i < num; i++, v++){

            System.out.println(vertices[v] + ": " + aList.get(i));

        }




    }

}