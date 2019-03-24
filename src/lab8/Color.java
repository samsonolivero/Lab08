package lab8;



public enum Color 
{
	//rgb
	BLUE(0, 0, 255), CYAN(0, 255, 255), GREEN(0,255,0), MAGENTA(255, 0, 255), RED(255, 0, 0), YELLOW(255, 255, 0);
	
	private int b;
	private int g;
	private int r;
	
	private Color(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public int getB()
	{
		return this.b;
	}
	
	public int getG()
	{
		return this.g;
	}
	
	public int getR()
	{
		return this.r;
	}
	
}
