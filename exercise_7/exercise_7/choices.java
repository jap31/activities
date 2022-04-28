package try3.hello.src.exercise_7.exercise_7;

import java.util.Scanner;

public class choices {
	static Scanner input = new Scanner(System.in);
	
	
	public int userinputvalidation(String print){
		
		System.out.print(print);
		if(!input.hasNextInt()) {
			newline();
			System.out.println("invalid input");
			input.next();
			boolean looping =false;
			while(!looping) {
				System.out.println("You must input a whole number");
				System.out.print("Enter a number of player: ");
				if(!input.hasNextInt()) {
					input.next();
					newline();
					System.out.println("invalid input");
					newline();
				}
				else {
					looping=true;	
				}
		}}

				
			return input.nextInt();	
		}
	
	 void newline() {
		System.out.println("");
		System.out.println("");
	}

	 void enter() {
		System.out.println("");
		System.out.println("Please press Enter to continue: ");
		
	}

	 void line(){
		for(int x=0; x<65; x++){
			System.out.print("*");
		}
	}

	 void asterisknewline(){
		System.out.println("*\t\t\t\t\t\t\t\t*");
		}
	
	public boolean looping(String loop){
			if(loop.equalsIgnoreCase("Y")) {	
				return false;	
			}
			
			else if(loop.equalsIgnoreCase("N")){
					System.out.println("Thank you ");
					return true;
				}
			else {
				System.out.print("Invalid Input!!! The program will be terminated. ");
				return true;
			}
	}

}
