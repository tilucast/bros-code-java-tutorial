package OOP;

import java.util.Random;

public class Dice {

    //local vs global variables

    Random random = new Random();
    int num = 0;

    Dice(){
        roll();
    }

    void roll(){
        num = random.nextInt(6)+1;
        System.out.println(num);
    }
}
