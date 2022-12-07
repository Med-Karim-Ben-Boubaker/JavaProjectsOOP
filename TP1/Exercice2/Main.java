package JavaProjects.TP1.Exercice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        String inputText;
        Scanner input = new Scanner(System.in);
        System.out.println("Write your expression: (You can't add numbers that contains more than one digit \nYou can't write 23+2 if you do You will get a wrong answer \n Exp: 2+3*(5+7) = 38 ");
        inputText = input.nextLine();
        System.out.println(calculate.Calculate(inputText));
        input.close();
    }
}
