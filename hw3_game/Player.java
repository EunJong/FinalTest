package hw3_game;

public class Player {

	public GameLevel currentLevel;
	
	public Player()
	{
		this.upgradeLevel();
	}
	
	public void upgradeLevel()
	{
		GameLevel newLevel;
		
		if(currentLevel == null)
		{
			newLevel = GameLevel1.getInstance();
		}
		
		else
		{
			newLevel = currentLevel.nextLevel();
			System.out.println("==========Level "+currentLevel.getLevelNumber()+" end============\n");
			GameLevel.CurrentGameLevel++;
		}
		
		if(newLevel == null)
		{
			System.out.println("\n===========THE END===========");
		}
		
		else
		{
			currentLevel = newLevel;
			System.out.println("\n===========Level "+currentLevel.getLevelNumber()+" start=========");	
		}
		
	}
	
	public int getGameLevel()
	{
		return GameLevel.CurrentGameLevel;
	}
	
	public void attack()
	{
		this.currentLevel.play();
	}
	
}
