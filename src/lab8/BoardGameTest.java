package lab8;

import org.junit.Assert;

public class BoardGameTest 
{
	public void BoardGameTest()
	{
		BoardGame test = new BoardGame();
		
		test.addPlayer("John", GamePiece.BLUE_RACER, Location.BALLROOM);
		test.addPlayer("Sam", GamePiece.GREEN_BOOT, Location.BALLROOM);
		test.addPlayer("Megan", GamePiece.BLUE_RACER, Location.BALLROOM);
		
		//assertEquals() format: Message: (expected, actual)
		Assert.assertEquals("Player List: ", );
		
		
		
	}
}
