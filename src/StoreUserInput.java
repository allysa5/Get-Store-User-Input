	import java.util.Scanner;
public class StoreUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in); 
		String firstInitial = keyboard.next(); 
		String lastName = keyboard.next();
		Integer houseNumber = keyboard.nextInt();
		String streetName = keyboard.next();
		String streetType = keyboard.next();
		String city = keyboard.next();
		
		System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		System.out.println(streetName + " " + streetType + " " + city);


	}

}
