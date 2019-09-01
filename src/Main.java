
public class Main {

	public static void main(String[] args) 
	{
		Mundo mundo1 = new Mundo("Terra", 100, 100);
		Character location1 = new Character(150,-10);
		
		
		System.out.println("Character location in " + mundo1.getWorldName() + " is: X-" + location1.getLocationX() + " Y-" + location1.getLocationY());
		
	}

}
