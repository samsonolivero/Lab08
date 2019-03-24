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
		//linked hashmap maintains order
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
		//TODO
		//DONE
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
		//TODO
		//DONE
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
		//TODO
		//DONE
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
		//TODO
		//DONE
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
		return gamePiece.getShape().toString();
	}
	
	public void movePlayer(String playerName, Location newLocation)
	{
		location.replace(playerName, newLocation);
	}
	
	public String moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		//TODO
		int firstPlayerPriority;
		int secondPlayerPriority;
	}
}
