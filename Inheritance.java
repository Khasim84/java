// program to use inhertance
class Animal
{
	void Eat(){
		System.out.println("eating..");
	}
}
class Dog extends Animal{
	void Dogg(){
		System.out.println("barking..");
	}
}
class Puppy extends Dog{
	void Pupppy(){
		System.out.println("weeping..");
	}
}
public class Inheritance{
	public static void main(String args[]){
		Puppy p=new Puppy();
		p.Eat();
		p.Dogg();
		p.Pupppy();
	}
}

