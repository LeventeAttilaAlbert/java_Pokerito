import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready.");

        String userReady = scan.nextLine();

        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println("There are two players, you and the computer.");
        System.out.println("The dealer will give each player one card.");
        System.out.println("Then, the dealer will draw five cards (the river)");
        System.out.println("The player with the most river matches wins!");
        System.out.println("If the matches are equal, everyone's a winner!\n");
        System.out.println("Ready? Type anything if you are.");

        userReady = scan.nextLine();

        System.out.println("Here's your card: ");
        String userCard = randomCard();
        System.out.println(userCard + "\n");

        System.out.println("Here's the computer's card: ");
        String compCard = randomCard();
        System.out.println(compCard + "\n");

        int yourMatches = 0;
        int computerMatches =0;

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        
        
        for (int i = 0; i<5; i++) {
            userReady = scan.nextLine();
            String currentRiverCard = randomCard();
            System.out.println(currentRiverCard);

            if (currentRiverCard.equals(userCard)){
                yourMatches += 1;
                System.out.println("You matched! Your score: " + yourMatches);
            }
            else if (currentRiverCard.equals(compCard)) {
                computerMatches += 1;
                System.out.println("The computer matched! Computer score: " + computerMatches);
            }
            else {
                System.out.println("No one matched.");
            }
            System.out.println("Press 'Enter' to continue..");
        }

        userReady = scan.nextLine();

        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if (yourMatches > computerMatches) {
            System.out.println("You win!\n");
        }
        else if (yourMatches < computerMatches) {
            System.out.println("The computer wins!\n");
        }
        else {
            System.out.println("Everyone wins!\n");
        }
         scan.close();
    }


    public static String randomCard() {
        String cardStr = "not a card";
        int cardNum = (int)(Math.random()*13) + 1;
        switch (cardNum) {
            case 1:
                cardStr =
                    "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
                break;
            case 2:
            cardStr = "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
            break;
            case 3:
            cardStr ="   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";
            break;
            case 4:
            cardStr ="   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
            break;
            case 5:
            cardStr ="   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
            break;
            case 6:
            cardStr ="   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
            break;
            case 7:
            cardStr ="   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            break;
            case 8:
            cardStr ="   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            break;
            case 9:
            cardStr ="   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
            break;
            case 10:
            cardStr ="   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            break;
            case 11:
            cardStr ="   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            break;
            case 12:
            cardStr ="   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            break;
            case 13:
            cardStr ="   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            break;

            default:
                break;
        }
        return cardStr;
    }
}
