import java.util.Scanner;

public class arraysarelotsoffun
	{

		public static void main(String[] args)
			{
				Scanner favoriteSweets = new Scanner(System.in);
				
				System.out.println("How many sweets do you enjoy?");
				int numberOfSweets = favoriteSweets.nextInt();
				System.out.println("What sweets do you enjoy?");
				
				Scanner line = new Scanner(System.in);
				String[] array = new String[numberOfSweets];
				String c = line.nextLine();
				
				
				for (int i = 1; i <= numberOfSweets; i++) 
				{
					Scanner sweets = new Scanner(System.in);
					System.out.println("And?");
					String favsweets = sweets.nextLine();
					
					array[i - 1] = favsweets;
					
					
				}
				for (int j = 0; j < numberOfSweets; j++) 
				{
					
			System.out.println("Your fav sweets are " + array[j]);
				}
				
				
			}

	}
