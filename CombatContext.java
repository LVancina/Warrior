public class CombatContext {
	CombatState combatState;

	public CombatContext() {
		combatState = new TraditionalCombatState();
	}

	public Warrior fight(Warrior warriorOne, Warrior warriorTwo) {
		Warrior winner = combatState.fight(warriorOne, warriorTwo);
		nextState();
		return winner;
	}

	public void nextState() {
		if (combatState instanceof PowerCombatState) {
			setCombatState(new AttackCombatState());
		} else if (combatState instanceof AttackCombatState) {
			setCombatState(new DefenseCombatState());
		} else if (combatState instanceof DefenseCombatState) {
			setCombatState(new TraditionalCombatState());
		} else if (combatState instanceof TraditionalCombatState) {
			setCombatState(new InverseCombatState());
		} else if (combatState instanceof InverseCombatState) {
			setCombatState(new PowerCombatState());
		}
	}

	public void setCombatState(CombatState combatState) {
		this.combatState = combatState;
	}
}
