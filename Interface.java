// writing a program using multiple inheritance
// directly we cannot use multiple inhertance
//but with using interface we able to do

// camera has photo capturing quality
interface Camera{
	void takePhoto();
}
// phone has photo calling quality
interface Phone{
	void makeCall();
}
//smartphone has both qualities 
// so smartphone is implemented from camera and phone
class SmartPhone implements Camera,Phone{
	public void takePhoto(){
		System.out.println("taking a photo..");
	}
	public void makeCall(){
		System.out.println("making a call..");
	}
}
public class Interface{
	public static void main(String args[]){
		SmartPhone s=new SmartPhone();
		s.takePhoto();
		System.out.println("\n");
		s.makeCall();
	}
}
