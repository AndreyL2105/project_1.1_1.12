package org.example;

import java.util.Arrays;

public class ForFindMax {
    public static int findMax(int[] arr){
        return Arrays.stream(arr).max().orElseThrow();
    }
}
