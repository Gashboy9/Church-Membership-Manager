//package management;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Manager1 {
//
//	public static void main(String[] args) {
//
//		System.out.println("Welcome to Church Membership Manager");
//
//		Scanner scan = new Scanner(System.in);
//
//		
//		Person p = new Member();
//		List<Member> members = new ArrayList<Member>();
//		
////		Person p1 = new Visitor();
////		List <Visitor> visitors = new ArrayList<Visitor>();
//
//		while (true) {
//			//1 set values
//			if (p.select_option() == 1) {
//				Person person1 = new Member();
//				members.add((Member) person1);
//				System.out.print("Enter full name: ");
//				String name = scan.next();
//				person1.set_name(name);
//				person1.set_membership_ID();
//				p.record_count++;
//				System.out.println("-----------------------------");
//				
//			
//				//visitor object
////				Person person11 = new Visitor();
////				visitors.add((Visitor) person11);
////				System.out.print("Enter full name: ");
////				String name1 = scan.nextLine();
////				person11.set_name(name1);
////				person11.set_membership_ID();
////				p1.record_count++;
////				System.out.println("-----------------------------");
//				
//				//person1.attendance(name);
//				
//				System.out.print("Enter date of birth: ");
//				String dob = scan.next();
//				person1.set_date_of_birth(dob);
//				System.out.println("-----------------------------");
//				
//				System.out.print("Enter email: ");
//				String email = scan.next();
//				person1.set_email(email);
//				System.out.println("-----------------------------");
//				
//				System.out.print("Enter phone number: ");
//				String phone = scan.next();
//				person1.set_phone_number(phone);
//				System.out.println("-----------------------------");
//				
//				System.out.print("Enter location: ");
//				String location = scan.next();
//				person1.set_location(location);
//				System.out.println("-----------------------------");
//				
//				System.out.print("Enter health status: ");
//				String health_status = scan.next();
//				person1.set_health_status(health_status);
//				System.out.println("-----------------------------");
//				
//				System.out.print("Enter job status: ");
//				String job_status = scan.next();
//				person1.set_job_status(job_status);
//				System.out.println("-----------------------------");
//				
//				System.out.print("Enter contribution: ");
//				double contribution = scan.nextDouble();
//				person1.set_contribution(contribution);
//				System.out.println("-----------------------------");
//				
//				System.out.print("Enter people invited: ");
//				int people_invited = scan.nextInt();
//				person1.set_people_invited(people_invited);
//				System.out.println("-----------------------------");
//				
//				System.out.print("Enter fellowship: ");
//				String fellowship = scan.next();
//				person1.set_fellowship(fellowship);
//				System.out.println("-----------------------------");
//				
//				System.out.println("Record entered successfully");
//
//			}
//
//			//view records
//			else if (p.select_option() == 2) {
//				for (Person items : members) {
//					System.out.println(items);
//					System.out.println("-----------------------------");					
//				}
//			}
//
//			//edit records
//			else if (p.select_option() == 3) {
//				System.out.print("Select record using Membership ID: ");
//				int mid = scan.nextInt();
//				System.out.println(members.get(mid-1));
//				
//				System.out.println("Which field would you like to edit: ");
//				System.out.println("1. Name: ");
//				System.out.println("2. Date of birth: ");
//				System.out.println("3. Email: ");
//				System.out.println("4. Phone number: ");
//				System.out.println("5. Location: ");
//				System.out.println("6. Health status: ");
//				System.out.println("7. Job status: ");
//				System.out.println("8. Contribution: ");
//				System.out.println("9. people invited: ");
//				System.out.println("10. Membership status: ");
//				System.out.println("11. Fellowship: ");
//				
// 			   	int field = scan.nextInt();
//
//				
//				if (field == 1) {
//					System.out.print("Enter new name: ");
//					String new_name = scan.next();
//					members.get(mid-1).set_name(new_name);
//					System.out.println("Name change successful ");
//					System.out.println("------------------ ");
//				}else if (field == 2) {
//					System.out.print("Enter new date of birth: ");
//					String new_dob = scan.next();
//					members.get(mid-1).set_date_of_birth(new_dob);
//					System.out.println("Date of birth change successful ");
//					System.out.println("------------------ ");
//				}else if (field == 3) {
//					System.out.print("Enter new email address: ");
//					String new_email = scan.next();
//					members.get(mid-1).set_email(new_email);
//					System.out.println("Email address change successful ");
//					System.out.println("------------------ ");
//				}else if (field == 4) {
//					System.out.print("Enter new phone number: ");
//					String new_phone = scan.next();
//					members.get(mid-1).set_phone_number(new_phone);
//					System.out.println("Phone number change successful ");
//					System.out.println("------------------ ");
//				}else if (field == 5) {
//					System.out.print("Enter new location: ");
//					String new_location = scan.next();
//					members.get(mid-1).set_location(new_location);
//					System.out.println("Location change successful ");
//					System.out.println("------------------ ");
//				}else if (field == 6) {
//					System.out.print("Enter new health status: ");
//					String new_health_status = scan.next();
//					members.get(mid-1).set_health_status(new_health_status);
//					System.out.println("Health status change successful ");
//					System.out.println("------------------ ");
//				}else if (field == 7) {
//					System.out.print("Enter new job status: ");
//					String new_job_status = scan.next();
//					members.get(mid-1).set_job_status(new_job_status);
//					System.out.println("Job status change successful ");
//					System.out.println("------------------ ");
//				}else if (field == 8) {
//					System.out.print("Add contribution: ");
//					double new_contribution = scan.nextDouble();
//					members.get(mid-1).set_contribution(new_contribution);
//					System.out.println("Contribution change successful ");
//					System.out.println("------------------ ");
//				}else if (field == 9) {
//					System.out.print("Update people invited: ");
//					int new_people_invited = scan.nextInt();
//					members.get(mid-1).set_people_invited(new_people_invited);
//					System.out.println("Job status change successful ");
//					System.out.println("------------------ ");
//				}else if (field == 10) {
//					System.out.print("Update membership status: ");
//					String new_membership_status = scan.next();
//					members.get(mid-1).set_membership_status(new_membership_status);
//					System.out.println("Membership change successful ");
//					System.out.println("------------------ ");
//				}else if (field == 11) {
//					System.out.print("Update fellowship: ");
//					String new_fellowship = scan.next();
//					members.get(mid-1).set_fellowship(new_fellowship);
//					System.out.println("Fellowship change successful ");
//					System.out.println("------------------ ");
//				}
//
//				
//			}
//			
//			//other records
//			else if (p.select_option() == 4) {
//				System.out.print("Select extra record using Membership ID: ");
//				int mid = scan.nextInt();
//				System.out.println(members.get(mid-1));
//				
//				System.out.println("Which field would you like to edit: ");
//				System.out.println("1. Location: ");
//				System.out.println("2. Health status: ");
//				System.out.println("3. Job status: ");
//				System.out.println("4. Contribution: ");
//				System.out.println("5. People invited: ");
//				
//				int field = scan.nextInt();
//				
//				if (field == 1) {
//					System.out.print("Location is: ");
//					System.out.println(members.get(mid-1).get_location());
//					System.out.println("------------------ ");
//				}else if (field == 2) {
//					System.out.print("Health status is: ");
//					System.out.println(members.get(mid-1).get_health_status());
//					System.out.println("------------------ ");
//				}else if (field == 3) {
//					System.out.print("Job status is: ");
//					System.out.println(members.get(mid-1).get_health_status());
//					System.out.println("------------------ ");
//				}else if (field == 4) {
//					System.out.print("Contribution: ");
//					System.out.println(members.get(mid-1).get_contribution());
//					System.out.println("------------------ ");
//				}else if (field == 5) {
//					System.out.print("Number of people invited: ");
//					System.out.println(members.get(mid-1).get_people_invited());
//					System.out.println("------------------ ");
//				}
//				
//			}
//			
//		}
//
//	}
//}