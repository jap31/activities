package try3.hello.src.exercise_7.exercise_7;
import java.util.*;


public class Bowling { 
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	 	game newgame = new game();
		 choices cho = new choices();
		boolean loop=false;
		String looping;
		while(!loop){
			int num_player;
			cho.newline();
			num_player = cho.userinputvalidation("Please enter the number of player (maximum of 6 players): ");
			if(num_player>0 && num_player<7){
				newgame.start(num_player);
				newgame.final_score(num_player);

			} else System.out.println( "Invalid input!!! you must enter number between 1 to 6.");

			System.out.println("");
			System.out.println("Do you want to run the programm again? Y(yes)/N(no)");
			System.out.print("Please enter your choice: ");
			looping = scan.nextLine();
			loop=cho.looping(looping);
}
	scan.close();
}}
