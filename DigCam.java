//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS

public class DigCam extends PictureSound{
	String typeDC;
	String megpix;
	String opzoom;
	String digzoom;
	String scrsize;
	
	//DigCam's constructor. Calls the PictureSound's constructor and sets  the basic characteristics that every Digital Camera has
	public DigCam(int code1,String type1,int year1, String constructor1,double price1,int quantity1,String typeDC1,String megpix1,String opzoom1,String digzoom1,String scrsize1){
		super(code1,type1,year1,constructor1,price1,quantity1);
		typeDC=typeDC1;
		megpix=megpix1;
		opzoom=opzoom1;
		digzoom=digzoom1;
		scrsize=scrsize1;
	}
	
	//Sets  digital camera's type
	public void setTypeDC(String typeDC1){
		typeDC=typeDC1;
	}
	
	//Returns  digital camera's type
	public String getTypeDC(){
		return typeDC;
	}
	
	//Sets  digital camera's megaPixels
	public void setMegpix(String megpix1){
		megpix=megpix1;
	}
	
	//Returns digital camera's megaPixels
	public String getMegpix(){
		return megpix;
	}
	
	//Sets digital camera's optical zoom
	public void setOpzoom(String opzoom1){
		opzoom=opzoom1;	
	}
	
	//Returns digital camera's optical zoom
	public String getOpzoom(){
		return opzoom;
	}
	
	//Sets digital camera's digital zoom
	public void setDigzoom(String digzoom1){
		digzoom=digzoom1;
	}
	
	//Returns digital camera's digital zoom
	public String getDigzoom(){
		return digzoom;
	}
	
	//Sets the digital camera's screen size
	public void setScrsize(String scrsize1){
		scrsize=scrsize1;
	}
	
	//Returns the digital camera's screen size
	public String getScrsize(){
		return scrsize;
	}
	
	//No comms...!
	public String toString(){
		return (super.toString() + " Digital Camera Type: " + typeDC + "\n Megapixel: "+ megpix + "\n Optical Zoom: " + opzoom + "\n Screen Size: " + scrsize);
	}
}//end of class DigCam