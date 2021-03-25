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
//				int mid = scan.nextShort();
//				
//				if (p.membership_ID == mid) {
//					System.out.println("Which field would you like to edit");
//					System.out.println("1. Name :");
//					
//					int val = scan.nextInt();

				System.out.println("Select record");

				System.out.println(persons.get(2-1));

			}

		}

	}
}