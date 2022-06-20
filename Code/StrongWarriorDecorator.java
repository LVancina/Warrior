public class StrongWarriorDecorator extends WarriorDecorator {

	public StrongWarriorDecorator(Warrior warrior) {
		this.warrior = warrior;
		warrior.attack *= 2;
	}
}
