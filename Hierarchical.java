class Vehicle{
	void Start(){
	System.out.println(" vehicle Starts..");
	}
	void Stop(){
	System.out.println(" vehicle stops..");
	}
}
class Car extends Vehicle{
	void Carr(){
		System.out.println(" car has 4 wheels..");
	}
}
class Bike extends Vehicle{
	void Bikee(){
		System.out.println(" bike has 2 wheels..");
	}
}
class Auto extends Vehicle{
	void Autoo(){
		System.out.println(" Auto has 3 wheels..");
	}
}
public class Hierarchical{
	public static void main(String args[]){
		Car c=new Car();
		c.Start();
		c.Carr();
		c.Stop();
		System.out.println("\n"); 
		Bike b=new Bike();
		b.Start();
		b.Bikee();
		b.Stop();
		System.out.println("\n"); 
		Auto a=new Auto();
		a.Start();
		a.Autoo();
		a.Stop();
	}
}
