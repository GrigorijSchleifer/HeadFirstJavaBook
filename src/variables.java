import java.sql.SQLOutput;

class variables {


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
        num_add_sub++; // post - increment, first fetch the value and then increment
        ++num_add_sub; // pre - increment

        // same principle for subtraction
        num_add_sub = num_add_sub - 1;
        num_add_sub -= 1;
        num_add_sub--; // post - increment, be careful because here the value will be fetched and stored first and then incremented
        --num_add_sub; // pre - increment, here the subtraction is done first and then the value is fetched



    }
}
