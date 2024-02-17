class variables {


    public void casting_variables() {
        byte first_byte;
        int int_byte = 127;

        first_byte = (byte) int_byte;
        byte b = 127;
        int i = 127;

        b = (byte) i; // casting, explicitly conversing integer into a byte
        i = b; // this is just a conversion, implicitly a byte is assigned to a integer and is becoming an integer

        float f = 5.7f;
        int ii = (int) f; // casting
        int fi = (int) 5.6;

        // assigning an integer to a byte
        int integer = 310; // out of range for byte
        byte byte_to_int;
        byte_to_int = (byte) integer; // type casting
    }
}
