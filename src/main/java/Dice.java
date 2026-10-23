import java.util.*;
public class Dice {

    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        int sum;

        for (int i= 1 ; i <= 100; i = i+1)
        {   roll1 = 0;
            roll2 = 0;
            roll1 = dice.roll();
        roll2 = dice.roll();
        sum = roll1 + roll2;
        System.out.println("Roll " + i + ": "+ roll1 + "  -  " + roll2  +   " Sum:" + sum);
        switch (roll1 + roll2) {
            case 2: twoCounter = twoCounter + 1;
            case 4: fourCounter = fourCounter + 1;
            case 6: sixCounter = sixCounter + 1;
            case 7: sevenCounter = sevenCounter + 1;
        }
        }
        System.out.println("twoCounter = " + twoCounter);
        System.out.println("fourCounter = " + fourCounter);
        System.out.println("sixCounter = " + sixCounter);
        System.out.println("sevenCounter = " + sevenCounter);


    }

    public static int roll() {
        int maxValue = 6;
        int minValue = 1;
        int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
        return randomNumber;
    }

}
