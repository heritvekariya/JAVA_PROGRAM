package Exbounded;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	
        // Upper Bound: Copying elements from List<Integer> to List<Number>
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<Number> numberList = new ArrayList<>();
        Exbounded.copy(integerList, numberList);
        System.out.println("Copied from Integer List to Number List: " + numberList);

        // Lower Bound: Copying elements from List<Double> to List<Object>
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        List<Object> objectList = new ArrayList<>();
        Exbounded.copy(doubleList, objectList);
        System.out.println("Copied from Double List to Object List: " + objectList);
    }
}
