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
		
		Minion Flame_Imp = new Minion(2,3,1,"ȭ������",Minion.Tride.devil);//�����ڸ� ���� ����
		
		Minion pit_Lord = new Minion(6,5,4,"������ ����",Minion.Tride.devil);
	
		Minion Antique_Healbot = new Minion(3,3,5,"���� ġ���κ�",Minion.Tride.mech);
		
		Minion Guardian_of_Kings = new Minion(6,5,7,"���� ��ȣ��",Minion.Tride.none);
		
		Me.hero_damage(Flame_Imp.Attack);//�޼ҵ�ȣ��
		Me.print_hero_health(Me.health);
		Me.hero_damage(pit_Lord.Attack);
		Me.print_hero_health(Me.health);
		Me.hero_heal(8);
		Me.print_hero_health(Me.health);
		
	}

}
