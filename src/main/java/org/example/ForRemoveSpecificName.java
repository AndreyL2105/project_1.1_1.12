package org.example;

import java.util.ArrayList;
import java.util.List;

public class ForRemoveSpecificName {
    public static List<String> removeSpecificName(List<String> list, String nameToRemove){
        List<String> list2 = new ArrayList<>();
        for (String str: list){
            if (!str.equalsIgnoreCase(nameToRemove)){
                list2.add(str);
            }
        }
        return list2;
    }
}
