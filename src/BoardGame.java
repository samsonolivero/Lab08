

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame
{
	protected LinkedHashMap<String, Location> playerLocations;
	protected LinkedHashMap<String, GamePiece> playerPieces;
	
	public BoardGame()
	{
		this.playerLocations = new LinkedHashMap<String, Location>();
		this.playerPieces = new LinkedHashMap<String, GamePiece>();
		
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
	
		if(this.playerPieces.values().contains(gamePiece))
		{
			return false;
		}
		
		playerLocations.put(playerName, initialLocation);
		this.playerPieces.put(playerName, gamePiece);
		return true;
		
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> gamePieces = new ArrayList<GamePiece>();
		
		//Check API
		for(String name : playerPieces.keySet())
		{
			if(playerLocations.get(name) == loc)
			{
				gamePieces.add(playerPieces.get(name));
			}
		}
		return gamePieces;
	}
	
	public GamePiece getPlayerGamePiece(String playerName)
	{
		
		return this.playerPieces.get(playerName);
	}
	
	
	public Set<Location> getPlayerLocations()
	{
		//Coulda done .addALL
		
		Set<Location> locations = new HashSet<Location>();
		
		for(String name : playerLocations.keySet())
		{
			locations.add(playerLocations.get(name));
		}
		return locations;
		
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		Set<GamePiece> gamePieces = new HashSet<GamePiece>();
				
		for(String name : playerPieces.keySet())
		{
			gamePieces.add(playerPieces.get(name));
		}
		return gamePieces;
		
	}
	
	public Set<String> getPlayers()
	{
		return playerLocations.keySet();
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> players = new ArrayList<String>();
		
		for(String name : playerLocations.keySet())
		{
			if(playerLocations.get(name) == loc)
			{
				players.add(name);
			}
		}	
		return players;
	}
	
	public Location getPlayersLocation(String player)
	{
		return playerLocations.get(player);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		
		for(String name : this.playerPieces.keySet())
		{
			if(this.playerPieces.get(name).equals(gamePiece))
			{
				return name;
			}
		}
		return null;
	}
	
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocations.replace(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		//TODO
		String[] result = new String[playerNames.length];
		
		GamePiece player1 = playerPieces.get(playerNames[0]);
		GamePiece player2 = playerPieces.get(playerNames[1]);
		
	
		GamePiece priority = GamePiece.movesFirst(player1, player2);
		
		if(priority.equals(player1))
		{
		
			result[0] = playerNames[0];
			//System.out.println("Moved Player 1");
			movePlayer(playerNames[0], newLocations[0]);
			
			result[1] = playerNames[1];
			//System.out.println("Moved Player 2");
			movePlayer(playerNames[1], newLocations[1]);
			
			
		}
		else
		{
			result[0] = playerNames[1];
			//System.out.println("Moved Player 2");
			movePlayer(playerNames[1], newLocations[1]);
			
			result[1] = playerNames[0];
			//System.out.println("Moved Player 1");
			movePlayer(playerNames[0], newLocations[0]);
			
		}
		
		
		
		return result;
		
	}
	
	

}
