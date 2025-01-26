package week2.day1;

public class ThisKeyword {

	//Below are the instance variables
	int stud_id;
	String stud_name;
	String stud_address;
	
	ThisKeyword(){
		//this(924234,"Durairaj","Chennai");
		System.out.println("Print default constructor");
	}
	
	ThisKeyword(String pinCode){
		System.out.println("Address Pincode :"+pinCode);
	}
	
	ThisKeyword(int stud_id, String stud_name, String stud_address){
		this("982347");
		this.stud_id=stud_id;
		this.stud_name = stud_name;
		this.stud_address = stud_address;
	}
	
	void getData() {
		System.out.println(this);
		System.out.println("I am data");
	}
	
	void display() {
		String stud_name="Sachin";//Local variable
		System.out.println("Student ID: "+stud_id);
		System.out.println("Student Name: "+stud_name);
		System.out.println("Student Address: "+stud_address);
		this.getData();
	}
	
public static void main(String[] args) {
	ThisKeyword obj = new ThisKeyword(924234,"Durairaj","Chennai");
	obj.display();
	System.out.println(obj);
}	
}