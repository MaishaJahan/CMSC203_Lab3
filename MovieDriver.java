import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		String answer;
		do {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the name of a movie");
			Movie a = new Movie();
			a.setTitle(input.nextLine());
		
			System.out.println("Enter the rating of the movie");
			a.setRating(input.nextLine());
		
			System.out.println("Enter the number of tickets sold for thid movie");
			a.setSoldTickets(input.nextInt());
		
			System.out.println(a.toString());
			input.nextLine();
			System.out.println("Do you want to enter another? (y/n)");
			answer = input.nextLine();
			
			
			} while (answer.equals("y"));
		System.out.println("Goodbye");
	}

}
