package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String s = "Hello World";
        return s;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        String newString = firstSegment + secondSegment;
        return newString;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String newString = Integer.toString(firstSegment) + secondSegment;
        return newString;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String newString =  input.substring(0, 3);
        return newString;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String newString = input.substring(input.length()-3, input.length());
        return newString;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        Boolean newBool = inputValue.equals(comparableValue);
        return newBool;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int length = inputValue.length();
        Character middleCharacter;
        if (length % 2 == 0){
            middleCharacter = inputValue.charAt((length/2)-1);
            return middleCharacter;
        } else {
            middleCharacter = inputValue.charAt(length/2);
            return middleCharacter;
        }
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String array[] = spaceDelimitedString.split(" ", 2);
        String firstWord = array[0];
        return firstWord;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String array[] = spaceDelimitedString.split(" ", 3);
        String secondWord = array[1];
        return secondWord;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        char[] input = stringToReverse.toCharArray();
        int i = 0;
        int j = input.length - 1;
        char temporary;
        while ( j > i ){
            temporary = input[i];
            input[i] = input[j];
            input[j] = temporary;
            j = j - 1;
            i = i+ 1;
        }
        return new String(input);
    }
}
