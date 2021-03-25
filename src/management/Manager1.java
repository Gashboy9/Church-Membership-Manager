package management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager1 {

	public static void main(String[] args) {

		System.out.println("Welcome to Church Membership Manager");
		
		Scanner scan = new Scanner(System.in);

//		Member[] list = new Member[3];
//		
//		
//		Person p1 = new Member();
//		Person p2 = new Member();
//		Person p3 = new Member();
//		Person p4 = new Member();
//		
//		list [0] = (Member) p1;
//		list [1] = (Member) p2;
//		list [2] = (Member) p3;
//		
//		System.out.println("Record 1: ");
//		p1.select_option();
//		if (p1.select_option() == 1) {
//			System.out.print("Enter name: ");
//			String name = scan.nextLine();
//			p1.set_name(name);
//			
//		}else if (p1.select_option() == 2) {
//			
//		}else if (p1.select_option() == 3) {
//			
//		}
//		
//		System.out.println("Record 2: ");
//		p2.select_option();
//		if (p2.select_option() == 1) {
//			
//		}else if (p2.select_option() == 2) {
//			
//		}else if (p2.select_option() == 3) {
//			
//		}
//		
//		System.out.println("Record 3: ");
//		p3.select_option();
//		if (p3.select_option() == 1) {
//			
//		}else if (p3.select_option() == 2) {
//			
//		}else if (p3.select_option() == 3) {
//			
//		}
//		
//		for (Member m : list) {
//			System.out.println(m);
//		}
		
		Person p = new Member();
		List <Person> persons = new ArrayList<Person>();
		
		while (true) {
			if (p.select_option() == 1) {
				Person person1 = new Member();
				persons.add(person1);
				System.out.print("Enter name: ");
				String name = scan.nextLine();
				person1.set_name(name);
				person1.set_membership_ID();
				p.record_count++;
				
				System.out.println("-----------------------------");
				
			}
			
			if (p.select_option() == 2) {
				for (Person items: persons) {
					System.out.println(items);
					System.out.println("-----------------------------");

				}
			}
		}
		
		
		
		

	}
}