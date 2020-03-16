//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS


public class TV extends PictureSound{
	String typeTV;
	String size;
	String resolution;
	String ports;
	
	//TV's constructor. Calls the PictureSound's constructor and sets  the basic characteristics that every TV has
	public TV(int code1,String type1,int year1, String constructor1,double price1,int quantity,String typeTV1,String size1,String resolution1,String ports1){
		super(code1,type1,year1,constructor1,price1,quantity);
		typeTV=typeTV1;
		size=size1;
		resolution=resolution1;
		ports=ports1;
	}
	
	//Sets the TV type
	public void setTypeTv(String typeTV1){
		typeTV=typeTV1;
	}
	//Returns the TV type
	public String getTypeTv(){
		return typeTV;
	}
	
	//Sets the TV's type
	public void setSize(String size1){
		size=size1;		
	}
	
	//Returns the TV's type
	public String getSizeTv(){
		return size;
	}
	
	//Sets the TV's Resolution
	public void setResolutionTv(String resolution1){
		resolution=resolution1;
	}
	
	//Returns the TV's Resolution
	public String getResolutionTv(){
		return resolution;
	}
	
	//Sets the TV's ports
	public void setPortsTv(String ports1){
		ports=ports1;
	}
	
	//Sets the TV's ports
	public String getPortsTV(){
		return ports;
	}
	
	//No comms...!
	public String toString(){
		return (super.toString() +"\n"+ " TV Type: " + typeTV + "\n Size: " + size + "\n Resolution: " + resolution + "\n Ports: " + ports);
	}
}//end of class TV