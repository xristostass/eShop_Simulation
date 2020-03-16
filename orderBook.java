//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS

import java.util.ArrayList;
import java.io.*;


public class orderBook {
	
	private ArrayList <Order> orders = new ArrayList <Order>();
	
	//Returns the size of Arraylist orders
	public int size(){
		 return orders.size();
	}
	public ArrayList <Order> Ordsearch(String Clientname){
		ArrayList <Order> ordsearch = new ArrayList<Order>();
		for(Order order:orders){
			if(Clientname.equalsIgnoreCase(order.getCustomer()))
				ordsearch.add(order);
		}
		return ordsearch;
	}

	//Writes every order and its characteristics
	public void writeOrder(String data){
		File f = null;
		BufferedWriter writer = null;
		Appliances product=null;
		try	{
			f = new File(data);
		}
		catch (NullPointerException e) {
			System.err.println ("The file was not found.");
		}

		try	{
			writer = new BufferedWriter(new OutputStreamWriter
				(new FileOutputStream(f)));
		}
		catch (FileNotFoundException e) {
			System.err.println("Error opening file for writing!");
		}
		
		try {
			//Writes every order and the order’s characteristics
			writer.write("ORDER_LIST \n { \n");
			for(Order order:orders){
				writer.write(
				"\t"+"ORDER"+"\n"+
				"\t"+"{"+"\n"+
				"\t"+"\t"+"ORDER_NUMBER "+order.getCode()+"\n"+
				"\t"+"\t"+"NAME "+order.getCustomer()+"\n"+
				"\t"+"\t"+"PHONENUMBER "+order.getPhone()+"\n"+
				"\t"+"\t"+"ORDER_DATE "+order.getOrderMonth()+"\n"+
				"\t"+"\t"+"DELIVERY_DATE "+order.getArrivalMonth()+"\n"+
				"\t"+"\t"+"FINAL_COST "+order.getFinalCost()+"\n"+
				"\t"+"\t"+"STATUS "+order.getorderStatus()+"\n");
				product=order.getdevName();
				if(product instanceof TV){
						writer.write("\t"+"\t"+"CODE "+product.getCode() + "\n" +"\t"+"\t"+"ITEM_TYPE TV "  +  "\n" +"\t"+"\t"+"MODEL " + (product).getType() + "\n" +"\t"+"\t"+"MODEL_YEAR  " + product.getYear() + "\n" +"\t"+"\t"+"MANUFACTURER "  + product.getConstructor()  + "\n" +"\t"+"\t"+"PRICE " + product.getPrice() + "\n" +"\t"+"\t"+"QUANTITY " +product.getQuantity() + "\n" +"\t"+"\t"+"PANEL_TYPE " + ((TV)product).getTypeTv() + "\n" +"\t"+"\t"+"INCHES " + ((TV)product).getSizeTv() + "\n" +"\t"+"\t"+"RESOLUTION " + ((TV)product).getResolutionTv() + "\n" +"\t"+"\t"+"PORTS " +((TV)product).getPortsTV() + "\n"  );
					}
					else if (product instanceof DVD){
						writer.write("\t"+"\t"+"CODE " + product.getCode() + "\n" +"\t"+"\t"+"ITEM_TYPE DVD"  + "\n" +"\t"+"\t"+"MODEL " + (product).getType() + "\n" +"\t"+"\t"+"MODEL_YEAR " + product.getYear() + "\n" +"\t"+"\t"+"MANUFACTURER " + product.getConstructor()  + "\n" +"\t"+"\t"+"PRICE " + product.getPrice() + "\n"  +"\t"+"\t"+"QUANTITY " +product.getQuantity() + "\n" +"\t"+"\t"+"DVD TYPE " + ((DVD)product).getTypeDVD() + "\n" +"\t"+"\t"+"RESOLUTION " + ((DVD)product).getResolutionDVD() + "\n" +"\t"+"\t"+"FORMAT " + ((DVD)product).getFormat() + "\n" );
						
					}
					else if (product instanceof DigCam){
						writer.write("\t"+"\t"+"CODE " + product.getCode() + "\n" +"\t"+"\t"+"ITEM_TYPE DigCam"  + "\n" +"\t"+"\t"+"MODEL " + (product).getType() + "\n" +"\t"+"\t"+"MODEL_YEAR " + product.getYear() + "\n" +"\t"+"\t"+"MANUFACTURER " + product.getConstructor()  + "\n" +"\t"+"\t"+"PRICE " + product.getPrice() + "\n"  +"\t"+"\t"+"QUANTITY " +product.getQuantity() + "\n" +"\t"+"\t"+"DCTYPE " + ((DigCam)product).getTypeDC() + "\n" +"\t"+"\t"+"MEGPIX " + ((DigCam)product).getMegpix() + "\n" +"\t"+"\t"+"OPZOOM " + ((DigCam)product).getOpzoom() + "\n" +  "\t"+"\t"+"DIGZOOM  " + ((DigCam)product).getDigzoom() + "\n"  +"\t"+"\t"+"SCRSIZE " +((DigCam)product).getScrsize() + "\n"  );
						
					}
					else if (product instanceof Console){
						writer.write("\t"+"\t"+"CODE " + product.getCode() + "\n" +"\t"+"\t"+"ITEM_TYPE Console"  + "\n" +"\t"+"\t"+"MODEL " + (product).getType() + "\n" +"\t"+"\t"+"MODEL_YEAR " + product.getYear() + "\n" +"\t"+"\t"+"MANUFACTURER " + product.getConstructor()  + "\n" +"\t"+"\t"+"PRICE " + product.getPrice() + "\n"  +"\t"+"\t"+"QUANTITY " +product.getQuantity() + "\n" +"\t"+"\t"+"CTYPE " + ((Gaming)product).getTypeG() + "\n" +"\t"+"\t"+"PROCESSOR " + ((Gaming)product).getProcessor() + "\n" +"\t"+"\t"+"GRAPHICS " + ((Gaming)product).getGraphics() + "\n" +  "\t"+"\t"+"SOUND  " + ((Gaming)product).getSound() + "\n"  +"\t"+"\t"+"CAPACITY  " +((Gaming)product).getCapacity() + "\n"  );
					}
					else if (product instanceof WirConsole){
						writer.write("\t"+"\t"+"CODE " + product.getCode() + "\n" +"\t"+"\t"+"ITEM_TYPE WirConsole "  + "\n" +"\t"+"\t"+"MODEL " + (product).getType() + "\n" +"\t"+"\t"+"MODEL_YEAR " + product.getYear() + "\n" +"\t"+"\t"+"MANUFACTURER " + product.getConstructor()  + "\n" +"\t"+"\t"+"PRICE " + product.getPrice() + "\n"  +"\t"+"\t"+"QUANTITY " +product.getQuantity() + "\n" +"\t"+"\t"+"WCTYPE " + ((Gaming)product).getTypeG() + "\n" +"\t"+"\t"+"PROCESSOR " + ((Gaming)product).getProcessor() + "\n" +"\t"+"\t"+"GRAPHICS " + ((Gaming)product).getGraphics() + "\n"+"\t" +  "\t"+"SOUND  " + ((Gaming)product).getSound() + "\n"  +"\t"+"\t"+"CAPACITY  " +((Gaming)product).getCapacity() + "\n" );
						
					}
					else if (product instanceof Fridge){
						writer.write("\t"+"\t"+"CODE " + product.getCode() + "\n" +"\t"+"\t"+"ITEM_TYPE Fridge"  + "\n" +"\t"+"\t"+"MODEL " + (product).getType() + "\n" +"\t"+"\t"+"MODEL_YEAR " + product.getYear() + "\n" +"\t"+"\t"+"MANUFACTURER " + product.getConstructor()  + "\n" +"\t"+"\t"+"PRICE " + product.getPrice() + "\n"  +"\t"+"\t"+"QUANTITY " +product.getQuantity() + "\n" +"\t"+"\t"+"ENERGY " + ((HomeAppliances)product).getEnergy() + "\n" +"\t"+"\t"+"CAPACITY " + ((HomeAppliances)product).getCapacity() + "\n" +"\t"+"\t"+"FTYPE " + ((Fridge)product).getTypeF() + "\n" + "\t"+ "\t"+"FREZZERSCAPACITY  " + ((Fridge)product).getFreezersCapacity() + "\n" );
						
					}
					else if (product instanceof WashingMachine){
						writer.write("\t"+"\t"+"CODE " + product.getCode() + "\n" +"\t"+"\t"+"ITEM_TYPE WashingMachine"  + "\n" +"\t"+"\t"+"MODEL " + (product).getType() + "\n" +"\t"+"\t"+"MODEL_YEAR " + product.getYear() + "\n" +"\t"+"\t"+"MANUFACTURER " + product.getConstructor()  + "\n" +"\t"+"\t"+"PRICE " + product.getPrice() + "\n"  +"\t"+"\t"+"QUANTITY " +product.getQuantity() + "\n" +"\t"+"\t"+"ENERGY " + ((HomeAppliances)product).getEnergy() + "\n" +"\t"+"\t"+"CAPACITY " + ((HomeAppliances)product).getCapacity() + "\n" +"\t"+"\t"+"FTYPE " + ((WashingMachine)product).getSpinSpeed() + "\n" );
						
					}
				writer.write("\t" + "}" + "\n");
			}
			writer.write("\n" + "}" + "\n");
		}catch (IOException e) {
			System.err.println("Write error!");
		}
			
			
		try{
			writer.close(); //Closes the stream, flushing it first.

		}
		catch (IOException e) {
			System.err.println("Error closing file.");
		}
	}

	
	//Returns the order which belongs to index i of the Arraylist
	public Order getOrder(int i){
		return orders.get(i);
		
	}
	
