package datastructure.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        LinkedList<String> fruitsList = new LinkedList<>();
        fruitsList.add("apple");
        fruitsList.add("pineapple");
        fruitsList.add("banana");
        fruitsList.add("strawberry");
        fruitsList.add("orange");
        fruitsList.add("Pear");
        //for each loop
        for( String fruits: fruitsList){
            System.out.println(fruits);
        }
        //remove éléments
        fruitsList.remove("strawberry");
        fruitsList.remove("pineapple");;

        //for loop with Iterator

        Iterator<String> iterator = fruitsList.iterator();
        for(Iterator i = fruitsList.iterator(); i.hasNext(); ) {

            System.out.println(i.next());
        }
        //while loop with Iterator
       while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
