package management;

public class Visitor extends Person {
	
	Visitor(){
		membership_status = "Visitor";
	}

	public String toString() {
		return super.toString() + " Membership status:"+ membership_status;
	}

}

