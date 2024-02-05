// classes are like files in Java
class HelloWorld {
    // primitive types (there are 8 primitive types in Java) and the start with a lower case
    int counter = 10_000;
    // chars can hold only one character, it is not a String and is surrounded by single quotes
    char charOne = '1';
    // String is not a primitive type
    String name = "Grigorij";

    // static variables and methods belong to the Class and not instances of Class
    public static void main(String[] args){
        HelloWorld collection_of_names = new HelloWorld();
        collection_of_names.namePrint(name);
    }

    public void namePrint(String name) {
        System.out.println("My name is :" + name);
    }

}

    // see if I can use a non static method inside a static method