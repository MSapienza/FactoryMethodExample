package factoryMethod;

abstract class Food 
{
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units)
	{
		System.out.println(units * rate);
	}

}
