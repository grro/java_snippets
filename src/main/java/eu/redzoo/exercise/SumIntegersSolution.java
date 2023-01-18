package eu.redzoo.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class SumIntegersSolution {

    public static void main(String[] args) {
        // When you have a List of null values and Lists of Integers and null
        // values, how would you calculate the sum of all integers using java 8 ?

        List<Integer> l1 = Arrays.asList(1,null,2,null,3);
        List<Integer> l2 = Arrays.asList(3,null,4,null,5);
        List<List<Integer>> list = Arrays.asList(l1, null, l2);

        System.out.println("sum = " + sumLists(list));
    }

    public static int sumLists(List<List<Integer>> listOfList) {
        List<List<Integer>> listOfNoneNullList = listOfList.stream().filter(Objects::nonNull).toList();
        return listOfNoneNullList.stream().mapToInt(listWithNullValues -> listWithNullValues.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).sum()).sum();
    }

}
