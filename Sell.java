//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS


public class Sell{
	
	protected static int code1=0;
	private int Code;
	private Appliances Name;
	private String clientName;
	private long Phonenumber;
	private String Month;
	private double FinalCost;
	
	//The Selld's constructor. Sets the required characteristics in order to sell an Appliance
	Sell(Appliances name, String clientname, long phone, String month, double cost){
		Code = code1;
		Name = name;
		clientName = clientname;
		Phonenumber=phone;
		Month = month;
		FinalCost=cost;
		code1++;
	}
	
	//sets the sell code 
	public void setCode1(int code){
		code1=code;
	}
		
	//returns the sell code
	public int getCode1(){
		return code1;
	}
	
	//sets the sell code 
	public void setCode(int code){
		Code=code;
	}
		
	//returns the sell code
	public int getCode(){
		return Code;
	}
	public Appliances getdevName(){
		return Name;
	}
	
	//sets the type of the machine that has just been sold
	public void setName(Appliances name){
		Name = name;
	}
	
	//retuns the type of the machine that has just been sold
	public String getName(){
		return Name.toString();
	}
	
	//sets the  name of the client
	public void setclientName(String name){
		clientName=name;
	}
	
	//returns the  name
	public String getclientName(){
		return clientName;
	}
	
	//Sets the client's phone
	public void setPhone(long newPhonenumber){
	Phonenumber=newPhonenumber;
	}
	
	//Returns the client's phone
	public long getPhone(){
		return Phonenumber;
	}
	
	//sets the month that a machine has been bought/sold
	public void setMonth(String month){
		Month = month;
	}
	
	//retuns that a machine has been bought/sold
	public String getMonth(){
		return Month;
	}
	
	//sets the final cost
	public void setFinalCost(double cost){
		FinalCost=cost;
	}
	
	//returns the final cost
	public double getFinalCost(){
		return FinalCost;
	}
	
	//No comms...!
	public String toString(){
		return "\n"+"Sale code: "+getCode()+"\n Device spec: "+Name.toString()+"\n Client name: "+getclientName()+"\n Phonenumber: "+ getPhone() +"\n sale date: "+getMonth()+"\n final cost: "+getFinalCost();
	}
	
	
}//end of class Sell