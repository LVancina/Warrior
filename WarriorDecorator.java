public abstract class WarriorDecorator extends Warrior {
	Warrior warrior;

	@Override
	public int getLevel() {
		return warrior.level;
	}

	@Override
	public int getAttack() {
		return warrior.attack;
	}

	@Override
	public int getDefense() {
		return warrior.defense;
	}

	@Override
	int calculateAttack() {
		return warrior.calculateAttack();
	}

	@Override
	int calculateDefense() {
		return warrior.calculateDefense();
	}

	@Override
	double calculateBoost() {
		return warrior.calculateBoost();
	}
}