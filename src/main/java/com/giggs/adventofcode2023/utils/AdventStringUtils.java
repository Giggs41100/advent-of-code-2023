package com.giggs.adventofcode2023.utils;

import java.util.Scanner;

public class AdventStringUtils {
    public static Integer decodeFirstAndLastDigit(String s) {
        String result = "";
        System.out.println("Ligne : " + s);

        for (int i = 0; i < s.length() ; i++) {
            if (Character.isDigit(s.charAt(i))) {
                result = result + s.charAt(i);
                break;
            }
        }

        for (int j = s.length()-1; j >= 0 ; j--) {
            if (Character.isDigit(s.charAt(j))) {
                result = result + s.charAt(j);
                break;
            }
        }
        System.out.println("Résultat : "+result);
        return Integer.valueOf(result);
    }

    public static Integer decodeFirstAndLastDigitWithLitteral(String s) {
        var result = "";
        System.out.println("Ligne : " + s);

        for (int i = 0; i < s.length() ; i++) {
            if (Character.isDigit(s.charAt(i))) {
                result = Character.toString(s.charAt(i));
                break;
            }
            if (AdventStringUtils.containsLitteralDigit(s.substring(0, i + 1))) {
                result = AdventStringUtils.convertLitteralDigit(s.substring(0, i + 1));
                break;
            }
        }

        for (int j = s.length()-1; j >= 0 ; j--) {
            if (Character.isDigit(s.charAt(j))) {
                result = result + s.charAt(j);
                break;
            }
            if (AdventStringUtils.containsLitteralDigit(s.substring(j))) {
                result = result + AdventStringUtils.convertLitteralDigit(s.substring(j));
                break;
            }
        }
        System.out.println("Résultat : "+result);
        return Integer.valueOf(result);
    }

    public static boolean containsLitteralDigit(String s) {
        return (!(s.equals(AdventStringUtils.convertLitteralDigit(s))));
    }

    public static String convertLitteralDigit(String s) {
        if (s.contains("one")) return  "1";
        if (s.contains("two")) return  "2";
        if (s.contains("three")) return  "3";
        if (s.contains("four")) return  "4";
        if (s.contains("five")) return  "5";
        if (s.contains("six")) return  "6";
        if (s.contains("seven")) return  "7";
        if (s.contains("eight")) return  "8";
        if (s.contains("nine")) return  "9";
        return s;
    }

    public static boolean isNotAValidGame(String s) {
        var g = Game.parseAsGame(s);
        return g.isNotAValidGame();
    }

    public static int getGameId(String s) {
    }
}
