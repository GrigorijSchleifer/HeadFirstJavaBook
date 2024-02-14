public class SharpenYourPens {
    public void syp_1() {
        int counter = 0;

        while (counter < 2) {
            System.out.print("Doo");
            System.out.print("Bee");
            counter = counter + 1;
        }
        if (counter == 2) {
            System.out.println("Do");
        }
    }

    public void BottleSong(){
        /**
         *
         */
        int bottles = 10;
        String word = "bottles";

        while (bottles > 0) {
            if (bottles == 1) {
                word = "bottle"; // to correct for singular spelling
            }

            System.out.printf("%d " + word + " on the floor \n", bottles);
            System.out.println("And if one green bottle should accidentally fall, ");
            bottles = bottles - 1;

            if (bottles > 0) {
                System.out.printf("There will be %d" + " green " + word + " on the floor \n\n", bottles);
            } else {
                System.out.println("There will not be green bottles on the floor");
            }
        }
    }
}
