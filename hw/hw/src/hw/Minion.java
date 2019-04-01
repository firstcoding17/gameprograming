package hw;

public class Minion {
	public int health;//객체변수
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
		
	}//열거형 클래스
	public Tride tride;
	
	
	public Minion(){
		
	}//오버라이딩
	public Minion(int health,int Atack, int Cost,String name,Tride tride) {
		this.health = health;
		this.Attack = Atack;
		this.Cost = Cost;
		this.name = name;
		this.tride=tride;
	}//메소드
}
