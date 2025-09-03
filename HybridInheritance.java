class Animal{
	void Eat(){
		System.out.println("Eating..");
	}
}
class Dog extends Animal{
	void Bark(){
		System.out.println("Barking..");
	}
}
interface Pet{
	void play();
}
class Puppy extends Dog implements Pet{
	public void play(){
		System.out.println("pet plays");
	}
}
public class HybridInheritance{
	public static void main(String args[]){
	Puppy p=new Puppy();
	p.Eat();
	p.Bark();
	p.play();
	}
}
