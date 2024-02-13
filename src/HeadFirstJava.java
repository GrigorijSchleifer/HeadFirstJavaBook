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

        int number_int_parsed =  (int) 10;
        double number_double = 1.3;

        System.out.printf("Parsed double to integer: %d and just double %f \n", number_int_parsed, number_double);

        while(drug.concentration < 2) {
            System.out.print();
            number_int_parsed = number_int_parsed - 1;
        }
    }
    // hello
}
