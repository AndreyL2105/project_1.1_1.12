package org.example;

import java.util.List;

public class ForRemoveSpecificName {
    public static List<String> removeSpecificName(List<String> list, String nameToRemove){
        for (String str: list){
            if (str.equalsIgnoreCase(nameToRemove)){
                list.remove(nameToRemove);
            }
        }
        return list;
    }
}
