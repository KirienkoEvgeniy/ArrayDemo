package org.app.factorial;

import java.util.Scanner;

public class Factorial {

    public int Fact() {
        int resultFact = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int number = in.nextInt();

        if (!(number != 0)) {
            System.out.println("Печаль");
        } else {
            if (!(number != 1)) {
                System.out.println("Factorial = 1");
                return number;
            } else if (!(number != 2)) {
                System.out.println("Factorial = 2");
                return number;
            } else {
                for (int i = 1; i <= number; i++) {
                    resultFact = resultFact * i;
                }
            }
        }
        System.out.println("Результат - " + resultFact);
        return resultFact;
    }
}