	//Adds an order to the ArrayList
	public void addOrder(Order neworder){
		orders.add(neworder);
	}

	//Searches the Arraylist to find if there is any order of the productName
	public void lookUp(String productName){
		for(int i=0; i<orders.size(); i++){
			if(orders.get(i).getdevName().equals(productName)){
				System.out.println(orders.get(i));
			}
		}
	}

	//Removes an order from the ArrayList
	public void remove(int code){
		for(int i=0; i<orders.size(); i++){
			if(orders.get(i).getCode()==code){
				orders.remove(i);
			}
		}
	}

	//Prints the ArayList's orders
	public void productList(){
		for(int i=0; i<orders.size(); i++){
			System.out.println(orders.get(i));
		}
	}
	
		//Reads the order’s characteristics
		public void loadFile(String data){
		int counter=0;
		int countermark=0;
		File f = null;
		BufferedReader reader = null;
		String line=" ";
		Appliances app=null;
		Appliances app1=null;
		Order ord=null;
		
		try{
			f=new File(data);
		}catch(NullPointerException e){
			System.err.println("Error opening file!");
		}
		
		try{
			reader=new BufferedReader(new FileReader(f));
		}catch(FileNotFoundException e){
			System.err.println("Error opening file!");
		}
		
		try{
			counter++;
			line = reader.readLine();
			while(line!=null){
				if(line.trim().toUpperCase().equals("ORDER_LIST")){
					counter++;
					line = reader.readLine();
					if(line.trim().equals("{")){
						counter++;
						line = reader.readLine();
						while(line!=null){
							if(line.trim().toUpperCase().equals("ORDER")){
								counter++;
								boolean field1=false;
								boolean field2=false;
								boolean field3=false;
								boolean field4=false;
								boolean codegiven=false;
								boolean sellcodegiven=false;
								boolean modelgiven=false;
								boolean namegiven=false;
								boolean phonegiven=false;
								line = reader.readLine();
								if(line.trim().equals("{")){
									countermark=counter;
									reader.mark(200000);
									
									do{
									counter++;
									line = reader.readLine();
									
									}while(!((line.trim().startsWith("ITEM_TYPE "))));
									
									app1=new TV(10,"TVdef",2016,"constructordef",2000,0,"LCD", "36 INCHES", "720 x 329", "1 HDMI, 2 DVI");
									ord=new Order(app1,"defcustomer",189,"4 July 2012","25 March 2015",app1.Discount());
									if(line.trim().substring(9).trim().toUpperCase().equals("TV")){
										app=new TV(10,"TVdef",2016,"constructordef",2000,4,"LCD", "36 INCHES", "720 x 329", "1 HDMI, 2 DVI");
										
										reader.reset();
										counter=countermark;
										line=reader.readLine();
										
										while(!(line.trim()).equals("}")){
											if(line.trim().toUpperCase().startsWith("ORDER_NUMBER ")){
												ord.setCode(Integer.parseInt(line.trim().substring(12).trim()));
												sellcodegiven=true;
											}else if (line.trim().toUpperCase().startsWith("NAME ")){
												ord.setCustomer(line.trim().substring(4).trim());
												namegiven=true;
											}else if(line.trim().toUpperCase().startsWith("PHONE ")){
												ord.setPhone(Long.parseLong(line.trim().substring(5).trim()));
												phonegiven=true;
											}else if(line.trim().toUpperCase().startsWith("ORDER_DATE ")){
												ord.setOrderMonth(line.trim().substring(10).trim());
												field1=true;
											}else if(line.trim().toUpperCase().startsWith("DELIVERY_DATE ")){
												ord.setArrivalMonth(line.trim().substring(13).trim());
												field2=true;
											}else if(line.trim().toUpperCase().startsWith("FINAL_COST ")){
												ord.setFinalCost(Double.parseDouble(line.trim().substring(10).trim()));
												field3=true;
										    }else if(line.trim().toUpperCase().startsWith("CODE ")){
												app.setCode(Integer.parseInt(line.trim().substring(4).trim()));
												codegiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL ")){
												app.setType(line.trim().substring(5).trim());
												modelgiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL_YEAR ")){
												app.setYear(Integer.parseInt(line.trim().substring(10).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("MANUFACTURER ")){
												app.setConstructor(line.trim().substring(12).trim());
												
											}else if(line.trim().toUpperCase().startsWith("PRICE ")){
												app.setPrice(Double.parseDouble(line.trim().substring(5).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("QUANTITY ")){
												app.setQuantity(Integer.parseInt(line.trim().substring(8).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("PANEL_TYPE ")){
												((TV) app).setTypeTv(line.trim().substring(10).trim());
												
											}else if(line.trim().toUpperCase().startsWith("INCHES ")){
												((TV) app).setSize(line.trim().substring(6).trim());
												
											}else if(line.trim().toUpperCase().startsWith("RESOLUTION ")){
												((TV) app).setResolutionTv(line.trim().substring(10).trim());
												
											}else if(line.trim().toUpperCase().startsWith("PORTS ")){
												((TV) app).setPortsTv(line.trim().substring(5).trim());
												
											}
											
											counter++;
											line=reader.readLine();
										}
										
										if(codegiven && modelgiven && sellcodegiven && field1 && field2 && field3 && namegiven && phonegiven){
											ord.setdevName(app);
											
											orders.add(ord);
											
										}
										
									}else if(line.trim().substring(9).trim().equals("DVD")){
										app=new DVD(20,"DVDdef",2016,"constructordef",100,2, "Blue ray", "500 x 625", "DVD-RW");
										reader.reset();
										counter=countermark;
										line=reader.readLine();
										
										
										while(!(line.trim()).equals("}")){
									
											if(line.trim().toUpperCase().startsWith("ORDER_NUMBER ")){
												ord.setCode(Integer.parseInt(line.trim().substring(12).trim()));
												sellcodegiven=true;
											}else if (line.trim().toUpperCase().startsWith("NAME ")){
												ord.setCustomer(line.trim().substring(4).trim());
												namegiven=true;
											}else if(line.trim().toUpperCase().startsWith("PHONE ")){
												ord.setPhone(Long.parseLong(line.trim().substring(5).trim()));
												phonegiven=true;
											}else if(line.trim().toUpperCase().startsWith("ORDER_DATE ")){
												ord.setOrderMonth(line.trim().substring(10).trim());
												field1=true;
											}else if(line.trim().toUpperCase().startsWith("DELIVERY_DATE ")){
												ord.setArrivalMonth(line.trim().substring(13).trim());
												field2=true;
											}else if(line.trim().toUpperCase().startsWith("FINAL_COST ")){
												ord.setFinalCost(Double.parseDouble(line.trim().substring(10).trim()));
												field3=true;
										    }else if(line.trim().toUpperCase().startsWith("CODE ")){
												app.setCode(Integer.parseInt(line.trim().substring(4).trim()));
												codegiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL ")){
												app.setType(line.trim().substring(5).trim());
												modelgiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL_YEAR ")){
												app.setYear(Integer.parseInt(line.trim().substring(10).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("MANUFACTURER ")){
												app.setConstructor(line.trim().substring(12).trim());
												
											}else if(line.trim().toUpperCase().startsWith("PRICE ")){
												app.setPrice(Double.parseDouble(line.trim().substring(5).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("QUANTITY ")){
												app.setQuantity(Integer.parseInt(line.trim().substring(8).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("DVDTYPE ")){
												((DVD) app).setTypeDVD(line.trim().substring(7).trim());
												
											}else if(line.trim().toUpperCase().startsWith("RESOLUTION ")){
												((DVD) app).setResolutionDVD(line.trim().substring(10).trim());
												
											}else if(line.trim().toUpperCase().startsWith("FORMAT ")){
												((DVD) app).setFormat(line.trim().substring(6).trim());
												
											}
											
											counter++;
											line=reader.readLine();
										}
										
										if(codegiven && modelgiven && sellcodegiven && field1 && field2 && field3 && namegiven && phonegiven){
											ord.setdevName(app);
											
											orders.add(ord);
										}
										
										
									}else if(line.trim().substring(9).trim().toUpperCase().equals("DigCam")){
										app=new DigCam(30,"DigCamdef",2016,"constructordef",500,7, "DLSR", "24 MGP", "x32", "x64", "2.5 inches");
										reader.reset();
										counter=countermark;
										line=reader.readLine();
										
										
										while(!(line.trim()).equals("}")){
										
									
											if(line.trim().toUpperCase().startsWith("ORDER_NUMBER ")){
												ord.setCode(Integer.parseInt(line.trim().substring(12).trim()));
												sellcodegiven=true;
											}else if (line.trim().toUpperCase().startsWith("NAME ")){
												ord.setCustomer(line.trim().substring(4).trim());
												namegiven=true;
											}else if(line.trim().toUpperCase().startsWith("PHONE ")){
												ord.setPhone(Long.parseLong(line.trim().substring(5).trim()));
												phonegiven=true;
											}else if(line.trim().toUpperCase().startsWith("ORDER_DATE ")){
												ord.setOrderMonth(line.trim().substring(10).trim());
												field1=true;
											}else if(line.trim().toUpperCase().startsWith("DELIVERY_DATE ")){
												ord.setArrivalMonth(line.trim().substring(13).trim());
												field2=true;
											}else if(line.trim().toUpperCase().startsWith("FINAL_COST ")){
												ord.setFinalCost(Double.parseDouble(line.trim().substring(10).trim()));
												field3=true;
										    }else if(line.trim().toUpperCase().startsWith("CODE ")){
												app.setCode(Integer.parseInt(line.trim().substring(4).trim()));
												codegiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL ")){
												app.setType(line.trim().substring(5).trim());
												modelgiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL_YEAR ")){
												app.setYear(Integer.parseInt(line.trim().substring(10).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("MANUFACTURER ")){
												app.setConstructor(line.trim().substring(12).trim());
												
											}else if(line.trim().toUpperCase().startsWith("PRICE ")){
												app.setPrice(Double.parseDouble(line.trim().substring(5).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("QUANTITY ")){
												app.setQuantity(Integer.parseInt(line.trim().substring(8).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("DCTYPE ")){
												((DigCam) app).setTypeDC(line.trim().substring(6).trim());
												
											}else if(line.trim().toUpperCase().startsWith("MEGPIX ")){
												((DigCam) app).setMegpix(line.trim().substring(6).trim());
												
											}else if(line.trim().toUpperCase().startsWith("OPZOOM ")){
												((DigCam) app).setOpzoom(line.trim().substring(6).trim());
												
											}else if(line.trim().toUpperCase().startsWith("DIGZOOM ")){
												((DigCam) app).setDigzoom(line.trim().substring(7).trim());
												
											}else if(line.trim().toUpperCase().startsWith("SCRSIZE ")){
												((DigCam) app).setScrsize(line.trim().substring(7).trim());
												
											}
											
											counter++;
											line=reader.readLine();
										}
										
										if(codegiven && modelgiven && sellcodegiven && field1 && field2 && field3 && namegiven && phonegiven){
											ord.setdevName(app);
											
											orders.add(ord);
										}
										
										
									}else if(line.trim().substring(9).trim().toUpperCase().equals("Console")){
										app=new Console(40,"Consoledef",2016,"constructordef",180,10,"PS4", "INTEL i7", "philips", "Sony", "70 GB");
										reader.reset();
										counter=countermark;
										line=reader.readLine();
										
										
										while(!(line.trim()).equals("}")){
										
									
											if(line.trim().toUpperCase().startsWith("ORDER_NUMBER ")){
												ord.setCode(Integer.parseInt(line.trim().substring(12).trim()));
												sellcodegiven=true;
											}else if (line.trim().toUpperCase().startsWith("NAME ")){
												ord.setCustomer(line.trim().substring(4).trim());
												namegiven=true;
											}else if(line.trim().toUpperCase().startsWith("PHONE ")){
												ord.setPhone(Long.parseLong(line.trim().substring(5).trim()));
												phonegiven=true;
											}else if(line.trim().toUpperCase().startsWith("ORDER_DATE ")){
												ord.setOrderMonth(line.trim().substring(10).trim());
												field1=true;
											}else if(line.trim().toUpperCase().startsWith("DELIVERY_DATE ")){
												ord.setArrivalMonth(line.trim().substring(13).trim());
												field2=true;
											}else if(line.trim().toUpperCase().startsWith("FINAL_COST ")){
												ord.setFinalCost(Double.parseDouble(line.trim().substring(10).trim()));
												field3=true;
										    }else if(line.trim().toUpperCase().startsWith("CODE ")){
												app.setCode(Integer.parseInt(line.trim().substring(4).trim()));
												codegiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL ")){
												app.setType(line.trim().substring(5).trim());
												modelgiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL_YEAR ")){
												app.setYear(Integer.parseInt(line.trim().substring(10).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("MANUFACTURER ")){
												app.setConstructor(line.trim().substring(12).trim());
												
											}else if(line.trim().toUpperCase().startsWith("PRICE ")){
												app.setPrice(Double.parseDouble(line.trim().substring(5).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("QUANTITY ")){
												app.setQuantity(Integer.parseInt(line.trim().substring(8).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("CTYPE ")){
												((Gaming) app).setTypeG(line.trim().substring(5).trim());
												
											}else if(line.trim().toUpperCase().startsWith("PROCESSOR ")){
												((Gaming) app).setProcessor(line.trim().substring(9).trim());
												
											}else if(line.trim().toUpperCase().startsWith("GRAPHICS ")){
												((Gaming) app).setGraphics(line.trim().substring(8).trim());
												
											}else if(line.trim().toUpperCase().startsWith("SOUND ")){
												((Gaming) app).setSound(line.trim().substring(5).trim());
												
											}else if(line.trim().toUpperCase().startsWith("CAPACITY ")){
												((Gaming) app).setCapacity(line.trim().substring(8).trim());
												
											}
											
											counter++;
											line=reader.readLine();
										}
										
										if(codegiven && modelgiven && sellcodegiven && field1 && field2 && field3 && namegiven && phonegiven){
											ord.setdevName(app);
											
											orders.add(ord);
										}
										
										
									}else if(line.trim().substring(9).trim().equals("WirConsole")){
										app=new WirConsole(50,"WirConsoledef",2016,"constructordef",220,14,"Xbox","quantoum","nvidia","logitech","7 GB");
										reader.reset();
										counter=countermark;
										line=reader.readLine();
										
										
										while(!(line.trim()).equals("}")){
										
									
											if(line.trim().toUpperCase().startsWith("ORDER_NUMBER ")){
												ord.setCode(Integer.parseInt(line.trim().substring(12).trim()));
												sellcodegiven=true;
											}else if (line.trim().toUpperCase().startsWith("NAME ")){
												ord.setCustomer(line.trim().substring(4).trim());
												namegiven=true;
											}else if(line.trim().toUpperCase().startsWith("PHONE ")){
												ord.setPhone(Long.parseLong(line.trim().substring(5).trim()));
												phonegiven=true;
											}else if(line.trim().toUpperCase().startsWith("ORDER_DATE ")){
												ord.setOrderMonth(line.trim().substring(10).trim());
												field1=true;
											}else if(line.trim().toUpperCase().startsWith("DELIVERY_DATE ")){
												ord.setArrivalMonth(line.trim().substring(13).trim());
												field2=true;
											}else if(line.trim().toUpperCase().startsWith("FINAL_COST ")){
												ord.setFinalCost(Double.parseDouble(line.trim().substring(10).trim()));
												field3=true;
										    }else if(line.trim().toUpperCase().startsWith("CODE ")){
												app.setCode(Integer.parseInt(line.trim().substring(4).trim()));
												codegiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL ")){
												app.setType(line.trim().substring(5).trim());
												modelgiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL_YEAR ")){
												app.setYear(Integer.parseInt(line.trim().substring(10).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("MANUFACTURER ")){
												app.setConstructor(line.trim().substring(12).trim());
												
											}else if(line.trim().toUpperCase().startsWith("PRICE ")){
												app.setPrice(Double.parseDouble(line.trim().substring(5).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("QUANTITY ")){
												app.setQuantity(Integer.parseInt(line.trim().substring(8).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("WCTYPE ")){
												((Gaming) app).setTypeG(line.trim().substring(6).trim());
												
											}else if(line.trim().toUpperCase().startsWith("PROCESSOR ")){
												((Gaming) app).setProcessor(line.trim().substring(9).trim());
												
											}else if(line.trim().toUpperCase().startsWith("GRAPHICS ")){
												((Gaming) app).setGraphics(line.trim().substring(8).trim());
												
											}else if(line.trim().toUpperCase().startsWith("SOUND ")){
												((Gaming) app).setSound(line.trim().substring(5).trim());
												
											}else if(line.trim().toUpperCase().startsWith("CAPACITY ")){
												((Gaming) app).setCapacity(line.trim().substring(8).trim());
												
											}
											
											counter++;
											line=reader.readLine();
										}
										
										if(codegiven && modelgiven && sellcodegiven && field1 && field2 && field3 && namegiven && phonegiven){
											ord.setdevName(app);
											
											orders.add(ord);
										}
										
										
									}else if(line.trim().substring(9).trim().equals("Fridge")){
										app=new Fridge(60,"Fridgedef",2016,"constructordef",530,20,"E",7,"one door",1);
										reader.reset();
										counter=countermark;
										line=reader.readLine();
										
										
										while(!(line.trim()).equals("}")){
										
									
											if(line.trim().toUpperCase().startsWith("ORDER_NUMBER ")){
												ord.setCode(Integer.parseInt(line.trim().substring(12).trim()));
												sellcodegiven=true;
											}else if (line.trim().toUpperCase().startsWith("NAME ")){
												ord.setCustomer(line.trim().substring(4).trim());
												namegiven=true;
											}else if(line.trim().toUpperCase().startsWith("PHONE ")){
												ord.setPhone(Long.parseLong(line.trim().substring(5).trim()));
												phonegiven=true;
											}else if(line.trim().toUpperCase().startsWith("ORDER_DATE ")){
												ord.setOrderMonth(line.trim().substring(10).trim());
												field1=true;
											}else if(line.trim().toUpperCase().startsWith("DELIVERY_DATE ")){
												ord.setArrivalMonth(line.trim().substring(13).trim());
												field2=true;
											}else if(line.trim().toUpperCase().startsWith("FINAL_COST ")){
												ord.setFinalCost(Double.parseDouble(line.trim().substring(10).trim()));
												field3=true;
										    }else if(line.trim().toUpperCase().startsWith("CODE ")){
												app.setCode(Integer.parseInt(line.trim().substring(4).trim()));
												codegiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL ")){
												app.setType(line.trim().substring(5).trim());
												modelgiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL_YEAR ")){
												app.setYear(Integer.parseInt(line.trim().substring(10).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("MANUFACTURER ")){
												app.setConstructor(line.trim().substring(12).trim());
												
											}else if(line.trim().toUpperCase().startsWith("PRICE ")){
												app.setPrice(Double.parseDouble(line.trim().substring(5).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("QUANTITY ")){
												app.setQuantity(Integer.parseInt(line.trim().substring(8).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("CAPACITY ")){
												((HomeAppliances) app).setCapacity(Double.parseDouble(line.trim().substring(8).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("ENERGY ")){
												((HomeAppliances) app).setEnergy(line.trim().substring(6).trim());
												
											}else if(line.trim().toUpperCase().startsWith("FTYPE ")){
												((Fridge) app).setTypeF(line.trim().substring(5).trim());
												
											}else if(line.trim().toUpperCase().startsWith("FREZZERSCAPACITY ")){
												((Fridge) app).setFreezersCapacity(Double.parseDouble(line.trim().substring(16).trim()));
												
											}
											
											counter++;
											line=reader.readLine();
										}
										
										if(codegiven && modelgiven && sellcodegiven && field1 && field2 && field3 && namegiven && phonegiven){
											ord.setdevName(app);
											
											orders.add(ord);
										}
										
										
										
									}else if(line.trim().substring(9).trim().equals("WashingMachine")){
										app=new WashingMachine(70,"WashingMachinedef",2016,"constructordef",750,13,"B",10,1100);
										reader.reset();
										counter=countermark;
										line=reader.readLine();
										
										
										while(!(line.trim()).equals("}")){
										
									
											if(line.trim().toUpperCase().startsWith("ORDER_NUMBER ")){
												ord.setCode(Integer.parseInt(line.trim().substring(12).trim()));
												sellcodegiven=true;
											}else if (line.trim().toUpperCase().startsWith("NAME ")){
												ord.setCustomer(line.trim().substring(4).trim());
												namegiven=true;
											}else if(line.trim().toUpperCase().startsWith("PHONE ")){
												ord.setPhone(Long.parseLong(line.trim().substring(5).trim()));
												phonegiven=true;
											}else if(line.trim().toUpperCase().startsWith("ORDER_DATE ")){
												ord.setOrderMonth(line.trim().substring(10).trim());
												field1=true;
											}else if(line.trim().toUpperCase().startsWith("DELIVERY_DATE ")){
												ord.setArrivalMonth(line.trim().substring(13).trim());
												field2=true;
											}else if(line.trim().toUpperCase().startsWith("FINAL_COST ")){
												ord.setFinalCost(Double.parseDouble(line.trim().substring(10).trim()));
												field3=true;
										    }else if(line.trim().toUpperCase().startsWith("CODE ")){
												app.setCode(Integer.parseInt(line.trim().substring(4).trim()));
												codegiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL ")){
												app.setType(line.trim().substring(5).trim());
												modelgiven=true;
												
											}else if(line.trim().toUpperCase().startsWith("MODEL_YEAR ")){
												app.setYear(Integer.parseInt(line.trim().substring(10).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("MANUFACTURER ")){
												app.setConstructor(line.trim().substring(12).trim());
												
											}else if(line.trim().toUpperCase().startsWith("PRICE ")){
												app.setPrice(Double.parseDouble(line.trim().substring(5).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("QUANTITY ")){
												app.setQuantity(Integer.parseInt(line.trim().substring(8).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("CAPACITY ")){
												((HomeAppliances) app).setCapacity(Double.parseDouble(line.trim().substring(8).trim()));
												
											}else if(line.trim().toUpperCase().startsWith("ENERGY ")){
												((HomeAppliances) app).setEnergy(line.trim().substring(6).trim());
												
											}else if(line.trim().toUpperCase().startsWith("SPINSPEED ")){
												((WashingMachine) app).setSpinSpeed(Integer.parseInt(line.trim().substring(9).trim()));
												
											}
											
											counter++;
											line=reader.readLine();
										}
										
										if(codegiven && modelgiven && sellcodegiven && field1 && field2 && field3 && namegiven && phonegiven){
											ord.setdevName(app);
											
											orders.add(ord);
										}
										
									}
									
								}
							}
							counter++;
							line=reader.readLine();
							
						}
					}
				}
			}
		}catch(IOException e) {
			System.out.println("Error reading line " + counter + ".");
		}
	}
	
}//end of class orderbook