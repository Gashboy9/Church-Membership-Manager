package management;

import java.util.Scanner;
import java.util.Date;

public abstract class Person {
	
	Scanner scan = new Scanner (System.in);

	
	String name;
	Date date_of_birth;
	String email;
	String phone_number;
	String location;
	String health_status;
	String job_status;
	double contributions;
	int people_invited;
	int membership_ID;
	String membership_status = "visitor";
	String fellowship;
	int attendance_count;
	static int record_count = 0;
	
	static {
		record_count++;
	}
	
	public void set_membership_ID() {

		membership_ID = record_count;
	}
	public int get_membership_ID() {
		return membership_ID;
	}
	
	public int attendance(String name) {
		if (this.name == name) {
			attendance_count += 1;
		}else {
			attendance_count =1;
		}
		return attendance_count;
	}
	
	
	public void set_name(String name) {
		this.name = name;
	}
	
	public abstract void set_date();
	
	public void set_email(String email) {
		this.email = email;
	}
	
	public void set_phone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public void set_location(String location) {
		this.location = location;
	}
	
	public void set_health_status(String health_status) {
		this.health_status = health_status;
	}
	
	public void set_job_status(String job_status) {
		this.job_status = job_status;
	}
	
	public void set_contribution(double contribution) {
		this.contributions += contribution;
	}
	
	public double get_contribution() {
		return this.contributions;
	}
	
	public void set_people_invited(int people_invited) {
		this.people_invited = people_invited;
	}
	
	public void set_fellowship(String fellowship) {
		this.fellowship = fellowship;
	}
	
	public abstract void calculate_age();
	
	public abstract void calculate_people_invited();
	
	public void membership_status() {
		if (attendance_count >=3) {
			this.membership_status = "Member";
		}
	}
	
	public abstract void last_visit();
	
	public int select_option() {
		System.out.println("Select Option: ");
		System.out.println("1. Enter record: ");
		System.out.println("2. View record: ");
		System.out.println("3. Edit record: ");
		int option = scan.nextInt();
		
		return option;
	}
	
	//public abstract void days_Since_Joined();
	
	public String toString() {
		return "Membership ID: "+membership_ID+ " Name: "+name+ " Date of birth: "+date_of_birth+ " Email: "+email+ " Phone number: "+phone_number +" Fellowship: "+fellowship;
	}
	

}
