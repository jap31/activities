package try3.hello.src.chapter10_exercise12;
import java.util.*;
public class choices {
	
	Scanner input = new Scanner(System.in);
    

    int userinputvalidation(String print){
		
		System.out.print(print);
		if(!input.hasNextInt()) {
			newline();
			System.out.println("invalid input");
			input.next();
			boolean looping =false;
			while(!looping) {
				System.out.println("You must input a whole number");
				System.out.print("Enter an Integer for the subject: ");
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
            System.out.println();
        }

		public void forloop(){
			for(int x=0; x<50; x++){System.out.println("");;}
		}

       void grade_choices(){
		forloop();
		System.out.println(" ==============================================");   
        System.out.println("|\t[1]/Show all grades of every student.  |");
        System.out.println("|\t[2]/Show all Average of every student. |");
        System.out.println("|\t[3]/Show Average of specific student.  |");
        System.out.println("|\t[4]/Show grade of specific student.    |");
		System.out.println("|\t[5]/Quit.                              |");
		System.out.println(" ==============================================");  

       }


		public void scan(){
			System.out.println("Please press enter to continue:");
			input.nextLine();
			forloop();
		}

		public void scan2(){
			System.out.println("Please press enter to continue:");
			input.nextLine();
			input.nextLine();
			forloop();
		}


	   
       
        
}
