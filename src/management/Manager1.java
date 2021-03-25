package management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager1 {

	public static void main(String[] args) {

		System.out.println("Welcome to Church Membership Manager");

		Scanner scan = new Scanner(System.in);

		Person p = new Member();
		List<Person> persons = new ArrayList<Person>();

		while (true) {
			if (p.select_option() == 1) {
				Person person1 = new Member();
				persons.add(person1);
				System.out.print("Enter name: ");
				String name = scan.nextLine();
				person1.set_name(name);
				person1.set_membership_ID();
				p.record_count++;
				System.out.println("Record entered successfully");
				System.out.println("-----------------------------");

			}

			else if (p.select_option() == 2) {
				for (Person items : persons) {
					System.out.println(items);
					System.out.println("-----------------------------");

				}
			}

			else if (p.select_option() == 3) {
//				System.out.println("Select Membership ID: ");
//				
//				
//				if (p.membership_ID == mid) {
//					System.out.println("Which field would you like to edit");
//					System.out.println("1. Name :");
//					
//					int val = scan.nextInt();

				System.out.print("Select record using Membership ID: ");
				int mid = scan.nextShort();
				System.out.println(persons.get(mid-1));
				
				System.out.println("Which field would you like to edit: ");
				System.out.println("1. Name: ");
				System.out.println("2. Date of birth: ");
				System.out.println("3. Phone number: ");
				System.out.println("4. Location: ");
				System.out.println("5. Health status: ");
				System.out.println("6. Job status: ");
				System.out.println("7. Contribution: ");
				System.out.println("8. people invited: ");
				System.out.println("9. Membership status: ");
				
				int field = scan.nextInt();
				
				if (field == 1) {
					System.out.print("Enter new name: ");
					String new_name = scan.next();
					persons.get(mid-1).set_name(new_name);
					System.out.println("Name change successful ");
					System.out.println("------------------ ");
				}else if (field == 2) {
					
				}else if (field == 3) {
					
				}else if (field == 4) {
					
				}else if (field == 5) {
					
				}else if (field == 6) {
					
				}else if (field == 7) {
					
				}else if (field == 8) {
					
				}else if (field == 9) {
					
				}

				
			}

		}

	}
}