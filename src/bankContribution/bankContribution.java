package bankContribution;

import java.util.Scanner;

public class bankContribution {

    public static void main(String[] args) {

        System.out.println("Введите сумму вклада:");

        Scanner scanner1 = new Scanner(System.in);
        float contributionSum = scanner1.nextFloat();

        System.out.println("Введите срок вклада в месяцах:");
        Scanner scanner2 = new Scanner(System.in);
        int numberMonths = scanner2.nextInt();

        float sumForOneMonth = contributionSum / 100 * 7;
        float finalSum = contributionSum;

        for (int i = 0; i <= numberMonths; i ++) {
            finalSum = contributionSum + (sumForOneMonth * i);
       }
       System.out.print("После " + numberMonths + " месяцев сумма вклада составит " + finalSum);

    }
}
