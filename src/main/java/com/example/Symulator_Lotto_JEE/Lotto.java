package com.example.Symulator_Lotto_JEE;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lotto {


    //this method returns list of number wchich are the same
    static List<Integer> getCommonElements(List<Integer> source, List<Integer> target){
        ArrayList<Integer> integers = new ArrayList<>(source);
        integers.retainAll(target);
        return integers;
    }

    //this method returns list of 6 random numbers
    static List<Integer> getRandomNumbers(){
        java.util.List<Integer> listOfNumbers = IntStream.rangeClosed(1, 49)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(listOfNumbers);
        return listOfNumbers.subList(0,6);
    }
}
