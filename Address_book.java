package adressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Address_book {
	ArrayList<Contacts> contactlist = new ArrayList<Contacts>();
	public void addcontact() {
		Scanner sc = new Scanner(System.in);
		Contacts contact = new Contacts();

		System.out.println("Enter the First name");
		contact.setFirstname(sc.next());
		System.out.println("Enter the Last name ");
		contact.setLastname(sc.next());
		System.out.println("Enter the Address");
		contact.setAddress(sc.next());
		System.out.println("Enter the City");
		contact.setCity(sc.next());
		System.out.println("Enter the State");
		contact.setState(sc.next());
		System.out.println("Enter the Email");
		contact.setEmail(sc.next());
		System.out.println("Enter the Zipcode");
		contact.setZipcode(sc.nextInt());
		System.out.println("Enter the Mobile number");
		contact.setMobileno(sc.nextLong());

		contactlist.add(contact);
	}

	public void display() {
		if (contactlist.size() > 0) {
			for (Contacts i : contactlist)
				System.out.println(i);
		} else
			System.out.println("contact list is empty");

	}

	public void editcontact() {
		Scanner sc = new Scanner(System.in);
		Contacts contact = new Contacts();
		if (contactlist.size() > 0) {
			System.out.println("Enter the first name of that contact you want to Edit");
			String firstname = sc.next();
			boolean check = false;

			for (int i = 0; i < contactlist.size(); i++) {
				if (contactlist.get(i).getFirstname().equals(firstname)) {
					check = true;
					System.out.println(
							"Choose the option for edit \n1.firstname\n2.lastname\n3.address\n4.city\n5.state\n6.email\n7.zipcode\n8.mobilenumber");
					int option = sc.nextInt();
					switch (option) {
					case 1:
						System.out.println("Enter First name to edit");
						contactlist.get(i).setFirstname(sc.next());
						break;
					case 2:
						System.out.println("Enter last name to edit");
						contactlist.get(i).setLastname(sc.next());
						break;
					case 3:
						System.out.println("Enter Address  to edit");
						contactlist.get(i).setAddress(sc.next());
						break;
					case 4:
						System.out.println("Enter City name to edit");
						contactlist.get(i).setCity(sc.next());
						break;
					case 5:
						System.out.println("Enter State name to edit");
						contactlist.get(i).setState(sc.next());
						break;
					case 6:
						System.out.println("Enter Email Address to edit");
						contactlist.get(i).setEmail(sc.next());
						break;
					case 7:
						System.out.println("Enter Zipcode to edit");
						contactlist.get(i).setZipcode(sc.nextInt());
						break;
					case 8:
						System.out.println("Enter Mobile number to edit");
						contactlist.get(i).setMobileno(sc.nextLong());
						break;
					}
					System.out.println("Contact edited and Saved succesfully in Directory");
				}
			}
			if (check == false) {
				System.out.println("Contact not found in Directory");
			}

		} else
			System.out.println("Directory is empty");
	}

	public void deletecontact() {
		Scanner scanner = new Scanner(System.in);
		if (contactlist.size() > 0) {
			System.out.println("Enter the first name of that contact you want to delete");
			String delname = scanner.next();
			boolean check = false;
			for (int i = 0; i < contactlist.size(); i++) {
				if (contactlist.get(i).getFirstname().equals(delname)) {
					check = true;
					Contacts contact = contactlist.get(i); // object in i th postion Contacts in contactlist
					contactlist.remove(contact);
					System.out.println("Contact deleted...");
					break; // used to terminate when contact found and deleted
				}
			}
			if (check == false)
				System.out.println("Contact not found in Directory");

		} else
			System.out.println("Directory is empty");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program in Address Book Main class");
		Address_book c1 = new Address_book();
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("Choose the option \n1.Add contact\n2.Display contact\n3.Edit contact\n4.Delete contact\n5.Exit");
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
			case 4:
				c1.deletecontact();
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("choose correct option");
			}
		}
	}
}
