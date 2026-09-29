package org.example;

public class ForCheckAccess {
    public static String checkAccess(int age){
        if(age>18)
            return "Allowed";
        else
            return "Denied";
    }
}
