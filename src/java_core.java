import java.util.Arrays;
import java.util.Scanner;
class Student {
    String name;
    int age;
    int id;
}





class java_core {

    public void casting_variables() {
        // casting vs conversion
        int i = 356;
        byte b = (byte) i; // casting, explicitly conversing integer into a byte, but by a modulo

        System.out.print("integer " + i + " becomes " + b + " after casting to byte \n");

        float f = 5.7f;
        int ii = (int) f; // casting

        System.out.printf("float %f becomes %d after casting to int\n", f, b);

        byte bb = 10;
        byte cc = 30;

        int promoted_byte = bb * cc; // if the result of byte multiplication exceeds byte range (-128 to 127) it will be promoted to int
        
        int num1 = 7;
        int num2 = 5;
        
        int result = num1 / num2; // integer division is weired! This will return 1!!!
        System.out.println("Integer division result = " + result);

        // To get the correct division quotient
        double divided_num = (double) num1 / num2;
        System.out.println("Integer division as a double result = " + divided_num);

        // various methods to increment/decrement
        int num_add_sub = 1;

        num_add_sub = num_add_sub + 1;
        num_add_sub += 1;
        num_add_sub++; // post - increment, one fetch the value and then increment
        ++num_add_sub; // pre - increment

        // same principle for subtraction
        num_add_sub = num_add_sub - 1;
        num_add_sub -= 1;
        num_add_sub--; // post - increment, be careful because here the value will be fetched and stored one and then incremented
        --num_add_sub; // pre - increment, here the subtraction is done one and then the value is fetched
    }
    public void comparison_and_or() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;

        // result will only be true if both expressions are true
        // true and false will return false and vice versa
        boolean result_and_false_true = one > two && three < four;
        System.out.printf("First false AND second true will return %b \n", result_and_false_true);

        boolean result_and_true_false = three < four && one < two;
        System.out.printf("First true AND second false will return %b \n", result_and_true_false);

        // If one is true, the overall result will be true
        // only when both are false, the result be false
        boolean result_or_false_true = three > four || one > two; // false
        System.out.printf("First false OR second true will return %b \n", result_or_false_true);

