public abstract class Warrior {

	protected int level;
	protected int attack;
	protected int defense;

	public int getLevel() {
		return this.level;
	}

	public int getAttack() {
		return this.attack;
	}

	public int getDefense() {
		return this.defense;
	}

	abstract int calculateAttack();

	abstract int calculateDefense();

	abstract double calculateBoost();

	public double calculatePower() {
		return calculateAttack() + calculateDefense() + calculateBoost();
	}

	public static abstract class Builder {
		protected Warrior warrior;

		public Builder attack(int attack) {
			warrior.attack = attack;
			return this;
		}

		public Builder defense(int defense) {
			warrior.defense = defense;
			return this;
		}

		public Warrior build() {
			validate(warrior);
			return warrior;
		}

		protected void validate(Warrior warrior) {
			StringBuilder errorMessage = new StringBuilder();
			boolean errorIsPresent = false;
			if (warrior.level < 0) {
				errorMessage.append("Level must be greater than 0. ");
				errorIsPresent = true;
			}
			if (warrior.attack < 0) {
				errorMessage.append("Attack must be greater than 0. ");
				errorIsPresent = true;
			}
			if (warrior.defense < 0) {
				errorMessage.append("Defense must be greater than 0. ");
				errorIsPresent = true;
			}
			if (errorIsPresent) {
				throw new IllegalStateException(errorMessage.toString());
			}
		}
	}
}
