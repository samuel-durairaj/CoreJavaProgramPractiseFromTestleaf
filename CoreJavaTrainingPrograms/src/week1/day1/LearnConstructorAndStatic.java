package week1.day1;

public class LearnConstructorAndStatic {
     	
	//Constructor does not have any return type
	//It is the gate way to a class
	static int a = 20; // Static integer, so no need for object to call
	public static int b =30;
	int c = 40;
	

	static int i = 10;
	
	//Constructor without access modifier
	LearnConstructorAndStatic(){
		System.out.println(i);
	}
	
	public static void print()
	{
		System.out.println("print static method");
	}
    static void printNew()
	{
		System.out.println("print another static method");
	}
	//Using the constructor we can use the non-static members of the class
	//Used to create object of the class
	
//	public LearnConstructorAndStatic() {
//		System.out.println("Constructor is Invoked");
//	}
	
	String str = "test";
	public static void main(String[] args) {
		new LearnConstructorAndStatic();
//		LearnConstructorAndStatic obj = new LearnConstructorAndStatic();
//        System.out.println(obj.str);
//        System.out.println(a);
//        print();
//        printNew();
	}
}
