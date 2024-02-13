public class Drugs {
    String drug_name = "Noradrenaline";
    public int concentration = 10;

    public void infusion() {
        System.out.printf("%s has a concentration of %s micrograms \n", drug_name, concentration);
        System.out.printf("%d is received by the getTestInteger method \n", HeadFirstJava.getTest_integer());
    }
}
