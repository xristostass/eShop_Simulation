//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS


public class DVD extends PictureSound{
	String typeDVD;
	String resolution;
	String format;
	
	//DVD's constructor. Calls the PictureSound's constructor and sets  the basic characteristics that every DVD has
	public DVD (int code1,String type1,int year1, String constructor1,double price1,int quantity,String typeDVD1,String resolution1,String format1){
		super(code1,type1,year1,constructor1,price1,quantity);
		typeDVD=typeDVD1;
		resolution=resolution1;
		format=format1;
	}
	
	//Sets the DVD's type
	public void setTypeDVD(String typeDVD1){
		typeDVD=typeDVD1;
	}
	
	//Returns the DVD's type
	public String getTypeDVD(){
		return typeDVD;
	}
	
	//Sets the DVD's resolution
	public void setResolutionDVD(String resolution1){
		resolution=resolution1;
	}
	//Returns the DVD's resolution
	public String getResolutionDVD(){
		return resolution;
	}
	
	//Sets the DVD's format
	public void setFormat(String format1){
		format=format1;
	}
	
	//Returns the DVD's type
	public String getFormat(){
		return format;
	}
	
	//No comms...!
	public String toString(){
		return ( super.toString() +" DVD Type: " + typeDVD + "\n Resolution: " + resolution + "\n Format: " + format );
	}
}//end of class DVD