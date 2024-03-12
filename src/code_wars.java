import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class code_wars {
    public void cnvrt_bool_str(boolean b) {
        /**
         *
         */
        System.out.println(String.valueOf(b));
    }

    public int[] number_to_reversed_arr(long n) {
        /**
         * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
         * https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/java
         */

        // no need to convert long to string and then create an array with a length of n
        int[] digits = new int[Long.toString(n).length()];
        // System.out.println(Arrays.toString(digits));

        // Use two variables (i for string index, j for array index)
        for (int stri = digits.length - 1, arri = 0; stri >= 0; stri--, arri++) {
            digits[arri] = Long.toString(n).charAt(stri) - 48;
        }
        return digits;
    }


    public static int[] reverse_number(long n) {
        String numAsString = Long.toString(n);
        int[] digits = new int[numAsString.length()];

        for (int stringIndex = numAsString.length() - 1, arrayIndex = 0; stringIndex >= 0; stringIndex--, arrayIndex++) {
            digits[arrayIndex] = Character.getNumericValue(numAsString.charAt(stringIndex));
        }
        return digits;
    }

    public static int sumUpNumber(int n) {
        int numberToSum = 0;
        for (int increasingNumber = 0; increasingNumber <= n; increasingNumber++) {
            numberToSum = numberToSum + increasingNumber;
        }
        return numberToSum;
    }


    public static String updateLight(String current) {
        String[] trafficLights = {"green", "yellow", "red"};
        String nextLight = null;

        int index = Arrays.binarySearch(trafficLights, current);

        switch (index) {
            case 0:
                nextLight = trafficLights[index + 1];
                break;
            case 1:
                nextLight = trafficLights[index + 1];
                break;
            default:
                nextLight = trafficLights[0];
        }
        return nextLight;
    }


    public static String nextLight(String current) {
        switch (current) {
            case "red": return "green";
            case "yellow": return "red";
            case "green": return "yellow";
            default: throw new IllegalArgumentException();
        }
    }

    public static int[] reverse(int n) {
        int[] array_to_fill = new int[n];
        // no curly braces needed if the loop contains only one line
        for (int k = n, j = 0; k > 0; k--, j++)
            array_to_fill[j] = k;

        return array_to_fill;
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;

        // Cat: 15 (first year), +9 (second year), +4 (each next year)
        // Dog: 15 (first year), +9 (second year, +5 (each next year)
        for (int cat = 1, dog = 1; cat <= humanYears; cat++, dog++) {
            if (cat == 1 | dog == 1) {
                catYears = catYears + 15;
                dogYears = dogYears + 15;
            } else if (cat == 2 | dog == 2) {
                catYears = catYears + 9;
                dogYears = dogYears + 9;
            } else {
                catYears = catYears + 4;
                dogYears = dogYears + 5;
            }
        }
        return new int[] {humanYears, catYears, dogYears};
    }

    public static boolean isLove(final int flower1, final int flower2) {
        // return (flower1 + flower2) % 2 != 0;
        return ((flower1 + flower2) % 2 == 0) ? false: true;
    }

    public static String greet(String name) {
        // Scanner scanner = new Scanner(System.in);
        return "Hello " + name + "how are you doing today?";
    }
    public int cockroachSpeed(double x){
        return (int) Math.floor((x * 100000) / 3600);
    }

    public static String howMuchILoveYou(int nb_petals) {
        String[] petal_words = {"I love you",
                "a little",
                "a lot",
                "passionately",
                "madly",
                "not at all"};

        // if nb_petals is > petal_words.length start from 0
        if (petal_words.length > nb_petals | (nb_petals % petal_words.length == 0)) {
            return petal_words[(nb_petals - 1)];
        } else {
            System.out.printf("petals_words length: %d, nb_petals: %d, and modulo: %d, reverse modulo: %d\n", petal_words.length , nb_petals, ((nb_petals % petal_words.length) - 1), (petal_words.length % nb_petals));
            // System.out.printf("reverse modulo: %d\n", (petal_words.length % nb_petals));
            return petal_words[nb_petals % petal_words.length];
        }
    }

}


















































