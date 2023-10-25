import java.util.Random;

public class battle {
	static Random random = new Random();
	public static void main(String[] args) {
		Character warrior = new Character("Warrior", 15, 100, 0.7);
		warrior.setWeapon("Sword", 7);
		System.out.println(warrior);

		Character monster = new Character("Owlbear", 17, 110, 0.3);
		System.out.println(monster);
		
		weapon arrow = new rangedWeapon("arrow", 3, 20);
		System.out.println(arrow);
		
		System.out.println(warrior);
		System.out.println(monster);
		System.out.println(monster.isDead());

		while (!monster.isDead() && !warrior.isDead()) {
			double turn = random.nextInt(1,3);
			if (turn == 1) {
				double damage = warrior.doDamage();
				monster.receiveDamage(damage);
				System.out.println("The warrior did " + damage + " to the monster");
			}
			else {
				double damage = monster.doDamage();
				warrior.receiveDamage(damage);
				System.out.println("The monster did " + damage + " to the warrior");
			}
			if (warrior.isDead()) {
				System.out.println("the monster dstroyed the warrior!");
			}
			else {
				System.out.println("the warrior dstroyed the monster!");
			}
		}
	}

}
