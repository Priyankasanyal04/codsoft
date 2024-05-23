import java.util.Scanner;
import java.util.Random;

class Numbergame1 {
    public static void main(String args[]) {
        int inputno;
        int randomno;
        int noofguess;
        int noofrounds = 0;
        boolean playagain = true;
        boolean guessiscorrect;

        Scanner sc = new Scanner(System.in);
        Random r1 = new Random();

        while (playagain && noofrounds < 3) {
            noofrounds++;
            randomno = r1.nextInt(1, 101); 
            noofguess = 0; 
            guessiscorrect = false;  

            System.out.println("Round " + noofrounds + ": Guess a number between 1 and 100");

            while (noofguess < 10 && !guessiscorrect) {
                inputno = sc.nextInt();
                noofguess++;

                if (inputno == randomno) {
                    System.out.println("Your guess is correct! You guessed it in " + noofguess + " attempts.");
                    guessiscorrect = true;
                } else if (inputno > randomno) {
                    System.out.println("Your guess is too high. Try again!");
                } else {
                    System.out.println("Your guess is too low. Try again!");
                }
            }

            if (!guessiscorrect) {
                System.out.println("Sorry, you have exhausted all your attempts. The correct number was " + randomno + ".");
            }

            if (noofrounds < 3) { 
                System.out.println("Do you want to play again (yes/no)?");
                String userResponse = sc.next();
                if (userResponse.equalsIgnoreCase("yes")) {
                    playagain = true;
                } else {
                    playagain = false;
                }
            }
        }

        System.out.println("Game over");
        sc.close();
    }
}
