public class Drugs {
    String drug_name = "Noradrenaline";
    int concentration = 10;

    public void infusion() {
        System.out.printf("%s has a concentration of %s micrograms", drug_name, concentration);
    }
}
