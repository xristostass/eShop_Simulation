//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS


public class PictureSound extends Appliances{
	
	//PictureSounds' constructor. Calls the Appliance's constructor and sets the basic characteristics of class PictureSound
	public PictureSound(int code1,String type1,int year1, String constructor1,double price1,int quantity){
		super(code1,type1,year1,constructor1,price1,quantity);
	}
	
	//Overrides the Appliances' method Discount and sets the Discount for the Picture & Sound Appliances
	@Override
	public double Discount(){
		return (getPrice() * 0.75);
		
	}

}//end of class PictureSound