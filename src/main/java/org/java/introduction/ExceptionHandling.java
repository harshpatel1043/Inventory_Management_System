package org.java.introduction;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ExceptionHandling {
    public static void handleException(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    public static void handleInputMismatchException(InputMismatchException e) {
        System.out.println("Input type is mismatched. Please enter the correct type.");
    }

    public static void handleNoSuchElementException(NoSuchElementException e) {
        System.out.println("Element not found.");
    }

    public static void handleIllegalArgumentException(IllegalArgumentException e) {
        System.out.println("Illegal argument: " + e.getMessage());
    }
}
