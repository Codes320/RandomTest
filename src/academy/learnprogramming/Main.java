package academy.learnprogramming;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Random random = new Random();
	int testInt = random.nextInt(10);
        System.out.println(testInt);
        testInt = random.nextInt(10);
        System.out.println(testInt);
    }
}
