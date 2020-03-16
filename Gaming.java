//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS


public class  Gaming  extends Appliances {
	
	private String Type;
	private String Processor;
	private String Graphics;
	private String Sound;
	private String Capacity;
	
	
	//Gaming's constructor. Calls the Appliance's constructor and sets the basic characteristics of class Gaming
	public Gaming(int  Code , String Name , int Year , String  Constructor , double Price,int quantity, String type , String processor, String graphics, String sound ,String capacity) {
		super(Code,Name,Year,Constructor,Price,quantity);
		Type=type;
		Processor=processor;
		Graphics=graphics;
		Sound=sound;
		Capacity=capacity;
	}
	
	//Sets the Gaming' s App type
	public void setTypeG(String type1){
		Type = type1;
	}
	
	//Returns the Gaming App's type
	public String getTypeG(){
		return Type;
		
	}
	
	////Sets the Gaming' s App processor
	public void setProcessor(String processor){
		Processor = processor;
	}
	
	//Returns the Gaming App's processor
	public String getProcessor(){
		return Processor;
	}
	
	//Sets the Gaming' s App graphics
	public void setGraphics(String graphics){
		Graphics = graphics;
	}
	
	//Returns the Gaming App's Graphics
	public String getGraphics(){
		return Graphics;
	}

	//Sets the Gaming' s App sound
	public void setSound(String sound){
		Sound=sound;
	}
	
	//Returns the Gaming App's sound
	public String getSound(){
		return Sound;
	}
	
	//Sets the Gaming' s App capacity
	public void setCapacity(String capacity){
		Capacity = capacity;
	}
	
	//Returns the Gaming' s APP capacity
	public String getCapacity(){
		return Capacity;
	}
	
	//Overrides the Appliances' method Discount and sets the Discount for the Gaming Appliances
	@Override
	public double Discount(){
		return (getPrice() * 0.9);
	}
	//No comms...!
	public String toString() {
		
		return  (super.toString() + " Type: " + Type + "\n Processor: " + Processor + "\n Graphics: " + Graphics + "\n Sound: " + Sound + "\n Capacity: " + Capacity);
	}


}//end of class Gaming