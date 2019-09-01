
public class Character 
{
	
	private String CharName = "Vinicius";
	private Integer LocationX;
	private Integer LocationY;
	
	public Character()
	{
		super();
	}
	
	public Character(Integer newLocationX, Integer newLocationY)
	{
	super();
	
		if(newLocationX < 101 && newLocationX > 0)
		{
			
		this.LocationX = newLocationX;
		
		}else if (newLocationX < 0)
		{
			
			this.LocationX = 0;
			System.out.println("Character going out of the World");
			
		}else if (newLocationX > 100)
		{
			this.LocationX = 100;
			System.out.println("Character going out of the World");
		}
		
		if(newLocationY < 101 && newLocationY > 0)
		{
			
			this.LocationY = newLocationY;
			
		}else if(newLocationY < 0)
		{
			this.LocationY = 0;
			System.out.println("Character going out of the World");
			
		}else if(newLocationY > 100)
		{
			this.LocationY = 100;
			
		}
	
	}
	
	public String getCharName() 
	{
		return this.CharName;
	}
	
	public Integer getLocationX()
	{
		return this.LocationX;
	}
	
	public Integer getLocationY()
	{
		return this.LocationY;
	}
	
	public void setLocationX(Integer LocationX)
	{
		this.LocationX = LocationX;
	}
	
	public void setLocationY(Integer LocationY)
	{
		this.LocationY = LocationY;
	}
}
