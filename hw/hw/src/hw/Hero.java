package hw;

public class Hero {
	String[] job = {"shaman","mage","hunter","paladin","warlock","priest","druid","rogue",null};
	
	int health = 30;//객체변수
	private void heroHpChanger(int value) {
		this.health+=value;
		return;
	}
	public void hero_heal(int value ) {
		heroHpChanger(value);
		if(this.health > 30) {
			this.health = 30;
		}
	}
	public void hero_damage(int attack) {
		heroHpChanger(-1*attack);
	}
	public void print_hero_health(int heal) {
		System.out.println(heal);
	}//메소드

}
