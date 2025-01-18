package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int x) {
        String reverse = "";
        String[] chars = Integer.toString(Math.abs(x)).split("");
        for (int i = chars.length; i > 0; i--) {
            reverse += chars[i - 1];
        }
            return Integer.parseInt(reverse) == Math.abs(x);
    }

    public static boolean isPerfectNumber(int x) {
        if (x < 0)
            return false;

        int sum = 0;

        for (int i = 1; i < x; i++) {
            if(x % i == 0) {
                sum += i;
            }
        }
        return sum == x;
    }

    public static String numberToWords(int x) {
        if (x < 0)
            return "Invalid Value";
        String[] chars = Integer.toString(x).split("");
        String [] strNum = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

        String [] wordsArr = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            wordsArr[i] = strNum[Integer.parseInt(chars[i])];
        }
        return String.join(" ", wordsArr);
    }
}