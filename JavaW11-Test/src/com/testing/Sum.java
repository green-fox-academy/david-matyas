package com.testing;

import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumber= new ArrayList<>();
        listOfNumber.add(50);
        listOfNumber.add(30);
        listOfNumber.add(20);
        //  System.out.println(sumValues(listOfNumber));
    }
    public static Integer sumValues(ArrayList numbers){
        if(numbers == null){
            return 0;
        }
        int sum = 0;
        for (Object number : numbers) {
            sum += (int) number;
        }
        return sum;
    }
}
