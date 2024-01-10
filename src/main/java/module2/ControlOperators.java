package module2;

import java.util.Random;
import java.util.Scanner;

public class ControlOperators {
    public static void main(String[] args) {
        //guessNumber();
        printMuliplicationTable();
    }

    private static void printMuliplicationTable() {
        int i = 0;
        do {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d * %d = %2d  ", i+1, j+1, (i+1)*(j+1));
            }
            System.out.println();
            i++;
        }while (i<10);
    }

    private static void guessNumber() {
        Random random = new Random();
        int secret = random.nextInt(21);
        int count = 0;
        int guess;
        boolean win = false;
        System.out.println("Try to guess a number for 7 tries. Enter your number:");
        do{
            System.out.printf("Try %d: ", count+1);
            guess = getGuess();
            if (guess == secret){
                System.out.println("Right. You won!");
                win = true;
                break;
            } else if (guess < secret) {
                System.out.println("MORE");
            } else {
                System.out.println("LESS");
            }
            count++;
        }while (count<7);
        if(!win) System.out.printf("%nYou loose. The secret number is: %d", secret);
    }

    private static int getGuess() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        return Integer.parseInt(s);
    }
}
