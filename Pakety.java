package paketyVeStyluStromu;

public class Pakety {
	private int hodnota;
	private Pakety levy;
	private Pakety pravy;
	
	
	public Pakety(int hodnota) {
		super();
		this.hodnota = hodnota;
	}


	public Pakety getLevy() {
		return levy;
	}


	public void setLevy(Pakety levy) {
		this.levy = levy;
	}


	public Pakety getPravy() {
		return pravy;
	}


	public void setPravy(Pakety pravy) {
		this.pravy = pravy;
	}

	
	

	

}