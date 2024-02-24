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
    public void say_and_say_inside(int main_phrase, int phrase_inside_main_phrase) {
        int first_loop_int = 0;
        int second_loop_int = 0;

        while (first_loop_int < main_phrase) {
            System.out.printf("%d: Hi\n", first_loop_int);

            first_loop_int++;
            // incrementing the number to reach the desired count of repetitions
            while (second_loop_int < phrase_inside_main_phrase) {
                System.out.printf("\t%d Whaaatsuup\n", second_loop_int);
                // incrementing the number to reach the desired count of repetitions inside the first loop
                second_loop_int++;
            }
            // needs to be reset, otherwise it will only print once inside the first loop
            second_loop_int = 0;
        }
    }
}
