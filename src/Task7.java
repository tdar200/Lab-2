import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 100);

        int guess = -1;

        while(guess != randomNum){
            guess = scanner.nextInt();
            guesser(randomNum, guess);
        }
    }

    public static void guesser(int randomNum, int guess){
        if(guess == randomNum){
            System.out.println("Correct");
        }else if(randomNum > guess) {
            System.out.println("number too low");
        }else if (randomNum < guess){
            System.out.println("number too high");
        }
    }
}