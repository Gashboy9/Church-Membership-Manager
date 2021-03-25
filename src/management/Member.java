package management;

public class Member extends Person {
	
	Member(){
		membership_status = "Member";
	}
	
	public String toString() {
		return super.toString() + " Membership status: "+ membership_status;
	}

}
