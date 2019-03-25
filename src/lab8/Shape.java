package lab8;

public enum Shape 
{
	BOOT, RACECAR, THIMBLE;
	
	
	@Override
	public String toString() 
	{
		return name().toLowerCase();
	}
}
