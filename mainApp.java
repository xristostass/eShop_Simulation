//3150170 CHRISTOS TASIOPOULOS
//3150148 MICHAIL ROUSSOS
//3150037 ALEXANDROS DOUKAS
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTabbedPane;
import javax.swing.JFrame;

public class mainApp extends JFrame implements ActionListener, MouseListener{
		
		static int j;
		static ArrayList <Appliances> choises = new ArrayList <Appliances>();
		ImageIcon Appl;
		static ArrayList <ImageIcon> pics = new ArrayList <ImageIcon>();
		
		
			
		static int n1;
		static int n2;
		static long n3;
		static int n4;
		static int n5;
		static double d1;
		static Scanner input = new Scanner(System.in);
		static Scanner in = new Scanner(System.in);
		static boolean flag;
	    
		/*JButton jb;
		JButton jb1;*/
		static String st1;
		static String st2;
		static String st3;
		
		static Appliances ap1;
		static Appliances app2;
		
		static sellbook sb = new sellbook();
		static orderBook ob = new orderBook();
		
		static AvProductsBook avb = new AvProductsBook();
		static String cstr;
		static String t1;
		static int n13;

		static ActionEvent event;
		
		private JLabel label;
		private ImageIcon imIco1;
		
		
	
		public void mouseClicked(MouseEvent event) {}
		public void mouseExited(MouseEvent event){}
		public void mouseEntered(MouseEvent event){}
		public void mouseReleased(MouseEvent event){}
		public void mousePressed(MouseEvent event){}
		JButton SORD;
		JButton SORD1;
		JButton SORD2;
		JButton ordsearch;
		JButton returnord;
		JButton Arrival;
		JButton sellsearch;
		JButton returnsale;
		JList OrderList;
		JList TypeList;
		JList ChoisesL;
		static JList ApL;
		JList SellList;
		static DefaultListModel OrderlistModel;
		static DefaultListModel SelllistModel;
		static DefaultListModel TypelistModel;
		static DefaultListModel ChoiseslistModel;
		static DefaultListModel AplistModel;
		String name;
		boolean namesearched=false;
		
		static int index;
		static int index1;
		static int index2;
		static JOptionPane ViewAp;
		
		
		
