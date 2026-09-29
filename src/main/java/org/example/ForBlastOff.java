package org.example;

public class ForBlastOff {
    public static String blastOff(int start){
        StringBuilder result = new StringBuilder("<<");
        while (start!=0){
            result.append(start);
            result.append(" ");
            if (start==1)result.append("Поехали!>>");
            start --;
        }
        return result.toString();
    }
}
