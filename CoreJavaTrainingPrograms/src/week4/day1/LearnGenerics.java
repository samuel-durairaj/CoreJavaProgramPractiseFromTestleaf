package week4.day1;

public class LearnGenerics {
	
	/*public static void display(String firstName, String lastName) {
		System.out.print(firstName+" ");
		System.out.println(lastName);
	}
	public static void display(int num1, int num2) {
		System.out.print(num1+" , ");
		System.out.println(num2);
	}*/
	
	//Generic method created for the above 2 normal concrete methods:
	//Generic method for the same data type
	public static <T> void display(T v1, T v2) {
		System.out.print(v1+" , ");
		System.out.println(v2);
	}
	
	//Generic method for 2 different data types
	public static <T,V> void display1(T v1, V v2) {
		System.out.print(v1+" , ");
		System.out.println(v2);
	}

	public static void main(String[] args) {
        
        display("Samuel","Durairaj");
        int a = 2;
        display1("Sachin",a);
        
        //Generic class in Java
        GenericClassTest<String,Integer> obj1 = new GenericClassTest<>("Samuel", 7655);
        obj1.display();
        
        GenericClassTest<Integer,Integer> obj2 = new GenericClassTest<>(123, 789);
        obj2.display();
	}

}

//Generic Class
class GenericClassTest<T,U>{
	T element1;
	U element2;
	public GenericClassTest(T element1, U element2) {
		this.element1 = element1;
		this.element2 = element2;
	}
	
	public void display() {
		System.out.println(this.element1);
		System.out.println(this.element2);
	}
}

