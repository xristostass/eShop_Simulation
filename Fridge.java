//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS

public class Fridge extends HomeAppliances {
    private String type;
    private double freezerscapacity;
    
	//Fridge's constructor. Calls the HomeAppliance's constructor and sets the basic characteristics that every Fridge has
	Fridge(int code1, String name1, int year1, String constructor1, double price1,int quantity, String energy1, double capacity1, String type1, double freezersCapacity1){
		super(code1,name1,year1,constructor1,price1,quantity,energy1,capacity1);
		type = type1;
		freezerscapacity = freezersCapacity1;
	}
	
	//Sets Fridge's type
	public void setTypeF(String type1){
		type = type1;
	}
	
	//Returns Fridge's type
	public String getTypeF(){
		return type;
	}
		
	//Sets Fridge's freezer's capacity
	public void setFreezersCapacity(double freezersCapacity1){
		freezerscapacity = freezersCapacity1;
	}
	
	//Sets Fridge's freezer's capacity
	public double getFreezersCapacity(){
		return freezerscapacity;
	}
	
	//No comms...!
	public String toString(){
		return (super.toString() +" Fridge Type: " + type + "\n Freezer's Capacity: " +freezerscapacity ); 
	}
}//end of class Fridge