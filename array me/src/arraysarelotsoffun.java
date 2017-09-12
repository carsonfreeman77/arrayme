import java.util.Scanner;

public class arraysarelotsoffun
	{

	public static void main(String[] args) 
	{
		Scanner favoriteSweets = new Scanner(System.in);

		System.out.println("How many sweets do you enjoy?");
		
		int numberOfSweets = favoriteSweets.nextInt();
		
		String[] array = new String[numberOfSweets];
		
		System.out.println("What sweets are your top choices?");
		
		
		for (int i = 1; i <= numberOfSweets; i++) 
		{

			Scanner sweets = new Scanner(System.in);
			String favsweets = sweets.nextLine();

			array[i - 1] = favsweets;
			
			
		}
		System.out.print("Your favorite sweets are: ");
		for (int j = 0; j < array.length; j++)
			{
				System.out.print(array[j]);
				if (array.length - 1 == j )
					{
						System.out.print(".");
					}
				else 
					{
						System.out.print(", ");
					}
				
			}
		System.out.println();
		

	
		
				Scanner s = new Scanner(System.in);
				System.out.println("Enter 8 odd or even numbers");
				int userInput = s.nextInt();

				int numbers[] = new int[8];

				for (int i = 1; i < 8; i++)
					{
						numbers[i] = s.nextInt();
					}
				System.out.print("Odds: ");
				for (int i = 1; i < 8; i++)
					{
						if (numbers[i] % 2 != 0)
							{
								System.out.print(numbers[i] + " ");

							}

					}
				System.out.println(" ");
				System.out.print("Evens: ");
				for (int i = 1; i < 8; i++)
					{
						if (numbers[i] % 2 == 0)
							{
								System.out.print(numbers[i] + " ");
							}
					}
				
			
		

	}
	}
