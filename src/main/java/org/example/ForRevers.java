package org.example;

import java.util.Arrays;
import java.util.Collections;

public class ForRevers {
    public static String[] revers(String[] arr){
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
}
