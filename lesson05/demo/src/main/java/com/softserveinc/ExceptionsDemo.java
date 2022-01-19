package com.softserveinc;

import java.time.LocalDate;

public class ExceptionsDemo {
    public static void main(String[] args) {
        // main(null);
        /*System.out.println("Begin");
        int a = 4;
        int b = 0;
        System.out.print("a/0 = ");
        try {
           test(a, b);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } catch (Throwable ex) {
            System.out.println("Catch exception: " + ex);
        } finally {
            System.out.println("Execute always");
        }
        System.out.println("End");
        Object obj = "";
        obj = 1; // int -> Integer*/
        try {
            System.out.println("birthYear(18) = " + birthYear(18));
            System.out.println("birthYear(-18) = " + birthYear(-18));
        } catch (IllegalAgeException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Return birth year
     *
     * @param age age, should be positive
     * @return birth year
     */
    static int birthYear(int age) throws IllegalAgeException {
        if (age < 0) {
            throw new IllegalAgeException("Age should be positive");
        }
        return LocalDate.now().getYear() - age;
    }

    static void test(int a, int b) {
        System.out.println("Before exception");
        System.out.println(a / b); // RuntimeException
        System.out.println("After exception");
    }
}

class IllegalAgeException extends Exception {
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
