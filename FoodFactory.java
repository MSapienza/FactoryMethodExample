package factoryMethod;

public class FoodFactory 
{
	public Food foodType (String food)
	{
		if (food == null)
		{
			return null;
		}
		else if (food.equalsIgnoreCase("DAIRY"))
		{
			return new Dairy();
		}
		else if (food.equalsIgnoreCase("MEAT"))
		{
			return new Meat();
		}
		else if (food.equalsIgnoreCase("VEGETABLES"))
		{
			return new Vegetables();
		}
		else
		{
			return null;
		}
	}

}
