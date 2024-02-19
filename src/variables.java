import java.sql.SQLOutput;

class variables {


    public void casting_variables() {
        // casting vs conversion
        int i = 356;
        byte b = (byte) i; // casting, explicitly conversing integer into a byte, but by a modulo

        System.out.print("integer " + i + " becomes " + b + " after casting to byte \n");

        float f = 5.7f;
        int ii = (int) f; // casting

        System.out.printf("float %f becomes %d after casting to int", f, b);

        byte bb = 10;
        byte cc = 30;

        int promoted_byte = bb * cc; // if the result of byte multiplication exceeds byte range (-128 to 127) it will be promoted to int
        
        int num1 = 7;
        int num2 = 5;
        
        int result = num1 / num2;
        System.out.println("result = " + result);
        
    }
}
