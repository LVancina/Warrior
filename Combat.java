public class Combat {
	CombatContext combatContext;

	public Combat(CombatContext combatContext) {
		this.combatContext = combatContext;
	}

	public Warrior duel(Warrior attacker, Warrior defender) {
		int attackerWins = 0;
		int defenderWins = 0;
		Warrior winner;

		for (int i = 0; i < 5; i++) {
			winner = combatContext.fight(attacker, defender);
			if (winner == attacker) {
				attackerWins++;
			} else {
				defenderWins++;
			}
		}

		if (attackerWins > defenderWins) {
			return attacker;
		} else {
			return defender;
		}
	}
}
