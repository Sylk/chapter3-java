package projectTen;
import java.util.Scanner;

public class CreatePet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);

		System.out.print("Enter Pet name >> ");
		String name = scanner.nextLine();
		
		System.out.print("Enter Pet type >> ");
		String type = scanner.nextLine();
		
		System.out.print("Enter Pet age >> ");
		int age = Integer.parseInt(scanner.nextLine());
		
		pet myPet = new pet(name, type, age);
		
		System.out.print("Name >> "+myPet.getName()+"|| Type >> "+myPet.getType()+"|| Age >> "+myPet.getAge());
	}

}
