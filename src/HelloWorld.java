// class declaration, always needed
public class HelloWorld {
    public static int test_integer = 1;

    public static int getTest_integer(){
        return test_integer;
    }

    public static void main(String[] args){

        Drugs drug = new Drugs();
        drug.infusion();
        System.out.printf("%d is from inside the main method \n", test_integer);

        int number_int_parsed = (int) 1.3;
        double number_double = 1.3;

        System.out.printf("Parsed double to integer: %d and just double %f", number_int_parsed, number_double);
    }
    // not sure there is no green check in github
}
