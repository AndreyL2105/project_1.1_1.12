package org.example;

public class ForGetEvenInRange {
    public static String getEventRange(int start, int end){
        StringBuilder result = new StringBuilder("<<");
        for (int i = start; i<end+1; i++){
            if (i%2==0){
            result.append(i);
            if (i!=end && i != end-1){
                result.append(" ");
                }
            }
        }
        result.append(">>");
        return result.toString();
    }
}
