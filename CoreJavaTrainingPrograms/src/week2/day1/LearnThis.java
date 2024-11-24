package week2.day1;

public class LearnThis {

	//Parameterizing the constructor
	LearnThis(){
		System.out.println(this.a);
	}
	LearnThis(String str){
		System.out.println(str);
	}
	
	int a = 10;
	public void print() {
		System.out.println("Print This Method");
	}
	
	public void printData() {
		int val = this.a;
		 System.out.println(this.a);
	        this.print();
	}
	
	public static void main(String[] args) {
		LearnThis obj = new LearnThis("Samuel");
		obj.print();
        System.out.println(obj.a);
        
        obj.printData();
	}

}
