package try3.hello.src.exercise_7.exercise_7;

public class player {
	
	private int play1_sco;
	
	
	public player(int play1_sco) {
		this.play1_sco=play1_sco;
	}
    
    public int getPlay1_sco() {
        return play1_sco;
    }

    public void setPlay1_sco(int sco) {
        this.play1_sco = sco+play1_sco;
    }

	public void reset_sco() {
        play1_sco = play1_sco-play1_sco;
    }


}
