

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTestOfficial 
{

	@Test
	public void testBoardGame()
	{
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Vinny", GamePiece.BLUE_BOOT, Location.LIBRARY);
		bg.addPlayer("John", GamePiece.BLUE_RACER, Location.BALLROOM);
		bg.addPlayer("Sam", GamePiece.GREEN_BOOT, Location.BALLROOM);
		bg.addPlayer("Megan", GamePiece.BLUE_RACER, Location.KITCHEN);
		bg.addPlayer("Megan", GamePiece.YELLOW_BOOT, Location.KITCHEN);
		
		//assertEquals() format: Message: (expected, actual)
		
		//Testing getGamePiecesAtLocation(Location loc)
		ArrayList<GamePiece> expected = new ArrayList<GamePiece>();
		expected.add(GamePiece.BLUE_RACER);
		expected.add(GamePiece.GREEN_BOOT);
		
		ArrayList<GamePiece> actual = new ArrayList<GamePiece>();
		actual = bg.getGamePiecesAtLocation(Location.BALLROOM);
		
		Assert.assertEquals("Incorrect ArrayList", expected, actual);
		
		
		//Testing getPlayerGamePiece(String name)
		
		Assert.assertEquals("Incorrect GamePiece", GamePiece.GREEN_BOOT, bg.getPlayerGamePiece("Sam"));
		
		//Testing getPlayerLocations
		
		Set<Location> locations = new HashSet<Location>();
		locations = bg.getPlayerLocations();
		
		Location[] testLocations = {Location.BALLROOM, Location.BALLROOM, Location.KITCHEN};
		
		for(int i = 0; i < testLocations.length; i++)
		{
			Assert.assertTrue(locations.contains(testLocations[i]));
		}
		
		//Testing getPlayerPieces
		Set<GamePiece> gamePieces = new HashSet<GamePiece>();
		gamePieces = bg.getPlayerPieces();
		
		GamePiece[] testGamePieces = {GamePiece.BLUE_RACER, GamePiece.GREEN_BOOT, GamePiece.YELLOW_BOOT};
		
		for(int i = 0; i < testLocations.length; i++)
		{
			Assert.assertTrue(gamePieces.contains(testGamePieces[i]));
		}
		
		
		//Testing getPlayers
		
		Set<String> players = new HashSet<String>();
		players = bg.getPlayers();
		
		String[] testGetPlayers = {"John", "Sam", "Megan"};
		
		for(int i = 0; i < testLocations.length; i++)
		{
			Assert.assertTrue(players.contains(testGetPlayers[i]));
		}
		
		
		//Testing movePlayer AND getPlayersLocation
		bg.movePlayer("Sam", Location.HALL);
		
		Assert.assertEquals("Incorrect Location", Location.HALL, bg.getPlayersLocation("Sam"));
		
		//Testing getPlayersAtLocation(Location loc)
		
		ArrayList<String> expectedPlayersAtLocation = new ArrayList<String>();
		expectedPlayersAtLocation.add("Sam");
	
		
		ArrayList<String> actualPlayersAtLocation = new ArrayList<String>();
		actualPlayersAtLocation = bg.getPlayersAtLocation(Location.HALL);
		
		Assert.assertEquals("Incorrect ArrayList", expectedPlayersAtLocation, actualPlayersAtLocation);
		
		
		//Testing getPlayersWithGamePiece
		
		Assert.assertEquals("Inccorect GamePiece" , "John", bg.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
		
		Assert.assertEquals("Play With GamePiece Does Not Exist", null, bg.getPlayerWithGamePiece(GamePiece.MAGENTA_RACER));
		
		
		//Testing moveTwoPlayers(String[] playerNames, Location[] newLocations)
		
		String[] playerNames= {"John", "Sam"};
		Location[] loc = {Location.HALL, Location.BILLIARD_ROOM};
		
		bg.moveTwoPlayers(playerNames, loc);
		
		String[] expectedResult = {"John", "Sam"};
		String[] actualResult = {"John", "Sam"};
		
		Assert.assertArrayEquals("Incorrect Player Movement",expectedResult, actualResult);
		
		playerNames = new String[]{"Sam", "John"};
		bg.moveTwoPlayers(playerNames, loc);
		
		Assert.assertArrayEquals("Incorrect Player Movement", expectedResult, actualResult);
		
	}
}
