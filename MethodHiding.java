// performing method hiding
// over riding: if the child class extended from parent class having non static methods then the output will be from child class,same for member hiding
// method hiding: if the child class extended from parent class having static methods then the output will be from parent class
class Cricket{
	static void Batsmen(){
		System.out.println("batsmen in cricket");
	}
	static void Bowler(){
		System.out.println("bowler in cricket");
	}
}
class BatBall extends Cricket{
	 static void Batsmen(){
		System.out.println("batsmen in batball");
	}
	static void Bowler(){
		System.out.println("bowler in batball");
	}
}
public class MethodHiding{
	public static void main(String args[]){
		Cricket c=new Cricket();
		c.Batsmen();
		c.Bowler();
		System.out.println("\n");
		BatBall b=new BatBall();
		b.Batsmen();
		b.Bowler();
		System.out.println("\n");
		Cricket ref=new BatBall();
		ref.Batsmen();
		ref.Bowler();
	}
}
		
