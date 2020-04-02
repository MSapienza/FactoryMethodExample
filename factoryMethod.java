package factoryMethod;

import java.io.IOException;
import java.util.Scanner;

public class factoryMethod {

	public static void main(String[] args) throws IOException
	{
		String myFood;
		int units;
		FoodFactory ff = new FoodFactory();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What kind of food did you purchase? [Dairy, Food, Meat]: ");
		myFood = sc.nextLine();
		myFood = myFood.toUpperCase();
		System.out.println("How many would you like to purchase? ");
		units = sc.nextInt();

		Food f = ff.foodType(myFood);

		
		System.out.print("Bill amount for "+units+" units of " + myFood + " is: ");
		
		f.getRate();
		f.calculateBill(units);
		
	}

}
