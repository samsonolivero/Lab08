package lab8;

public class Driver {
	
	public static void main(String args[]) 
	{
		//Board Game Test Driver
		BoardGame test = new BoardGame();
		
		test.addPlayer("John", GamePiece.BLUE_RACER, Location.BALLROOM);
		test.addPlayer("Sam", GamePiece.GREEN_BOOT, Location.BALLROOM);
		test.addPlayer("Megan", GamePiece.BLUE_RACER, Location.BALLROOM);
		
		System.out.println("Players: " + test.getPlayers());
		
		System.out.println("Players with GamePiece BLUE_RACER: " + test.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
		
		System.out.println("GamePieces in Ballroom: " + test.getGamePiecesAtLocation(Location.BALLROOM));
		
		System.out.println("John's GamePiece: " + test.getPlayerGamePiece("John"));
		
		System.out.println("List of GamePieces in Game: " + test.getPlayerPieces());
		
		System.out.println("Players in Ballroomn: " + test.getPlayersAtLocation(Location.BALLROOM));
		
		System.out.println("Sam's Location: " + test.getPlayersLocation("Sam"));
		
		System.out.println("Player with GREEN_BOOT Game Piece: " + test.getPlayerWithGamePiece(GamePiece.GREEN_BOOT));
		
		
		test.movePlayer("Sam", Location.HALL);
		
		//test.moveTwoPlayers
		
		String[] playerNames= {"John", "Sam"};
		Location[] locations = {Location.HALL, Location.BILLIARD_ROOM};
		
		test.moveTwoPlayers(playerNames, locations);
		System.out.println("Move Two Players: " + test.getPlayerLocations());
		//End Board Game Test Driver
		
		//GamePiece Test Driver
		GamePiece testGamePiece = GamePiece.RED_THIMBLE;
		
	    System.out.println("Game Piece Color: " + testGamePiece.getColor()
		+ "\nGame Piece Shape: " + testGamePiece.getShape());
		
		//End GamePiece Test Driver
		
		//Color Test Driver
		Color blue = Color.BLUE;
		System.out.println("B Value: " + blue.getB() + " - G Value: " + blue.getG() + " - R Value: " + blue.getR());
		//End Color Test Driver
		
		
		
		
	}
}
