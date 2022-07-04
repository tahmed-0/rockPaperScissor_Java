import java.util.Random;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInput;

        Random random = new Random();

        int pointsUser = 0;
        int computerPoints = 0;

        // 0 rock 1 paper 2 scissor
        /*
        win combinations
        - 0 2
        - 1 0
        - 2 1

        lose
        -

         */


        do {
            int setRandom = random.nextInt(3);
            System.out.println("Pick any");
            System.out.println("0.Rock\n1.Paper\n2.Scissor\n3.Quit");
            userInput = scan.nextInt();

            if(userInput == 1 && setRandom == 0 || userInput == 2 && setRandom == 1 || userInput == 0 && setRandom == 2) {
                System.out.println("You won");
                pointsUser += 1;

            } else if (userInput == 1 && setRandom == 2 || userInput == 0 && setRandom == 1 || userInput == 2 && setRandom == 0) {
                System.out.println("You lose");
                computerPoints += 1;

            } else  if (userInput == setRandom) {
                System.out.println("Tie");
            }

            System.out.println("You chose " + userInput +" C chose " + setRandom);



    } while (userInput != 3);
        System.out.println("Your points: " + pointsUser);
        System.out.println("Computer points: " + computerPoints);

        if(pointsUser > computerPoints) {
            System.out.println("You won");
        } else {
            System.out.println("Computer won");
        }

}

}


