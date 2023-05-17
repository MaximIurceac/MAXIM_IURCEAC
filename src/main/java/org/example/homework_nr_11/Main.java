package org.example.homework_nr_11;


import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Function<String, Integer> countConsonants = str -> {
            int count = 0;
            for (char c : str.toLowerCase().toCharArray()) {
                if (c >= 'a' && c <= 'z' && !"aeiou".contains(Character.toString(c))) {
                    count++;
                }
            }
            return count;
        };
        System.out.println(countConsonants.apply("Hello World"));

        Function<String, Integer> countVowels = str -> {
            int count = 0;
            for (char c : str.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        };
        System.out.println(countVowels.apply("Hello World"));

        Function<String, Integer> countNumbers = str -> {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        };
        System.out.println(countNumbers.apply("Hello 123 World 456")); // Output: 6

        Function<String, Character> firstCharOrNullOrNull = str -> {
            if (str.length() % 2 == 0) {
                return null;
            } else {
                return str.charAt(0);
            }
        };
        System.out.println(firstCharOrNullOrNull.apply("Hello World"));
        System.out.println(firstCharOrNullOrNull.apply("Hello"));


        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str.toLowerCase()).reverse().toString();
            return str.equals(reversed);
        };
        System.out.println(isPalindrome.test("Anna"));
        System.out.println(isPalindrome.test("Hello"));

        Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(isPrime.test(7));
        System.out.println(isPrime.test(12));



    }

    public static void countAll(Function<String, Integer> inputFunction, String inputString) {
        System.out.println("Number of consonants: " + inputFunction.apply(inputString));

    }


}




