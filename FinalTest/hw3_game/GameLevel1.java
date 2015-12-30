package hw3_game;

public class GameLevel1 extends GameLevel{

	private static GameLevel1 singleton = new GameLevel1();
	
	private GameLevel1(){};
	
	public static GameLevel1 getInstance()
	{
		if(singleton == null)
		{
			singleton = new GameLevel1();
		}
		return singleton;
	}
	
	public GameLevel nextLevel()
	{
		return GameLevel2.getInstance();
	}
	
	@Override
	public void simpleAttack()
	{
		System.out.println("level1 simple attack: 메롱~~~");
	}
	
	@Override
	public void turnAttack()
	{
		System.out.println("level1 turn attack: 못하지롱");
	}
	
	@Override
	public void flyingAttack()
	{
		System.out.println("level1 flying attack: 이것도 못하지롱");
	}
	
}
