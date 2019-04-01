package hw;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero Me = new Hero();
		Me.health=30;
		String MyTride = Me.job[4];
		
		Hero Opponent = new Hero();
		Opponent.health = 30;
		String EnemyTride = Opponent.job[5];
		
		Minion Flame_Imp = new Minion(2,3,1,"화염임프",Minion.Tride.devil);//생성자를 통한 선언 
		
		Minion pit_Lord = new Minion(6,5,4,"지옥의 군주",Minion.Tride.devil);
	
		Minion Antique_Healbot = new Minion(3,3,5,"낡은 치유로봇",Minion.Tride.mech);
		
		Minion Guardian_of_Kings = new Minion(6,5,7,"왕의 수호자",Minion.Tride.none);
		
		Me.hero_damage(Flame_Imp.Attack);
		Me.print_hero_health(Me.health);
		Me.hero_damage(pit_Lord.Attack);
		Me.print_hero_health(Me.health);
		Me.hero_heal(8);
		Me.print_hero_health(Me.health);
		
	}

}
