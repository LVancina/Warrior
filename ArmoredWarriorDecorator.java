public class ArmoredWarriorDecorator extends WarriorDecorator {

	public ArmoredWarriorDecorator(Warrior warrior) {
		this.warrior = warrior;
		warrior.defense *= 2;
	}
}
