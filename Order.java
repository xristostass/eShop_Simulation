//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS


import java.util.*;

public class  Order{
	//private ArrayList <Appliances> order = new ArrayList <Appliances>();
	protected static int code1=0;
    private int Code;
	private Appliances Dev_name;
	private String Customer;
	private long Phonenumber;
	private String oMonth;
	private String aMonth;
	private double FinalCost;
	private String OrderStatus;

	//The Order's constructor. Sets the required characteristics in order to order
	public Order(Appliances dev_name,String customer,long phone,String omonth,String amonth,double finalcost){
	Code=code1;
	Dev_name=dev_name;
	Customer=customer;
	Phonenumber=phone;
	oMonth=omonth;
	aMonth=amonth;
	FinalCost=finalcost;
	OrderStatus = "Due to";
	code1++;
	}
	
	public int getCode1(){
		return code1;
	}
	public void setCode1(int code){
		code1=code;
	}
	
	//Returns Order's code
	public int getCode(){
		return Code;
	}
	public void setCode(int code){
		Code=code;
	}
	//Sets the Appliance's name
	public void setdevName(Appliances newdevName){
		Dev_name=newdevName;
	}

	//Returns the Appliance's name
	public Appliances getdevName(){
		return Dev_name;
	}

	//Sets the Customer's name
	public void setCustomer(String newCustomer){
		Customer=newCustomer;
	}
    
	//Returns the Customer's name
	public String getCustomer(){
		return Customer;
	}

	//Sets the Client's phone
	public void setPhone(long newPhonenumber){
		Phonenumber=newPhonenumber;
	}

	//Returns the Client's phone
	public long getPhone(){
		return Phonenumber;
	}
	
	//Sets the order's month
	public void setOrderMonth(String month){
		oMonth = month;
	}

	//Sets the Order's month
	public String getOrderMonth(){
		return oMonth;
	}

	//Sets the order's arrival month
	public void setArrivalMonth(String month){
		aMonth = month;
	}

	//Returns the order's arival month
	public String getArrivalMonth(){
		return aMonth;
	}
	
	//Sets the final cost
	public void setFinalCost(double newCost){
		FinalCost=newCost;
	}

	//Returns the final cost
	public double getFinalCost(){
		return FinalCost;
	}

	//Sets the order's status
	public void setorderStatus(){
		OrderStatus="Arrived";
	}
	
	//Returns the order's status
	public String getorderStatus(){
		return OrderStatus;
	}
	
	//No comms...!
	public String toString(){
		return ("\n"+"Order code: " +getCode() + "\nDevice spec: " + Dev_name.toString() + "\n Client name: " + getCustomer() + "\n Phonenumber: "+getPhone() +"\n Order Date: " + getOrderMonth() 
			+ "\n Arrival Date: " + getArrivalMonth() + "\n Final Cost: " + getFinalCost()  + "\n Status: " + getorderStatus()
		);
			
	}  

}//end of class order