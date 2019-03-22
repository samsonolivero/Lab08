package lab8;

public enum GamePiece 
{
	BLUE_RACER(blue, racecar, 2), GREEN_BOOT(green, boot, 9), MAGENTA_RACER(magenta, racecar, 1), RED_RACER(red, racecar, 0),
	RED_THIMBLE(red, thimble, 10), YELLOW_BOOT(yellow, boot, 7);
	
	private GamePieceAppearance appearance;
	private int priority;
	private Color color;
	
	private GamePiece(String color, GamePieceAppearance appearance, int priority)
	{
		this.color = color.valueOf("Blue");
		
		this.appearance = appearance;
		this.priority = priority;	
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public Shape getShape()
	{
		return appearance.getShape();
	}
	
	
	
	
	
	
	

}
