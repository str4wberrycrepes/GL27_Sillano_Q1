
import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){
                //DON'T TOUCH RAGHHHHH
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
                //Ok from here you can touch
                
                //Array for checking moves instead of if statements. Instead of checking for each number individually, just use an index :D.
                Move[] moves = new Move[3];
                moves[0] = rock;
                moves[1] = paper;
                moves[2] = scissors;
                
                //Main Menu
                System.out.println("Welcome to Rock, Paper, Scissors. Please select an option: \n1. Start \n2. Change number of rounds \n3. Exit");
                
                //Initialize Scanner
                Scanner scanner = new Scanner(System.in);
                String response = scanner.next();
                
                //Case Handling
                switch(response) {
                    case "1":
                        play(roundsToWin, moves);
                        break;
                    case "2":
                        System.out.println("Please enter amount of rounds needed to win:");
                        int rounds = Integer.parseInt(scanner.next());
                        roundsToWin = rounds;
                        System.out.println("Rounds needed to win has been set to: " + rounds + ".");
                        play(roundsToWin, moves);
                        break;
                        
                    case "3":
                        System.out.println("Exited Application.");
                        break;
                        
                    default:
                        System.out.println("Invalid input.");
                        break;
                }
	}
        
        public static void play(int roundsToWin, Move[] moves) {            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("\nThis match will be first to " + roundsToWin + " rounds.");
            
            boolean ended = false;
            
            int playerWins = 0;
            int compWins = 0;
            
            while(!ended) {
                System.out.println("\nPlayer: " + playerWins + " Computer: " + compWins);
                            
                int random = (int) Math.floor(Math.random()*3) + 1;
                
                System.out.println("\nThe computer has made its move, now make yours. \n1. Rock \n2. Paper \n3. Scissors");
                                                                                    
                String playerInput = scanner.next();
                
                Move playerMove = moves[Integer.parseInt(playerInput) - 1];
                Move compMove = moves[random - 1];
                
                int result = playerMove.compareMoves(playerMove, compMove);

                switch(result) {
                    case 0:
                        System.out.println("The Player won this round! \nThe moves were: " + playerMove.getName() + " - "+ compMove.getName());
                        playerWins++;
                        break;
                    case 1:
                        System.out.println("The Computer won this round! \nThe moves were: " + playerMove.getName() + " - "+ compMove.getName());
                        compWins++;
                        break;
                    case 2:
                        System.out.println("This round is a tie. \nThe moves were: " + playerMove.getName() + " - "+ compMove.getName());
                        break;
                }
                
                if(playerWins == roundsToWin || compWins == roundsToWin) {
                    String matchResult = playerWins > compWins ? "\n\nThe Player wins!" : "\n\nThe Computer wins!";
                    System.out.println(matchResult);
                    ended = true;
                }
            }
        }
}