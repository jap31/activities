package try3.hello.src.exercise_7_copy;

import java.util.Scanner;
import java.io.IOException;

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
		System.out.println("Please press Enter to continue: ");
		
	}

	 String line(){
		 String asterisk="";
		for(int x=0; x<65; x++){
			asterisk+="*";
		}
		return asterisk;
	}

	 public String asterisknewline(){
		return String.format("%71s %63s", "*","*");
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

	public void clearConsole() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}
			else {
				System.out.print("\033\143");
			}
		} catch (IOException | InterruptedException ex) {}
	}
}
