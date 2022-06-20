public class AggressiveWarrior extends Warrior {

	private AggressiveWarrior(int level) {
		this.level = level;
	}

	@Override
	int calculateAttack() {
		return this.getAttack() + 2 * this.getLevel();
	}

	@Override
	int calculateDefense() {
		return this.getDefense() + this.getLevel();
	}

	@Override
	double calculateBoost() {
		return (double) this.getAttack() / 2;
	}

	public static class Builder extends Warrior.Builder {

		public Builder(int level) {
			warrior = new AggressiveWarrior(level);
			warrior.attack = 3;
			warrior.defense = 2;
		}
	}
}