package eu.redzoo.exercise;

import java.util.Arrays;
import java.util.List;


public class SumIntegers {

    public static void main(String[] args) {
        // When you have a List of null values and Lists of Integers and null
        // values, how would you calculate the sum of all integers using java 8 ?

        List<Integer> l1 = Arrays.asList(1,null,2,null,3);
        List<Integer> l2 = Arrays.asList(3,null,4,null,5);
        List<List<Integer>> list = Arrays.asList(l1, null, l2);

        System.out.println("sum = " + sumLists(list));
    }

    public static int sumLists(List<List<Integer>> listOfList) {
        // .. to be implemented ...
        return 0;
    }

}
