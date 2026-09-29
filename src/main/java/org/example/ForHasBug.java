package org.example;

public class ForHasBug {
    public static Boolean hasBug(String[] messages){
        boolean result = false;
        for (String string: messages){
            if (string.equalsIgnoreCase("Bug")){
                result = true;
                break;
            }
        }
        return result;
    }
}
