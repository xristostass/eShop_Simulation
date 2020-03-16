//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS


public class WashingMachine extends HomeAppliances {
	//private double capacity;
	private int spinSpeed;
	
	//WashingMachine's constructor. Calls the HomeAppliance's constructor and sets the basic characteristics that every Washing Machine has
	WashingMachine(int code1, String name1, int year1, String constructor1, double price1,int quantity, String energy1, double capacity1, int spinSpeed1){
		super(code1,name1,year1,constructor1,price1,quantity,energy1,capacity1);
	
	spinSpeed = spinSpeed1;
	}

		
	//Sets the washing machine's spinspeed
	public void setSpinSpeed(int spinSpeed1){
		spinSpeed = spinSpeed1;
	}
	
	//Returns the washing machine's spinspeed
	public int getSpinSpeed(){
		return spinSpeed;
	}
	
	//No comms...!
    public String toString(){
		return (super.toString() + "\n Spin Speed: " + spinSpeed);
	}
	
}//end of class WashingMachine