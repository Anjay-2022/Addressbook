package adressbook;

import java.util.Scanner;

public class Address_book {
	Scanner sc = new Scanner(System.in);

	String firstname, lastname, address, city, state, email;
	int zipcode, mobileno;

	public void addcontact() {
		System.out.println("Enter First name");
		firstname = sc.nextLine();
		System.out.println("Enter last name");
		lastname = sc.nextLine();
		System.out.println("Enter Address ");
		address = sc.nextLine();
		System.out.println("Enter City name");
		city = sc.nextLine();
		System.out.println("Enter State name");
		state = sc.nextLine();
		System.out.println("Enter Email Address");
		email = sc.nextLine();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Zipcode");
		zipcode = sc1.nextInt();
		System.out.println("Enter Mobile number");
		mobileno = sc1.nextInt();
	}

	public void display() {
		System.out.println("First name :" + firstname);
		System.out.println("last name :" + lastname);
		System.out.println("Address :" + address);
		System.out.println("City name :" + city);
		System.out.println("State name :" + state);
		System.out.println("Email Address :" + email);
		System.out.println("Zipcode :" + zipcode);
		System.out.println("Mobile number :" + mobileno);
	}

	public void editcontact() {
		System.out.println(
				"Choose the option for edit \n1.firstname\n2.lastname\n3.address\n4.city\n5.state\n6.email\n7.zipcode\n8.mobilenumber");

		int option = sc.nextInt();

		switch (option) {

		case 1:
			System.out.println("Enter First name");
			firstname = sc.nextLine();
			break;
		case 2:
			System.out.println("Enter last name");
			lastname = sc.nextLine();
			break;
		case 3:
			System.out.println("Enter Address ");
			address = sc.nextLine();
			break;
		case 4:
			System.out.println("Enter City name");
			city = sc.nextLine();
			break;
		case 5:
			System.out.println("Enter State name");
			state = sc.nextLine();
			break;
		case 6:
			System.out.println("Enter Email Address");
			email = sc.nextLine();
			break;
		case 7:
			System.out.println("Enter Zipcode");
			zipcode = sc.nextInt();
			break;
		case 8:
			System.out.println("Enter Mobile number");
			mobileno = sc.nextInt();
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program in Address Book Main class");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the option \n1.Add contact\n2.Display contact\n3.Edit contact\n4.Delete contact");
		Address_book c1 = new Address_book();
		int option = sc.nextInt();

		switch (option) {
		case 1:
			c1.addcontact();
			break;
		case 2:
			c1.display();
			break;
		case 3:
			c1.editcontact();
			break;
		default:
			System.out.println("choose correct option");
		}
	}
}
