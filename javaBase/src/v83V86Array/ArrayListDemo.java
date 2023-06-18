package v83V86Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = "+ number.size());

        // adding elements
        number.add(10);
        number.add(50);
        number.add(30);
        number.add(3,40);

        for (int x : number){
            System.out.println(""+x);
        }
        
        Iterator itr = number.iterator();
        while (itr.hasNext()){
            System.out.println("Itr ="+itr.next());
        }

        System.out.println(number);
        System.out.println("size = "+ number.size());

        number.remove(2);
        System.out.println("After removing :" +number);
        number.removeAll(number);
        System.out.println("after removing all"+number);
        number.add(10);
        number.add(50);
        number.add(30);
        number.add(3,40);
        Collections.sort(number);
        System.out.println("after sorting :"+number);

        Collections.sort(number,Collections.reverseOrder());
        System.out.println("after sorting decending :"+number);

    }

}