	public mainApp(){
		
		
		
		Appl = new ImageIcon(getClass().getResource( "Images/TV1.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/TV2.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/DVD1.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/DVD2.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/DigCam1.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/DigCam2.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/Console1.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/Console2.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/WirConsole1.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/WirConsole2.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/Fridge1.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/Fridge2.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/WashingMachine1.jpg" ));
		pics.add(Appl);
		Appl = new ImageIcon(getClass().getResource( "Images/WashingMachine2.jpg" ));
		pics.add(Appl);
		
		
		
		// Creates aJTabbed Frame. It's title is eshop.It is the main window.
		JTabbedPane tabs = new JTabbedPane();
		JFrame tabsFrame = new JFrame();		
		
		tabsFrame.add(tabs);
		tabsFrame.setTitle("E-Shop");
		tabsFrame.setBounds(100,100,800,500);
		tabsFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		tabsFrame.setVisible(true);
		
		
		
		//Creates a Jpanel that contains the available product list.
		JPanel Av = new JPanel();
		tabs.addTab("Available Products" , Av);
		

		TypelistModel=new DefaultListModel();
		ChoiseslistModel=new DefaultListModel();
		AplistModel=new DefaultListModel();
		TypeList=new JList(TypelistModel);
		ChoisesL=new JList(ChoiseslistModel);
		ApL=new JList(AplistModel);
		
		
		
		Av.setLayout(new BorderLayout());
		
		SORD = new JButton("Update Database");
		SORD.addActionListener(this);
		
		//The App's toolbar.
		JToolBar bar = new JToolBar();
		bar.add(SORD);
		Av.add(bar,"North");
		TypelistModel.addElement("Picture And Sound");
		TypelistModel.addElement("Gaming");
		TypelistModel.addElement("Home Appliances");		
		
		JPanel typepanel = new JPanel();
		JScrollPane listScrollerTY = new JScrollPane(TypeList);
		listScrollerTY.setPreferredSize(new Dimension(Av.getWidth()/4, Av.getHeight()));
		typepanel.add(listScrollerTY);
		
		//Checks if a type(ex picture sound) got clicked 2ice. If true the program shows the sub categories.
		MouseListener mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					index = TypeList.locationToIndex(e.getPoint());
					if(index==0){
						ChoiseslistModel.clear();
						ChoiseslistModel.addElement("TV");
						ChoiseslistModel.addElement("DVD");
						ChoiseslistModel.addElement("Digital Camera");
					}
					else if(index==1){
						ChoiseslistModel.clear();
						ChoiseslistModel.addElement("Console");
						ChoiseslistModel.addElement("Wireless Console");
					}else if(index==2){
						ChoiseslistModel.clear();
						ChoiseslistModel.addElement("Fridge");
						ChoiseslistModel.addElement("Washing Mashine");
					}
					
					
					//System.out.println("Double clicked on Item " + index);
				}
			}
		};
		
		TypeList.addMouseListener(mouseListener);
		
	    //Prints the products of the given type
		MouseListener mouseListener1 = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					index1 = ChoisesL.locationToIndex(e.getPoint());
					if(index==0){
						if(index1==0) {
							chooseCase(1);
							AplistModel.clear();
							for(Appliances ap20 : choises){
								AplistModel.addElement(ap20.toString());
							}
						}
						else if (index1==1){ 
							chooseCase(2);
							AplistModel.clear();
							for(Appliances ap20 : choises){
								AplistModel.addElement(ap20.toString());
							}
						}
						else if (index1==2) {
							chooseCase(3);
							AplistModel.clear();
							for(Appliances ap20 : choises){
								AplistModel.addElement(ap20.toString());
							}
						}
					}
					else if(index==1){
						if(index1==0) {
							chooseCase(4);
							AplistModel.clear();
							for(Appliances ap20 : choises){
								AplistModel.addElement(ap20.toString());
							}
						}
						else if (index1==1) {
							chooseCase(5);
							AplistModel.clear();
							for(Appliances ap20 : choises){
								AplistModel.addElement(ap20.toString());
							}
						}
						
					}else if(index==2){
						if(index1==0) {
							chooseCase(6);
							AplistModel.clear();
							for(Appliances ap20 : choises){
								AplistModel.addElement(ap20.toString());
							}
						}
						else if (index1==1) {
							chooseCase(7);
							AplistModel.clear();
							for(Appliances ap20 : choises){
								AplistModel.addElement(ap20.toString());
							}
						}
					}
				}
			}
		};
		
		ChoisesL.addMouseListener(mouseListener1);
		
		
		
		
		
		//Prints a message asking a user if he wants to sell the given product
		MouseListener mouseListener2 = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					index2 = TypeList.locationToIndex(e.getPoint());
					int n=0 ;
					if(index2==0){
						n = JOptionPane.showConfirmDialog(null,choises.get(index2).toString(),"Do you wish to buy the product "+choises.get(index2).getType()+"?",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,pics.get(avb.lookUp((choises.get(index2)).getType())));
						
						
					}
					else if(index2==1){
						n = JOptionPane.showConfirmDialog(null,choises.get(index2).toString(),"Do you wish to buy the product "+choises.get(index2).getType()+"?",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,pics.get(avb.lookUp((choises.get(index2)).getType())));
						
					}
					if(n==0){
						sell_order(choises.get(index2));
						}
					
				}
			}
		};
		
		ApL.addMouseListener(mouseListener2);
		
		
		
		
		JPanel choisespanel = new JPanel();
		JScrollPane listScrollerCH = new JScrollPane(ChoisesL);
		listScrollerCH.setPreferredSize(new Dimension(Av.getWidth()/3, Av.getHeight()));
		choisespanel.add(listScrollerCH);
		
		JPanel appanel =new JPanel();
		JScrollPane listScrollerAP = new JScrollPane(ApL);
		listScrollerAP.setPreferredSize(new Dimension(Av.getWidth()/4, Av.getHeight()));
		appanel.add(listScrollerAP);
		
		Av.add(typepanel,"West");
		Av.add(choisespanel,"Center");
		Av.add(appanel,"East");
		
		OrderlistModel=new DefaultListModel();
		OrderList=new JList(OrderlistModel);
		OrderList.setSelectedIndex(0);
		
		Arrival = new JButton("Arrival?");
		Arrival.addActionListener(this);
	    ordsearch = new JButton("Search an Order: ");
		ordsearch.addActionListener(this);
		returnord = new JButton("Back to Orders");
		returnord.addActionListener(this);
		
		JToolBar bar1 = new JToolBar();
		
		SORD1 = new JButton("Update Database");
		SORD1.addActionListener(this);
		bar1.add(Arrival);
		bar1.add(ordsearch);
		bar1.add(returnord);
		bar1.add(SORD1);
		
		JPanel Ord = new JPanel();
		Ord.setLayout(new BorderLayout());
		
		tabs.addTab("Orders" , Ord);
		Ord.add("North",bar1);
		for(int i=0; i<ob.size(); i++){
			
			OrderlistModel.addElement((ob.getOrder(i)).toString());
			
		}
		
		JScrollPane listScrollerOB = new JScrollPane(OrderList);
		listScrollerOB.setPreferredSize(new Dimension(400, 400));
		Ord.add(listScrollerOB);
		
		
		
		SelllistModel=new DefaultListModel();
		SellList=new JList(SelllistModel);
		
		sellsearch = new JButton("Search a sale: ");
		sellsearch.addActionListener(this);
		returnsale = new JButton("Back to Sales");
		returnsale.addActionListener(this);
		
		JToolBar bar2 = new JToolBar();
		
		SORD2 = new JButton("Update Database");
		SORD2.addActionListener(this);
		bar2.add(sellsearch);
		bar2.add(returnsale);
		bar2.add(SORD2);
		
		JPanel SL = new JPanel();
		SL.setLayout(new BorderLayout());
		
		tabs.addTab("Sales" , SL);
		SL.add("North",bar2);
		for(int i=0; i<sb.size(); i++){
			
			SelllistModel.addElement((sb.getSell(i)).toString());
			
		}
		JScrollPane listScrollerSL = new JScrollPane(SellList);
		listScrollerSL.setPreferredSize(new Dimension(400, 400));
		SL.add("South",listScrollerSL);
		
		
		pack();
	}
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == returnord){
			namesearched=false;
			name="";
			OrderlistModel.clear();
			for(int i=0; i<ob.size(); i++){
				OrderlistModel.addElement((ob.getOrder(i)).toString());
			
			}
		}
		else if(e.getSource() == returnsale){
			SelllistModel.clear();
			for(int i=0; i<sb.size(); i++){
			
				SelllistModel.addElement((sb.getSell(i)).toString());
			
			}
		}
		else if(e.getSource() == sellsearch){
			int i=0;
			SelllistModel.clear();
			String name = (String)JOptionPane.showInputDialog(this, "Please type the client's name: ");
			for(Sell sale:sb.Sellsearch(name)){
				SelllistModel.addElement((sb.Sellsearch(name).get(i)).toString());
				i++;

			}
		}
		else if(e.getSource() == ordsearch) {
			int i=0;
			namesearched=true;
			OrderlistModel.clear();
			name = (String)JOptionPane.showInputDialog(this, "Please type the client's name: ");
			for(Order order: ob.Ordsearch(name)){
				OrderlistModel.addElement((ob.Ordsearch(name).get(i)).toString());
				i++;

			}
		}
		else if (e.getSource()==Arrival){
			//System.out.println("YOL1O");
			int i=OrderList.getSelectedIndex();
			//System.out.println(i+"    "+namesearched);
			if ((namesearched==true)&&(name!=null)){
				//System.out.println("YOLO");
				ob.Ordsearch(name).get(i).setorderStatus();
				Sell s1 = new Sell(ob.Ordsearch(name).get(i).getdevName(),ob.Ordsearch(name).get(i).getCustomer(),ob.Ordsearch(name).get(i).getPhone(),  ob.Ordsearch(name).get(i).getOrderMonth(), ob.Ordsearch(name).get(i).getdevName().getPrice());
				sb.addSale(s1);
				ob.remove(ob.Ordsearch(name).get(i).getCode());
				OrderlistModel.clear();
				for(Order order: ob.Ordsearch(name)){
					OrderlistModel.addElement((ob.Ordsearch(name).get(i)).toString());
					i++;

				}
				SelllistModel.addElement(s1.toString());
				
			}
			else if (namesearched==false){
				//System.out.println("yolo");
				ob.getOrder(i).setorderStatus();
				Sell s1 = new Sell(ob.getOrder(i).getdevName(),ob.getOrder(i).getCustomer(),ob.getOrder(i).getPhone(),  ob.getOrder(i).getOrderMonth(), ob.getOrder(i).getdevName().getPrice());
				sb.addSale(s1);
				ob.remove(ob.getOrder(i).getCode());
				name="";
				OrderlistModel.clear();
				for(int j=0; j<ob.size(); j++){
					OrderlistModel.addElement((ob.getOrder(j)).toString());
			
				}
				SelllistModel.addElement(s1.toString());
				
			}
			else if(e.getSource()==SORD|| e.getSource()==SORD1 || e.getSource()==SORD2){
				avb.writeFile("Available.txt");
				sb.writeSold("Sales.txt");
				ob.writeOrder("OrdersF.txt");
				
			}
			
			avb.writeFile("Available.txt");
			sb.writeSold("Sales.txt");
			ob.writeOrder("OrdersF.txt");
			
		}
			
			
	}
	
	
		
	public static void main(String[] args){
		
		avb.loadFile("Available.txt");
		ob.loadFile("OrdersF.txt");
		sb.loadFile("Sales.txt");	
		equalsAp();
		
		
		mainApp lol = new mainApp();
		
	
	}
	
	//Viewing the availabble appliances the user can choose if he wants to sell an appliance. This method sells an appliance if it's quantity > 0, eitherwise it orders it
	public static void sell_order(Appliances ap1){
		n5 = ap1.getQuantity(); 
		boolean field1=false;
		boolean field2=false;
		boolean field3=false;
		boolean field4=false;
		String nullcheck;
		if (n5 > 0)  { 	//If quantity > 0 method asks for clients' name,phone etc
			//System.out.println("Give me the client's name");
			st1 = (String)JOptionPane.showInputDialog( "Give me the client's name");
			if (st1!=null){field1=true;}
			//System.out.println("Give me the client's phone");
			nullcheck=(String)JOptionPane.showInputDialog( "Give me the client's phone");
			if(nullcheck != null){field2=true;}
			//System.out.println(n3);
			st3 = (String)JOptionPane.showInputDialog( "Give me the date that the appliance was sold");
			if(st3!=null){
				field3=true;
				n3 = Long.parseLong(nullcheck);
			}
			if (field1&&field2&&field3){
				ap1.setQuantity(n5-1);
				Sell s1 = new Sell(ap1, st1, n3, st3, ap1.Discount());
				sb.addSale(s1);
				JOptionPane.showMessageDialog(null,"Sold.Final cost "+s1.getFinalCost());
			}
		}
		else if(n5 == 0){ //If quantity < 0 the method asks while the appliance would be orderd or not. If yew, the method asks for client's name, phone etc
			//System.out.println("There are no available " + ap1.getType() + ". To order just"); 
			//System.out.println("Give the client's name");
			JOptionPane.showMessageDialog(null,"There are no available " + ap1.getType() + ". Proceed with an order.");
			st1 = (String)JOptionPane.showInputDialog( "Give me the client's name");
			if(st1 !=null){field1=true;}
			//System.out.println("Give me the client's phone");
			nullcheck=(String)JOptionPane.showInputDialog( "Give me the client's phone");			
			if(nullcheck != null){
				field2=true;
				n3 = Long.parseLong(nullcheck);
			}
			//System.out.println("Give me the date that the appliance was ordered");
			st3 = (String)JOptionPane.showInputDialog( "Give me the date that the appliance was ordered");
			if(st3 !=null){field3=true;}
			//System.out.println("Give me the date that the appliance will arrive");
			st2 = (String)JOptionPane.showInputDialog( "Give me the date that the appliance will arrive");
			if(st3!=null){field4=true;}
			if(field1 && field2 && field3 && field4){
				Order o1 = new Order(ap1, st1, n3, st3, st2,ap1.Discount());
				ob.addOrder(o1);
				JOptionPane.showMessageDialog(null,"Ordered.Final cost "+o1.getFinalCost());
			}
		}//end of method sell_order
			AplistModel.clear();
			for(Appliances ap20 : choises){
				AplistModel.addElement(ap20.toString());
			}
			
			OrderlistModel.clear();
			for(int j=0; j<ob.size(); j++){
				OrderlistModel.addElement((ob.getOrder(j)).toString());
			
			}
			
			SelllistModel.clear();
			for(int i=0; i<sb.size(); i++){
			
				SelllistModel.addElement((sb.getSell(i)).toString());
			
			}
			
				
			avb.writeFile("Available.txt");
			sb.writeSold("Sales.txt");
			ob.writeOrder("OrdersF.txt");
	
		
		
	}
	
	//To understand abort's usage view first select method
	public static void abort(){
		while(true){
			//System.out.println("Choose an Appliance");
			n1 = ApL.getSelectedIndex();
			if (n1>=0 && n1<choises.size()){
				break;
			}
		}
		System.out.println("You have chosen "+choises.get(n1-1));
		ap1 = choises.get(n1-1);
									
		System.out.println("PRESS 1 TO SELL THE PRODUCT \n PRESS ANY OTHER NUMBER TO ABORT");
		n1 = input.nextInt();
		if (n1 == 1){
			sell_order(ap1);
		}
							
										
									
	}
	
	//Sets the t1 according to the user's chose. If the user wants to view fridge, abort method sets t1 = "Fridge"
	public static void 	what(int n1111){
		n13 = n1111;
		switch(n13){
			case 1: t1 = "TV"; break;
			case 2: t1 = "DVD"; break;
			case 3: t1 = "DigCam"; break;
			case 4: t1 = "Console"; break;
			case 5: t1 = "WirConsole"; break;
			case 6: t1 = "Fridge"; break;
			case 7: t1 = "WashingMachine"; break;
		} 
	}
	
	//Checks if the appliances that we have ordered/sold exists in available products.
	public static void equalsAp(){
		boolean comspec;
		Order ord=null;
		Sell sl=null;
		Appliances app1;
		int ordnum=ob.size();
		int slnum=sb.size();
		int j=0;
		int k=0;
		int removed=0;
		
		while(j<ordnum){
				ord=ob.getOrder(j);
				ord.setCode(ord.getCode()-removed);
				app2=ord.getdevName();
				comspec=false;
				for(int i=0;i<avb.size();i++){
				app1=avb.get(i);
				if((app1.getClass().toString()).equals(app2.getClass().toString())){
					cstr=app1.getClass().toString();
					
					
					switch(cstr){
						case "class TV": 
							
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
						
							break;
						case "class DVD": 
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
														
							break;
						case "class DigCam": 
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
							
							
							break;
						case "class Console": 
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
							
							break;
						case "class WirConsole": 
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
							
							
							break;
						case "class Fridge":
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
							
							break;
						case "class WashingMachine":
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
							
							break;
						default:
							ob.remove(ord.getCode());
							break;
					}
				}
			}
			if(comspec==false){
				ob.remove(ord.getCode());
				j--;
				ordnum--;
				removed++;
				ord.setCode1(ord.getCode1()-1);
			}
			j++;
		}
	
		removed=0;
		while(k<slnum){
				sl=sb.getSell(k);
				app2=sl.getdevName();
				sl.setCode(sl.getCode()-removed);
				comspec=false;
				for(int i=0;i<avb.size();i++){
				app1=avb.get(i);
				if((app1.getClass().toString()).equals(app2.getClass().toString())){
					cstr=app1.getClass().toString();
					
					switch(cstr){
						case "class TV": 
							
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
						
							break;
						case "class DVD": 
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
														
							break;
						case "class DigCam": 
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
							
							
							break;
						case "class Console": 
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
							
							break;
						case "class WirConsole": 
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
							
							
							break;
						case "class Fridge":
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
							
							break;
						case "class WashingMachine":
							if(app1.toString().equals(app2.toString())){
								comspec=true;
							}
							
							break;
						default:
							comspec=true;
							break;
					}
				}
			}
			if(comspec==false){
				sb.remove(sl.getName());
				k--;
				slnum--;
				removed++;
				sl.setCode1(sl.getCode1()-1);
			}
		k++;
		}
		
	}
	
	public static void select() {
		choises.clear();
		j=0;
									
		what(n13); //Prints the products of a specifiq type(ex Consoles), that user chose
		for(int i=0; i< avb.size(); i++){       
			if(avb.get(i).getClass().getName().equals(t1)) {
				j++;
				choises.add(avb.get(i));
				//System.out.println(j+ "."+ avb.get(i));
			}
		}
	}
	
	//Calls select and abort method after setting n13 = n17
	public static void chooseCase(int n17){
		n13 = n17;
		select();
		//abort();
	}
	
}// end of classmainApp