import java.util.ArrayList;
import java.util.Arrays;

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
}


















































