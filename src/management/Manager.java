package management;

import java.util.Scanner;

public class Manager {
	
	public static void main (String [] args) {
		
		System.out.println("Welcome to Church Membership Manager");
		
		Person p1 = new Member();
		Member [] list ;
		Scanner scan = new Scanner(System.in);
		
		list = new Member [p1.record_count];
		
		while(true) {
		for (int i=0; i<=list.length-1; i++) {
			list[i] =  p1;
		
		int opt =p1.select_option();
		
		if (opt == 1) {
			System.out.println("Option 1 selected");
			for (int j=0; j<=list.length-1; j++) {
				
				p1.set_membership_ID();
				
				System.out.print("Enter name: ");
				String name = scan.nextLine();
				p1.set_name(name);
				
//				System.out.print("Enter Date of birth: ");
//				String DOB = scan.next();
//				p1.set_date();
				
				System.out.print("Enter email: ");
				String email = scan.nextLine();
				p1.set_email(email);
				
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
			
			}
			
		} 
		else if (opt == 2) {
			//p1.toString();
			for (int k=0; k<= list.length-1; k++) {
				System.out.println(list[i]);
			}
		} 
		else if (opt == 3) {
			System.out.println("Select option 3");
		}else {
			System.out.println("Select option");
		}

		}
	}
	}
	

}
