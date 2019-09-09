package corp.kahuna;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(String[] args)    {
        int firstNumber = 2;
        int secondNumber = 5;

        var subtraction = 7;
        int answer;
        String prompt = ". Press ENTER when ready";

        System.out.println("Think of a number between 1 and 10" + prompt);
        scanner.nextLine();
        System.out.println("Multily your number by " + firstNumber + prompt);
        scanner.nextLine();


        scanner.close();
    }
}
