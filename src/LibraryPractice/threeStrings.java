package LibraryPractice;

import java.util.Random;

public class threeStrings {

    private String[] massive = {"Пятница", "Суббота", "Воскресенье"};

    private Random randomNumber = new Random();

    public void chooseRandomNumber () {
        int index = randomNumber.nextInt(3);
        System.out.println(massive[index]);
    }

}
