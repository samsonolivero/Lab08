package lab8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame
{
	protected LinkedHashMap<String, Location> location;
	protected LinkedHashMap<String, GamePiece> gamePiece;
	
	public BoardGame()
	{
		this.location = new LinkedHashMap<String, Location>();
		this.gamePiece = new LinkedHashMap<String, GamePiece>();
		
	}
	
	public boolean addPlayer(String name, GamePiece gamePiece, Location initialLocation)
	{
	
		if(this.gamePiece.values().contains(gamePiece))
		{
			return false;
		}
		
		location.put(name, initialLocation);
		this.gamePiece.put(name, gamePiece);
		return true;
		
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> gamePieces = new ArrayList<GamePiece>();
		
		//Check API
		for(String name : gamePiece.keySet())
		{
			if(location.get(name) == loc)
			{
				gamePieces.add(gamePiece.get(name));
			}
		}
		return gamePieces;
	}
	
	public GamePiece getPlayerGamePiece(String name)
	{
		
		return this.gamePiece.get(name);
	}
	
	
	public Set<Location> getPlayerLocations()
	{
		//Coulda done .addALL
		
		Set<Location> locations = new HashSet<Location>();
		
		for(String name : location.keySet())
		{
			locations.add(location.get(name));
		}
		return locations;
		
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		Set<GamePiece> gamePieces = new HashSet<GamePiece>();
				
		for(String name : gamePiece.keySet())
		{
			gamePieces.add(gamePiece.get(name));
		}
		return gamePieces;
		
	}
	
	public Set<String> getPlayers()
	{
		return location.keySet();
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> players = new ArrayList<String>();
		
		for(String name : location.keySet())
		{
			if(location.get(name) == loc)
			{
				players.add(name);
			}
		}	
		return players;
	}
	
	public Location getPlayersLocation(String player)
	{
		return location.get(player);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		
		for(String name : this.gamePiece.keySet())
		{
			if(this.gamePiece.get(name).equals(gamePiece))
			{
				return name;
			}
		}
		return null;
	}
	
	public void movePlayer(String playerName, Location newLocation)
	{
		location.replace(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		//TODO
		String[] result = new String[playerNames.length];
		
		GamePiece player1 = gamePiece.get(playerNames[0]);
		GamePiece player2 = gamePiece.get(playerNames[1]);
		
	
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
