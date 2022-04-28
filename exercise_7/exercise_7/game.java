package try3.hello.src.exercise_7.exercise_7;
import java.util.*;

public class game {
    players_number play = new players_number();
    Scanner scan = new Scanner(System.in);
    choices cho = new choices();

    public void start(int turn){    
        Random random = new Random();
        
        for(int x=0; x<10; x++) {   
			for(int z=0; z<turn; z++) {	
                int strike =20;
                int ran=11;
                int pin = 10;
                cho.line();
                System.out.println(" ");
                System.out.format("%s %30s %s %31s" ,"*","Frame" ,(x+1),"*\n");
                cho.asterisknewline();
                switch(z){
                    case(0):
                        System.out.println("*\t\tPlayer "+(z+1)+ " turn\t\t\t\t\t*");
                        
                        for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.println("*\t\tattemp "+(y+1)+ ", total pin strike is: " +down+"\t\t*");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player1.setPlay1_sco(strike);
                            System.out.println("*\t\tSTRIKE!!!\t\t\t\t\t*");
                            break;		
                            }
                        else strike=15;    		
                        }
                        if(pin>0) play.player1.setPlay1_sco(10-pin);
                        System.out.println("*\t\tPlayer"+(z+1) +" score is: "+play.player1.getPlay1_sco()+"\t\t\t\t*");
                        cho.asterisknewline();
                        cho.line();
                        cho.enter();
		                scan.nextLine();
                    break;

                    case(1):
                        System.out.println("*\t\tPlayer "+(z+1)+ " turn\t\t\t\t\t*");
                    
                        for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.println("*\t\tattemp "+(y+1)+ ", total pin strike is: " +down+"\t\t*");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player2.setPlay1_sco(strike);
                            System.out.println("*\t\tSTRIKE!!!\t\t\t\t\t*");
                            break;		
                            }
                        else strike=15;   		
                        }
                        if(pin>0) play.player2.setPlay1_sco(10-pin); 
                        System.out.println("*\t\tPlayer"+(z+1) +" score is: "+play.player2.getPlay1_sco()+"\t\t\t\t*");
                        cho.asterisknewline();
                        cho.line();
                        cho.enter();
		                scan.nextLine();
                    break;

                    case(2):
                        System.out.println("*\t\tPlayer "+(z+1)+ " turn\t\t\t\t\t*");
                    
                        for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.println("*\t\tattemp "+(y+1)+ ", total pin strike is: " +down+"\t\t*");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player3.setPlay1_sco(strike);
                            System.out.println("*\t\tSTRIKE!!!\t\t\t\t\t*");
                            break;		
                            }
                        else strike=15;    		
                        }
                        if(pin>0) play.player3.setPlay1_sco(10-pin);
                        System.out.println("*\t\tPlayer"+(z+1) +"score is: "+play.player3.getPlay1_sco()+"\t\t\t\t*");
                        cho.asterisknewline();
                        cho.line();
                        cho.enter();
		                scan.nextLine();;
                    break;

                    case(3):
                        System.out.println("*\t\tPlayer "+(z+1)+ " turn\t\t\t\t\t*");
                    
                        for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.println("*\t\tattemp "+(y+1)+ ", total pin strike is: " +down+"\t\t*");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player4.setPlay1_sco(strike);
                            System.out.println("*\t\tSTRIKE!!!\t\t\t\t\t*");
                            break;		
                            }
                        else strike=15;    		
                        }
                        if(pin>0) play.player4.setPlay1_sco(10-pin);
                        System.out.println("*\t\tPlayer"+(z+1) +"score is: "+play.player4.getPlay1_sco()+"\t\t\t\t*");
                        cho.asterisknewline();
                        cho.line();
                        cho.enter();
		                scan.nextLine();
                    break;

                    case(4):
                        System.out.println("*\t\tPlayer "+(z+1)+ " turn\t\t\t\t\t*");
                    
                        for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.println("*\t\tattemp "+(y+1)+ ", total pin strike is: " +down+"\t\t*");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player5.setPlay1_sco(strike);
                            System.out.println("*\t\tSTRIKE!!!\t\t\t\t\t*");
                            break;		
                            }
                        else strike=15;    		
                        }
                        if(pin>0) play.player5.setPlay1_sco(10-pin);
                        System.out.println("*\t\tPlayer"+(z+1) +"score is: "+play.player5.getPlay1_sco()+"\t\t\t\t*");
                        cho.asterisknewline();
                        cho.line();
                        cho.enter();
		                scan.nextLine();
                    break;

                    case(5):
                        System.out.println("*\t\tPlayer "+(z+1)+ " turn\t\t\t\t\t*");
                    
                        for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.println("*\t\tattemp "+(y+1)+ ", total pin strike is: " +down+"\t\t*");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player6.setPlay1_sco(strike);
                            System.out.println("*\t\tSTRIKE!!!\t\t\t\t\t*");
                            break;		
                            }
                        else strike=15;   		
                        }
                        if(pin>0) play.player6.setPlay1_sco(10-pin); 
                        System.out.println("*\t\tPlayer"+(z+1) +"score is: "+play.player6.getPlay1_sco()+"\t\t\t\t*");
                        cho.asterisknewline();
                        cho.line();
                        cho.enter();
		                scan.nextLine();
                    break;	
		}
        
        }
        } 
        }
        public void final_score(int players){
            cho.line();
            System.out.println("");
            System.out.println("*\t\t\tFinal score:\t\t\t\t*");
            cho.asterisknewline();
            for(int x=0; x<players; x++){
                int holder=0;
                if(x==0) holder=play.player1.getPlay1_sco();
                else if (x==1)holder=play.player2.getPlay1_sco();
                else if (x==2)holder=play.player3.getPlay1_sco();
                else if (x==3)holder=play.player4.getPlay1_sco();
                else if (x==4)holder=play.player5.getPlay1_sco();
                else if (x==5)holder=play.player6.getPlay1_sco();

                System.out.println("*\t\tPlayer "+(x+1)+ " final score is: "+holder+"\t\t\t*");
            }
            cho.asterisknewline();
            cho.line();
            play.player1.reset_sco();
            play.player2.reset_sco();
            play.player3.reset_sco();
            play.player4.reset_sco();
            play.player5.reset_sco();
            play.player6.reset_sco();

        }





}
