import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Random;

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

    public void phrasomat(){
        // string arrays
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven",
                "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};
        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven",
                "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};
        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline",
                "service mesh", "architecture", "perspective", "design", "orientation"};

        // find length of the String array and use it to limit the random number pick
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(wordListOne.length);
        int rand2 = randomGenerator.nextInt(wordListTwo.length);
        int rand3 = randomGenerator.nextInt(wordListThree.length);

        String str_array_pick = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.printf("We need a %s", str_array_pick);
    }

    public void shuffle_one(){
        int num = 3;
        if (num > 2) {
            System.out.print("a");
            num = num - 1;
        }
        if (num == 2){
            System.out.print("-");
            num = num - 1;
        }
        if (num == 1){
            System.out.print("b c-d");
        }
    }

    public void be_a_compiler(){
        int i = 5;
        while(i > 1) {
            i = i - 1;
            if (i < 3){
                System.out.printf("small %d \n", i); // not sure why
            }
        }
    }
    // see if the new class file will be pushed to the remote
}
