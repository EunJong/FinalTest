package hw3_game;

public class GameLevel2 extends GameLevel{
	
	private static GameLevel2 singleton = new GameLevel2();
	
	private GameLevel2(){};
	
	public static GameLevel2 getInstance()
	{
		if(singleton == null)
		{
			singleton = new GameLevel2();
		}
		return singleton;
	}
	
	public GameLevel nextLevel()
	{
		return GameLevel3.getInstance();
	}
	
	@Override
	public void simpleAttack()
	{
		System.out.println("level2 simple attack: 메롱~ 메롱~");
	}
	
	@Override
	public void turnAttack()
	{
		System.out.println("level2 turn attack: 돌려차기 씡~~~");
	}
	
	@Override
	public void flyingAttack()
	{
		System.out.println("level2 flying attack: 이건 못하지롱");
	}
	
}
