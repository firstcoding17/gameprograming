package hw;

public class Minion {
	public int health;
	public int Attack;
	public int Cost;
	public String name;
	public enum Tride{dragon,
	    murloc,
	    beast,
	    devil,
	    pirate,
	    mech,
	    totem,
	    spirit,none
		
	}
	public Tride tride;
	
	
	public Minion(){
		
	}
	public Minion(int health,int Atack, int Cost,String name,Tride tride) {
		this.health = health;
		this.Attack = Atack;
		this.Cost = Cost;
		this.name = name;
		this.tride=tride;
	}
}
