package management;

import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {

		System.out.println("Welcome to Church Membership Manager");

		Member[] list;
		Scanner scan = new Scanner(System.in);

		Person p1 = new Member();
		list = new Member[p1.record_count];

		while (true) {

			int opt = p1.select_option();

			if (opt == 1) {

				System.out.println("Option 1 selected");
				for (int j = 0; j <= list.length - 1; j++) {
					list[j] = (Member) p1;
					System.out.println(list[j]);

					p1.set_membership_ID();

					System.out.print("Enter name: ");
					String name = scan.nextLine();
					p1.set_name(name);

//				System.out.print("Enter Date of birth: ");
//				String DOB = scan.next();
//				p1.set_date();

//						System.out.print("Enter email: ");
//						String email = scan.nextLine();
//						p1.set_email(email);

					System.out.print("Enter phone number: ");
					String phone = scan.nextLine();
					p1.set_phone_number(phone);

//				System.out.print("Enter location: ");
//				String location = scan.nextLine();
//				p1.set_location(location);
//				
//				System.out.print("Enter health status: ");
//				String health_status = scan.nextLine();
//				p1.set_health_status(health_status);
//				
//				System.out.print("Enter job status: ");
//				String job_status = scan.nextLine();
//				p1.set_job_status(job_status);
//				
//				System.out.print("Enter contribution amount: ");
//				double contribution = scan.nextInt();
//				p1.set_contribution(contribution);
//				
//				System.out.print("Enter number of people invited: ");
//				int people_invited = scan.nextInt();
//				p1.set_people_invited(people_invited);
//				
//				p1.attendance(name);
//				
//				System.out.print("Enter fellowship: ");
//				String fellowship = scan.nextLine();
//				p1.set_fellowship(fellowship);
//				
					System.out.println("Record entered successfully.");
					p1.record_count++;

				}
			} else if (opt == 2) {
				for (Member m : list) {
					System.out.println(m);
				}
			} else if (opt == 3) {
				System.out.println("Select option 3");
			} else {
				System.out.println("Select specified option");
			}

		}
	}

}
