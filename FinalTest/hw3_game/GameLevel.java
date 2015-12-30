package hw3_game;

public abstract class GameLevel {

	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	public abstract GameLevel nextLevel();
	
	public static int CurrentGameLevel = 1;
	
	public int getLevelNumber()
	{
		return CurrentGameLevel;
	}
	
	public final void play()
	{
		simpleAttack();
		turnAttack();
		flyingAttack();
	}
}
