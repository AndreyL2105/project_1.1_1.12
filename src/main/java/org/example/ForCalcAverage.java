package org.example;

import java.util.List;

public class ForCalcAverage {
    public static int calcAverage(List<Integer> list){
        int average = 0;
        if(!list.isEmpty()){
            int sum = 0;
            for (Integer num: list){
                sum = sum+num;
            }
            average = sum / list.size();
        }
        return average;
    }
}
