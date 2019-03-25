package lab8;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;


public class BoardGameTest
{
	@Test
	public void testBoardGame()
	{
		BoardGame test = new BoardGame();
		
		test.addPlayer("John", GamePiece.BLUE_RACER, Location.BALLROOM);
		test.addPlayer("Sam", GamePiece.GREEN_BOOT, Location.BALLROOM);
		test.addPlayer("Megan", GamePiece.BLUE_RACER, Location.KITCHEN);
		test.addPlayer("Megan", GamePiece.YELLOW_BOOT, Location.KITCHEN);
		
		//assertEquals() format: Message: (expected, actual)
		
		//Testing getGamePiecesAtLocation(Location loc)
		ArrayList<GamePiece> expected = new ArrayList<GamePiece>();
		expected.add(GamePiece.BLUE_RACER);
		expected.add(GamePiece.GREEN_BOOT);
		
		ArrayList<GamePiece> actual = new ArrayList<GamePiece>();
		actual = test.getGamePiecesAtLocation(Location.BALLROOM);
		
		Assert.assertEquals("Incorrect ArrayList", expected, actual);
		
		
		//Testing getPlayerGamePiece(String name)
		
		Assert.assertEquals("Incorrect GamePiece", GamePiece.GREEN_BOOT, test.getPlayerGamePiece("Sam"));
		
		//Testing getPlayerLocations
		
		Set<Location> locations = new HashSet<Location>();
		locations = test.getPlayerLocations();
		
		Location[] testLocations = {Location.BALLROOM, Location.BALLROOM, Location.KITCHEN};
		
		for(int i = 0; i < testLocations.length; i++)
		{
			Assert.assertTrue(locations.contains(testLocations[i]));
		}
		
		//Testing getPlayerPieces
		Set<GamePiece> gamePieces = new HashSet<GamePiece>();
		gamePieces = test.getPlayerPieces();
		
		GamePiece[] testGamePieces = {GamePiece.BLUE_RACER, GamePiece.GREEN_BOOT, GamePiece.YELLOW_BOOT};
		
		for(int i = 0; i < testLocations.length; i++)
		{
			Assert.assertTrue(gamePieces.contains(testGamePieces[i]));
		}
		
		
		//Testing getPlayers
		
		Set<String> players = new HashSet<String>();
		players = test.getPlayers();
		
		String[] testGetPlayers = {"John", "Sam", "Megan"};
		
		for(int i = 0; i < testLocations.length; i++)
		{
			Assert.assertTrue(players.contains(testGetPlayers[i]));
		}
		
		
		//Testing movePlayer AND getPlayersLocation
		test.movePlayer("Sam", Location.HALL);
		
		Assert.assertEquals("Incorrect Location", Location.HALL, test.getPlayersLocation("Sam"));
		
		//Testing getPlayersAtLocation(Location loc)
		
		ArrayList<String> expectedPlayersAtLocation = new ArrayList<String>();
		expectedPlayersAtLocation.add("Sam");
	
		
		ArrayList<String> actualPlayersAtLocation = new ArrayList<String>();
		actualPlayersAtLocation = test.getPlayersAtLocation(Location.HALL);
		
		Assert.assertEquals("Incorrect ArrayList", expectedPlayersAtLocation, actualPlayersAtLocation);
		
		
		//Testing getPlayersWithGamePiece
		
		Assert.assertEquals("Inccorect GamePiece" , "John", test.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
		
		Assert.assertEquals("Play With GamePiece Does Not Exist", null, test.getPlayerWithGamePiece(GamePiece.MAGENTA_RACER));
		
		
		//Testing moveTwoPlayers(String[] playerNames, Location[] newLocations)
		
		String[] playerNames= {"John", "Sam"};
		Location[] loc = {Location.HALL, Location.BILLIARD_ROOM};
		
		test.moveTwoPlayers(playerNames, loc);
		
		String[] expectedResult = {"John", "Sam"};
		String[] actualResult = {"John", "Sam"};
		
		Assert.assertArrayEquals("Incorrect Player Movement",expectedResult, actualResult);
		
		playerNames = new String[]{"Sam", "John"};
		test.moveTwoPlayers(playerNames, loc);
		
		Assert.assertArrayEquals("Incorrect Player Movement", expectedResult, actualResult);
		
		
		
		
		
		
			
	}
}
