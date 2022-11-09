package adressbook;

import java.util.Scanner;

public class Address_book {
	Scanner sc = new Scanner(System.in);

	String firstname,lastname,address,city,state,email;
	int zipcode,mobileno;

	public void addcontact() {
		System.out.println("Enter First name");firstname =  sc.nextLine();
		System.out.println("Enter last name");  lastname =  sc.nextLine();
		System.out.println("Enter Address "); address =  sc.nextLine();
		System.out.println("Enter City name"); city =  sc.nextLine();
		System.out.println("Enter State name"); state =  sc.nextLine();
		System.out.println("Enter Email Address"); email =  sc.nextLine();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Zipcode"); zipcode =  sc1.nextInt();
		System.out.println("Enter Mobile number");mobileno =  sc1.nextInt();
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
		c1.addcontact();
		break;
		case 3:
		c1.addcontact();
		break;		         
		case 4:
		c1.addcontact();
		break;	
		default:
		System.out.println("choose correct option");
		}
	}
}
