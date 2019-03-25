package lab8;

import org.junit.Assert;
import org.junit.Test;


public class EnumTest
{
	@Test
	public  void testColorValues()
	{
		Color  col= null ;
		// RED:
		col = Color.RED;
		Assert.assertEquals("Incorrect rgb value in color  " + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color  " + col.name(),  0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color  " + col.name(), 0, col.getB());
		// GREEN:
		col=Color.GREEN;
		Assert.assertEquals( "Incorrect rgb value in  color " + col.name(),  0, col.getR());
		Assert.assertEquals( "Incorrect rgb value in  color " + col.name(),  255 ,col.getG());
		Assert.assertEquals( "Incorrect rgb value in  color " + col.name(),  0, col.getB());
		// BLUE:
		col=Color.BLUE;
		Assert.assertEquals( "Incorrect rgb value in color " + col.name(),  0, col.getR());
		Assert.assertEquals( "Incorrect rgb value in color " + col.name(),  0 ,col.getG());
		Assert.assertEquals( "Incorrect rgb value in color " + col.name(),  255, col.getB());
	}
	
	@Test
	public void testLocation()
	{
		Assert.assertEquals("Location enum values i n c o r r e c t . " ,Location.KITCHEN,Location.valueOf( "KITCHEN" ) ) ;
		Assert.assertEquals("Location enum values i n c o r r e c t . " ,Location.CONSERVATORY,Location.valueOf( "CONSERVATORY" ) ) ;
		Assert.assertEquals("Location enum values i n c o r r e c t . " ,Location.DINING_ROOM,Location.valueOf( "DINING_ROOM" ) ) ;
		Assert.assertEquals("Location enum values i n c o r r e c t . " ,Location.BALLROOM,Location.valueOf( "BALLROOM" ) ) ;
		Assert.assertEquals("Location enum values i n c o r r e c t . " ,Location.BILLIARD_ROOM,Location.valueOf( "BILLIARD_ROOM" ) ) ;
		Assert.assertEquals("Location enum values i n c o r r e c t . " ,Location.HALL,Location.valueOf( "HALL" ) ) ;
		Assert.assertEquals("Location enum values i n c o r r e c t . " ,Location.STUDY,Location.valueOf( "STUDY" ) ) ;
		Assert.assertEquals("Location enum values i n c o r r e c t . " ,Location.LOUNGE,Location.valueOf( "LOUNGE" ) ) ;
		Assert.assertEquals("Location enum values i n c o r r e c t . " ,Location.LIBRARY,Location.valueOf( "LIBRARY" ) ) ;
	
	}
	
	@Test
	public void testShapeToString()
	{
		Assert.assertEquals("Shape toString i n c o r r e c t ." ,"thimble" , Shape.THIMBLE.toString() );
		Assert.assertEquals("Shape toString i n c o r r e c t ." ,"boot" , Shape.BOOT.toString() );
		Assert.assertEquals("Shape toString i n c o r r e c t ." ,"racecar" , Shape.RACECAR.toString() );
	}
	
	@Test
	public void testGamePiece()
	{
		GamePiece test = GamePiece.BLUE_RACER;
		
		Assert.assertEquals("Color value incorrect", Color.BLUE, test.getColor());
		Assert.assertEquals("Shape value incorrect", Shape.RACECAR, test.getShape());
		
		GamePiece test2 = GamePiece.GREEN_BOOT;
		
		Assert.assertEquals("Incorrect GamePiece order", test, GamePiece.movesFirst(test, test2));
		Assert.assertEquals("Incorrect GamePiece order", test, GamePiece.movesFirst(test2, test));
	}
}
