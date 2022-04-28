package try3.hello.src.Mysavings.Mysavings;

public class PiggyBank {
	
	
	private static float total;
	static private float penny;
	static private float nickel;
	static private float dime;
	static private float quarter;
	
	public PiggyBank( float total) {	
		PiggyBank.total = total;
	}
	
	public void setpenny (float setpenny) {
		penny=(penny+(setpenny/100));	
	}
	public static float getpenny() {
		return penny;		
	}
	public void setnickel (float setnickel) {
		nickel=nickel+((5*setnickel)/100);		
	}
	public static float getnickel() {
		return nickel;		
	}
	public void setdime (float setdime) {
		dime=dime+((setdime*10)/100);		
	}
	public static float getdime() {
		return dime;		
	}
	public void setquarter (float setquarter) {
		quarter=quarter+((25*setquarter)/100);		
	}
	public static float getquarter() {
		return quarter;		
	}
	public void witdraw_total () {
		System.out.println("withdaw complete");
		total=total-total;
		penny=penny-penny;
		nickel=nickel-nickel;
		dime=dime-dime;
		quarter=quarter-quarter;
	}

	public void settotal(){
		total=penny+nickel+dime+quarter;
	}
	
	public static float gettotal() {
		return total;		
	}
}

