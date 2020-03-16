//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS

public abstract class Appliances{
	int code;
	String type;
	int year;
	String constructor;
	double price;
	int quantity;
	
	//The Constructor. Sets the characteristics that are common in the subclasses.
	public Appliances(int code1,String type1,int year1, String constructor1,double price1,int quantity1){
		code=code1;
		type=type1;
		year=year1;
		constructor=constructor1;
		price=price1;
		quantity=quantity1;
		
	}	
	
	//sets the code of the Appliance
	public void setCode(int code1){
		code=code1;
	}
	
	//returns the App code
	public int getCode(){
		return code;
	}
	
	
	//Sets the App's NAME
	public void setType(String type1){
		type=type1;
	}
	
	//Returns the App's NAME
	public String getType(){
		return type;
	}
	
	//Sets the year that the App was made
	public void setYear(int year1){
		year=year1;
	}
	
	//Returns the year that the App was made
	public int getYear(){
		return year;
	}

	//Sets the App's Constructor
	public void setConstructor(String constructor1){
		constructor=constructor1;
	}
	
	//Returns the App's Constructor
	public String getConstructor(){
		return constructor;
	}
	
	//Sets the App's first price(without discount)
	public void setPrice(double price1){
		price=price1;
	}
	
	//Returns the App's first price(without discount)
	public double getPrice(){
		return price;
	}
	
	//Sets the quantity of the available apps(ex. 3 TVS plasma BG438)
	public int getQuantity(){
		return quantity;
	}
	
	//Returns the quantity of the available apps
	public void setQuantity(int quantity1){
		quantity=quantity1;
	}
	
	//No comms...!
	@Override
	public String toString(){
		return ("Product Code: " + code + "\n Name: " + type + "\n Year of Construction:  " + year + "\n Constructor: " + constructor + "\n Price: " + price + "\n Quantity: " + quantity);
	} 
	
	//This abstract method is being implemented polymorphically in subclasses
	public abstract double Discount();
	
}//end of class Appliances