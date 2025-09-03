// using super keyword
// class parent
class Parent{
	String name="Parent";
	//constructor
	Parent(){
		System.out.println("parent constructor");
	}
	//method
	void Show(){
		System.out.println("hello from parent");
	}
}
// class child is extended from parent
class Child extends Parent{
	String name="child";
	void Display(){
		System.out.println(name);// displays child name and hides parent name   also covers concept member hiding
		System.out.println(super.name);// displays parent name
		super.Show();// displays the content in show method
	}
}

public class SuperKeyword{
	public static void main(String args[]){
		Child c=new Child();
		c.Display();
	}
}