        boolean result_or_true_false = three < four || one > two; // true
        System.out.printf("First false OR second true will return %b \n", result_or_true_false);
    }
    public void if_else_short() {
        int result = 9;

//        if (result < 10) {
//            result = 20;
//        } else {
//            result = 100;
//        }

        // or we can use a shorter statement
        result = result < 10 ? 330: 100;

        System.out.println(result);
    }
    public void first_switch(int day) {
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Unknown day");
        }
    }
    public void repeat_sentence (int how_many_repetitions) {
        while (how_many_repetitions > 0) {
            System.out.printf("%d: Writing \n", how_many_repetitions);
            how_many_repetitions--;
        }
    }
    public void loop_increment() {
        int i = 0;

        while (true) {
            System.out.println("Hi " + i);
            i++;
        }
    }
    // say something n times and print n times under the first phrase
    public void say_and_say_inside(int len_main_phrase, int len_ins_phrase) {
        int fst_lp_len = 0;
        int scnd_lp_len = 0;

        while (fst_lp_len < len_main_phrase)
        {
            System.out.printf("%d: Hi\n", fst_lp_len + 1);
            fst_lp_len++;

            // incrementing the number to reach the desired count of repetitions
            while (scnd_lp_len < len_ins_phrase)
            {
                System.out.printf("\t%d Whaaatsuup\n", scnd_lp_len + 1);
                // incrementing the number to reach the desired count of repetitions inside the first loop
                scnd_lp_len++;
            }
            // needs to be reset, otherwise it will only print once inside the first loop
            scnd_lp_len = 0;
        }
    }
    // do while loop
    public void cnt_num_dwn() {
        int num = new Scanner(System.in).nextInt();

        do {
            System.out.printf("%d\n", num);
            num--;
        } while (num > 0);
    }
    // for loop
    public void for_loop() {
        for (int k = 0; k < 10; k++) {
            System.out.println("k = " + k);
        }
    }

    public void nested_for_loop() {
        String[] days = {"Mo", "Tue", "Wed", "Thur", "Fr", "Sat", "Sun"};

        for (int day = 0, day_number = 0; day < days.length; day++, day_number++) {
            System.out.printf("day %d is %s\n ", day_number + 1, days[day]);
        }
    }

    // print the week days and number of pull ups, increasing every day
    public static void exercise_plan() {
        String[] week_days = {"Mo", "Tue", "Wed", "Thur", "Fr", "Sat", "Sun"};

        for (int dayIndex = 0, pullUpCount = 1; dayIndex < week_days.length; dayIndex++, pullUpCount++) {
            if (pullUpCount == 1) {
                System.out.printf("On %s you did %d pull up\n", week_days[dayIndex], pullUpCount);
            } else {
                System.out.printf("On %s you did %d pull ups\n", week_days[dayIndex], pullUpCount);
            }
        }
    }

    public static Object[][] dayWeekMonth() {
        // month, date, day
        Object[][] calendarObject = new Object[12][];

        String[] monthArray = {"Jan", "Feb", "March", "April", "Mai", "June", "July", "Aug", "Sep", "Okt", "Nov", "Dec"};
//      String[] weekDay = {"Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday"};

        int[] monthLength = {31,29,31,30,31,30,31,31,30,31,30,31};

        for (int month = 0; month < 12; month++) {
            calendarObject[month][0] = monthArray[month];
            // System.out.println(calendarObject[month][0]);

            for (int date = 0; date < monthLength[month]; date++) {
                calendarObject[month][date + 1] = date + 1;
                // System.out.println(calendarObject[month][date]);
                // System.out.println(calendarObject[month][date]);
            }
        }
        return calendarObject;
    }

    public static Object[][] dayWeekMonthAnthro() {
        // jagged array (inner array can have different
        Object[][] calendarObject = new Object[12][];
        String[] monthArray = {"Jan", "Feb", "March", "April", "Mai", "June", "July", "Aug", "Sep", "Okt", "Nov", "Dec"};
        int[] monthLength = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int month = 0; month < 12; month++) {
            // Initialize inner array
            calendarObject[month] = new Object[monthLength[month] + 1];
            calendarObject[month][0] = monthArray[month];

            for (int date = 0; date < monthLength[month]; date++) {
                calendarObject[month][date + 1] = date + 1;
            }
        }
        for (int i = 0; i < calendarObject.length; i++) {
            System.out.printf("Row %d and Value %s \n", i, Arrays.toString(calendarObject[i]));
        }
        return calendarObject;
    }


    public static int[][] multiDimArrayLong() {
        int[][] mdArr = new int[3][4];

        for (int outerArray = 0; outerArray < 3 ; outerArray++) {
            for (int inner = 0; inner < 4; inner++) {
                mdArr[outerArray][inner] = (int) (Math.random() * 100);
            }
        }
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 0; inner < 4; inner++) {
                System.out.print(mdArr[outer][inner] + " ");
            }
            System.out.println();
        }
        return mdArr;
    }

    public static int[][] multiDimArrayShort() {
        int[][] mdArr = new int[3][4];
        for (int outerArray = 0, innerArray = 0; outerArray < 3 | innerArray < 4; outerArray++, innerArray++) {
            mdArr[outerArray][innerArray] = (int) (Math.random() * 100);
        }
        return mdArr;
    }

    public static int[][] randomSizedMultiJaggedArray() {
        // jagged array (inner array can have different lengths)
        // fill the inner array with random numbers
        // loop through the outer array and print the inner array

        // create the outer array
        int[][] jaggedArray = new int[3][];

        // loop through the outer array and fill the inner array with random numbers
        for (int outer = 0; outer < jaggedArray.length; outer++) {
            jaggedArray[outer] = new int[(int) (Math.random() * 10)];
            for (int inner = 0; inner < jaggedArray[outer].length; inner++) {
                jaggedArray[outer][inner] = (int) (Math.random() * 10);
            }
        }

        for (int x = 0; x < jaggedArray.length; x++) {
            System.out.println(Arrays.toString(jaggedArray[x]));
        }
        return jaggedArray;
    }
}

































































