package datastructure.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    /*
     *
     * demonstrate how to use ArrayList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {
        ArrayList<String> Family = new ArrayList<>();
        Family.add("Father");
        Family.add("Mother");
        Family.add("Brother");
        Family.add("Sister");
        Family.add("uncle");
        Family.add("cousin");
        // création Iterator
        Iterator<String> iterator = Family.iterator();

        // for each loop
        System.out.println("print ArrayList with for each loop");
        for(Iterator i=Family.iterator();i.hasNext();){
            System.out.println((i.next()));
        }
        Family.remove(4);
        Family.remove(3);
        System.out.println("Arraylist after removing elements");
        System.out.println("print ArrayList with for loop using Iterator");
        // for loop with Iterator
        for(String element:Family){
            System.out.println(element);
        }
        System.out.println("print ArrayList with while loop using Iterator");
        // while loop with Iterator
        //note I commented out the while loop because the iterator of the for loop is already at the end
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
