//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS


public class HomeAppliances extends Appliances {
    protected String energy;
    protected double capacity;
    
	//Home Appliances' constructor. Calls the Appliance's constructor and sets the basic characteristics of class HomeAppliances
	HomeAppliances(int code1, String name1, int year1, String constructor1, double price1,int quantity, String energy1, double capacity1){
		super(code1,name1,year1,constructor1,price1,quantity);
		energy = energy1;
		capacity = capacity1;
		}
	
	public void setEnergy(String energy1){
		energy = energy1;
	} //Sets the appliance's energy
	
	public String getEnergy(){
		return energy;
	} //returns the Appliance's energy	
	
	//Sets the Appliaces capacity
	public void setCapacity(double capacity1){
		capacity = capacity1;
	}
	
	//Returns the Appliaces capacity
	public double getCapacity(){
		return capacity;
	}
	
	//Overrides the Appliances method Discount and sets the Discount for the Home Appliances
	@Override
	public double Discount(){
		return (getPrice() * 0.8);
	}
	
	//No comms...!
	public String toString(){
		return (super.toString() +"\n"+ " Appliance's Energy: "+ energy + "\n Capacity: " + capacity);
	}
	
} //end of class HomeAppliances