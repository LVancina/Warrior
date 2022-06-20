public class DefensiveWarrior extends Warrior {

	private DefensiveWarrior(int level) {
		this.level = level;
	}

	@Override
	int calculateAttack() {
		return this.getAttack() + this.getLevel();
	}

	@Override
	int calculateDefense() {
		return this.getDefense() + 2 * this.getLevel();
	}

	@Override
	double calculateBoost() {
		return (double) this.getDefense() / 2;
	}

	public static class Builder extends Warrior.Builder {

		public Builder(int level) {
			warrior = new DefensiveWarrior(level);
			warrior.attack = 2;
			warrior.defense = 3;
		}
	}
}