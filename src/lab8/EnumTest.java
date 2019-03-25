package lab8;

import org.junit.Assert;

public class EnumTest
{
	public  void testColorValues()
	{
		Color  col= null ;
		// RED:
		col = Color.RED;
		Assert.assertEquals("Incorrect  rgb  value  in  color  " + col.name(), 255, col.getR() );
		Assert.assertEquals("Incorrect  rgb  value  in  color  " + col.name(),  0, col.getG() );
		Assert.assertEquals("Incorrect  rgb  value  in  color  " + col.name(), 0, col.getB() );
		// BLUE:
		col=Color.GREEN;
		Assert.assertEquals( " Incorrect  rgb  value  in  color  " + col.name(),  0, col.getR() ) ;
		Assert.assertEquals( " Incorrect  rgb  value  in  color  " + col.name(),  255 ,col.getG() ) ;
		Assert.assertEquals( " Incorrect  rgb  value  in  color  " + col.name(),  0, col.getB() ) ;
	}
}
