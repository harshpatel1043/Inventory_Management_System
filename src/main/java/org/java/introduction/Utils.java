package org.java.introduction;

public class Utils {
    public static boolean validateString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public static boolean validatePositiveNumber(int num) {
        return num > 0;
    }

    public static boolean validatePositiveNumber(double num) {
        return num > 0;
    }
}

