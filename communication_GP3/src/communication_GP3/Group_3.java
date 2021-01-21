package communication_GP3;
import java.util.*;
public class Group_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Introduction of the details of our store
		System.out.println("    COMMUNICATION STORE,SINTOK,KEDAH    ");
		System.out.println("            Tel : 0124907822            ");
		System.out.println("            Store ID : 27000            ");
		System.out.println("www.communication_store.sintok.com.my   ");
		System.out.println("STIA113 Communication Stores SDN BHD.   ");
		System.out.println("Communication Store,Sintok,06010,Bukit  ");
		System.out.println("           Kayu Hitam,Kedah.            ");   
		System.out.println("               -INVOICE-                ");   
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		
		//Array 2D
		String[] shop = {"1.Internet Shop", "2.Mobile Phone Shop", "3.Laptop Shop", "4.TV Shop"};
		int number;
		
		System.out.println("**********Welcome To Group 3 Communication Center**********");
		for(int i = 0; i<shop.length; i++) {
			System.out.println(shop[i]);
		}
		System.out.println();
		
		System.out.print("Enter the number of shop you want to go in: ");
		number = in.nextInt();
		
		if (number == 1) {
			InternetShop();
		}
		
		else if (number == 2) {
			MobileShop();
		}
		
		else if (number == 3) {
			LaptopShop();
		}
		
		else if (number == 4) {
			TVShop();
		}

	}
	
	
	
	
	
	public static void InternetShop() {
		Scanner obj=new Scanner(System.in);
		
		//array
		String[] pass= {"Daily pass","Weekly pass","Monthly pass","Top Up"};
		double[] price= {0,3,10,30};
		//declare and initialize
		double totalprice=0;
		double current=0;
		double value=0;
		//input

		
		System.out.println();
		System.out.println("**********Welcome To Communication Internet Store**********");
		
		//input
		System.out.println("--------------------------------------");
		System.out.print("Enter your first name : ");
		String firstname=obj.next();
		System.out.print("Enter your last name : ");
		String lastname=obj.next();
		System.out.print("Enter your identity card number : ");
		String ic=obj.next();
		System.out.print("Enter your phone number : ");
		String hp=obj.next();
		System.out.print("Enter your balance : ");
		double balance=obj.nextDouble();
		System.out.println("--------------------------------------");
		
		System.out.println("Can I help you? ");
		System.out.println(" Press 1 to continue");
		System.out.println("Press 2 to exit ");
		int c=obj.nextInt();
		
		//If Else Statement
		if(c==1) {
		
		System.out.println();
	
		System.out.println("Welcome to Hotlink centre!");
		System.out.println("You can buy your internet packages here.");
		System.out.println("Press button 1 to continue your purchase.");
		System.out.println("Press button 2 to exit.");
		int button=obj.nextInt();
		
		if(button==1) {//enter
			//menu
			System.out.println();
			System.out.println("***********INTERNET PASSES**********");
			displayListPass(pass);
			
			System.out.println("************************************");
			System.out.println();
			//input number pass
			System.out.println("Enter the number of the packages you want");
			int want=obj.nextInt();
			//if choose daily press 0
			if(want==0) {
				System.out.println();
				System.out.println("Daily pass.");
				System.out.println(" 2 GB 1 day: RM 3");
				System.out.println("To confirm press 1");
				int press=obj.nextInt();
				if(press==1) {
					System.out.println();
					if(balance>=3) {
					System.out.println("You have buy daily internet passes!");
					 totalprice=price[1];
					}
				    else
				    	//method
				    	invalidPurchase();
				}
				else {
					System.out.println("You have canceled your purchase. ");
					totalprice=price[0];
					
				}
			}
			//if choose weekly press 1
			else if(want==1) {
				System.out.println();
				System.out.println("Weekly pass.");
				System.out.println(" 3 GB 7 days: RM 10");
				System.out.println("To confirm press 1");
				int press1=obj.nextInt();
				if(press1==1) {
					System.out.println();
					if(balance>=10) {
					System.out.println("You have buy weekly internet passes!");
					totalprice=price[2];
					}
				    else
				    	//method
				    	invalidPurchase();
				}
				else {
					System.out.println("You have canceled your purchase. ");
					totalprice=price[0];
				}
			}
		    //if choose monthly press 2
		    else if(want==2) {
		    	System.out.println();
			    System.out.println("Monthly pass.");
			    System.out.println(" 10 GB 30 days: RM 30");
			    System.out.println("To confirm press 1");
			    int press2=obj.nextInt();
			    if(press2==1) {
				    System.out.println();
				    if(balance>=30) {
				    System.out.println("You have buy monthly internet passes!");
				    totalprice=price[3];
				    }//close if balance=30
				    else {//when balance not>=30
				    	invalidPurchase();
			}//close else if press2 not 1
				    }//close else when balance not>=30
				    else {
					    System.out.println("You have canceled your purchase. ");
					    totalprice=price[0];
				    }
		    //close else
		    }
		   
			else if(want==3) {//want 3
				 System.out.println();
				 
				 System.out.println("Top Up");
				 System.out.println(".");
				 
				 //Do While
				 int count=0;
				 do {
					 System.out.println("Enter the value you want to top up (RM 10-100");
					 System.out.print("RM");
					  value=obj.nextDouble();
					 
					 System.out.println("Press 0 to check current balance");
					 int exit=obj.nextInt();
					 if(exit==0) {
						 count=1;
					 }
				 }while(count==0);
			    	
			    }//close want 3
		    
		else {//want other than 0,1,2,3
			System.out.println();
	    	System.out.println("You have canceled your purchase. ");
		}//
		System.out.println();	
		System.out.println("********************************");	
		System.out.println("Name\t\t\t: "+firstname+" " +lastname);
		System.out.println("Identity card no.   \t: "+ic);
		System.out.println("Phone no. \t\t: "+hp);
		System.out.println("Total purchase  \t:RM "+totalprice);
		current=balance-totalprice+value;
		System.out.println("Current balance\t\t: "+current);
		System.out.println("Thank You for using Hotlink !");
		System.out.println("********************************");
		
	}
		else if(button==2){//button not =1
		System.out.println("You have canceled your purchase. ");
		}}
		else if(c==2) {
			System.out.println("You have canceled your purchase. ");
		}

		System.out.println("Closed Sat-Sun");
		System.out.println("When you spend min RM100 on your next visit to our store.");
		System.out.println("-Complete a brief survey at-");
		System.out.println("www.communication_store.sintok.com.my/feedback");
		System.out.println("------------------------------------------------");
		System.out.println( "             NO SIGNATURE REQUIRED             ");
		System.out.println("------------------------------------------------");
		System.out.println("Guest Relations Center  :  1300-13-1300");
		}
	
	
	
	
	public static void MobileShop() {
		Scanner in = new Scanner (System.in);
		
		  String ip, vivo, asus;
		  String phone;
		  int quantity,price = 0;
		  double total,discount;
		 
		//Introduction to mobile phone store
		System.out.println("**********Welcome To Communication Mobile Phone Store**********");
		System.out.println("*****Welcome to MSZ STORE******");
		
		//User input the details
		System.out.print("What is  your name: ");
		String name = in.nextLine();
		System.out.println("Name: " + name);
		
		System.out.print("Enter your No.phone: ");
		String num = in.nextLine();
		System.out.println("No.phone: " + num);
		
		System.out.print("Enter your Residence: ");
		String residence = in.nextLine();
		System.out.println("Residence: " + residence);
					
		System.out.println(); 
        
		//Mobile Available
        System.out.println("!Mobile Phone Available in our store!");
		
        //Using method
		PhoneList();
		
		System.out.println(); 
	
		System.out.print("Enter the mobile phone (Enter Number): ");
		String product = in.nextLine();
		
		//Using If Else statement for user to choose the phone
		if(product.equals("1")) {
			price = 3899;
		}    
		else 
		if(product.equals("2")) {
			price = 3399;
		}
			else
				if(product.equals("3")) {
					price = 5299;
				}
				else
					if(product.equals("4")) {
						price = 1799;
					}
					else
						if(product.equals("5")) {
							price = 1019;
						}
						else
							if(product.equals("6")) {
								price = 1999;
							}
							else
								if(product.equals("7")) {
									price = 1099;
								}
								else
									if(product.equals("8")) {
										price = 3399;
									}
									else
										if(product.equals("9")) {
											price = 2499;
										}
										else
								System.out.println("Non Available Product");
	
	
	System.out.println();
	
	System.out.print("Enter the quantity purchase: ");
	quantity = in.nextInt();
	
	//Numerical data & Expression
	total = price * quantity;
	System.out.println("Total: RM " +total);
	
	//Using if else statement for discount
	if (total >1000) {
	 discount = total*0.2;
	 }			 
	else {
	 discount=(total*0.1);
	}
	 
	 //calculate for user to pay
	 System.out.println("Need to pay: " +(total-discount));
	 
	 System.out.println();
	 
	 //While loop
	 System.out.println("Get your freegift!");
	 String [] gift = {"Cable phone", "Casing", "Tinted phone"};
		
		int a =0;
		while (a<gift.length) {
			System.out.println(gift[a]);
			a++;
	
}
		System.out.println();
		
		//Passing Array To Method
	    String[] Array = passing();
	    for(int i=0; i<Array.length; i++) {
		  System.out.print(Array[i]+ " ");
	  }
	    System.out.println();
	    System.out.println();
		System.out.println("Closed Sat-Sun");
		System.out.println("When you spend min RM100 on your next visit to our store.");
		System.out.println("-Complete a brief survey at-");
		System.out.println("www.communication_store.sintok.com.my/feedback");
		System.out.println("------------------------------------------------");
		System.out.println( "             NO SIGNATURE REQUIRED             ");
		System.out.println("------------------------------------------------");
		System.out.println("Guest Relations Center  :  1300-13-1300");
}

		
	
	
	
	public static void LaptopShop() {
		
		System.out.println();
		
		//Introduction to Laptop store
		System.out.println("**********Welcome To Communication Laptop Store**********");
		Scanner in = new Scanner (System.in);
		 
		String[][] custInfo = new String [3][1];
		int[] counter = {0,1,2};
		change(counter);
		
		int custLaptop;
		int quantity=0;
		double laptopprice = 0.00;
		double totalprice=0.00;
		double amount = 0.00;
		double discount=0.00;
		char next=0;
		double pricetopaid=0.00;
	    
		//Method
		laptopBrand();
		
		//For loop
		for (int i=0; i<52; i++) {
			System.out.print("*");
		}
		
		//user input
		System.out.println();
		System.out.println("Customer Information");
		System.out.print(counter[0] + ". Enter Your Name: ");
		custInfo[0][0] = in.next();
		System.out.print(counter[1] + ". Enter Your IC No: ");
		custInfo[1][0] = in.next();
		System.out.print(counter[2] + ". Enter Your Phone No.: ");
		custInfo[2][0] = in.next();
		
		
		do{
			System.out.println(); 
			System.out.print("Which Brand of Laptop You Want: ");
			custLaptop = in.nextInt();
			
			//If else statement for user to choose laptop
			if (custLaptop == 1) {
				laptopprice = 3600.00;
			}
				
			else if (custLaptop == 2) {
				laptopprice = 5600.00;
			}
			
			else if (custLaptop == 3) {
				laptopprice = 4500.00;
			}
			
			else if (custLaptop == 4) {
				laptopprice = 2800.00;
			}
			
			else if (custLaptop >=5) {
				System.out.print("Invalid");
			}
			
			System.out.print("Quantity You Want To Buy: ");
			quantity = in.nextInt();
			
			//numerical Data & expression
			totalprice = laptopprice * quantity;
			
			amount = amount + totalprice;
			
			if (amount >= 2500 && amount < 5000) {
				discount = amount * 0.05;
			}
			
			else if (amount >= 5000 && amount <= 7500) {
				discount = amount * 0.10;
			}
			
			else if (amount >= 7500 && amount <= 10000) {
				discount = amount * 0.15;
			}
			
			else if (amount > 10000) {
				discount = amount * 0.20;
			}
			
			pricetopaid = amount - discount;
			
			System.out.print("Enter Y If You Want Buy Another Brand: ");
			next = in.next().charAt(0);
		} while (next == 'Y' || next == 'y');
		
		int i=0;
		while (i<52) {
			System.out.print("*");
			i++;
		}
		
		System.out.println();
		System.out.println("Customer Name: " + custInfo[0][0]);
		System.out.println("Customer IC: " + custInfo[1][0]);
		System.out.println("Customer Phone Number: " + custInfo[2][0]);
		System.out.println("Amount of Price : RM" + amount);
		System.out.println("Discount 20%: RM" + discount);
		System.out.println("Price Need To Be Paid by Customer: RM" + pricetopaid);
		
		System.out.println();
		System.out.println("Closed Sat-Sun");
		System.out.println("When you spend min RM100 on your next visit to our store.");
		System.out.println("-Complete a brief survey at-");
		System.out.println("www.communication_store.sintok.com.my/feedback");
		System.out.println("------------------------------------------------");
		System.out.println( "             NO SIGNATURE REQUIRED             ");
		System.out.println("------------------------------------------------");
		System.out.println("Guest Relations Center  :  1300-13-1300");

	}
	
	
	
	
	
	public static void TVShop() {
		Scanner in = new Scanner (System.in);
		
		String name,TV;
		int age,price,item,cust;
		char gender;
		double discount, total;
		
		//Introduction to TV store
		System.out.println();
		System.out.println("**********Welcome To Communication TV Store**********");
		System.out.println();
		
		System.out.println("        -Now, Our Shop Have A Blast Promosi!-        ");
		System.out.println();
	
		//Array 2D
		//column 0 and 1
		//row 0,1,2
		String [][] myname = {{"Mrs", "Mr", "Miss"},
				              {"Fatin", "Akmal", "Rajh"}
		};
		System.out.println();
		System.out.println("Hai my dear customer, with me, your personal assistant in this shop today, " +myname[0][2]+ " " +myname [1][0]+ ".");
		System.out.println();
		
		System.out.println(">>Please submit all the customer details below, Thank You!<<");
		System.out.println();

		//FOR LOOP
		for(int i=0; i < 2;i++) {
		System.out.print("Enter name of the customer that come into the shop: ");
		name = in.next();
	    }
		
		//DO-WHILE LOOP
		int x =1;
		do {
		System.out.print("Enter the age of the customer:"+x+ ".");
		age = in.nextInt();
		x++;
		}
		while(x<3);
		
		System.out.print("Enter gender of the first customer:" );
		gender = in.next().charAt(0);
		
		System.out.println();
	
		
		//REPETITION STRUCTURE (IF/ELSE) FOR GENDER
		if(gender=='F') {
			System.out.println("You can claim item under RM50, at the Watson and Guardian shop. After you buy with our product. Don't miss it!");
		}
		else
			if(gender=='M') {
				System.out.println("You can claim item under RM50, at the electric shop. After you buy with our product. Don't miss it!");
				
			}
			else
				System.out.println("None");
		System.out.println();
		
		//Array
		System.out.println("Take a look at our product. There's plenty of new good quality TV!");
		
		String[][]  product_1 = {
				                {"A. QLED", "B.OLED"},
		                        {"C.  LCD", "D.DLP"},
		                        {"E.X900H", "F.UHD"}
		};
		
		  for (int i = 0; i < product_1.length; i++)
		  {
		         System.out.print( product_1[ i ] [ 0 ] + " || " );
		         for (int j = 1; j <  product_1[ i ].length; j++)
		         {
		                    System.out.print( product_1[ i ][ j ] + " ");
		         }
			System.out.print("\n");
		}

		  System.out.println();

		
		System.out.print("Enter the product/TV (Enter A-F,Only): ");
		String product = in.next();
		
		if(product.equals("A")) {
			System.out.println("The price is RM6,999");
		}    
		else 
		if(product.equals("B")) {
			System.out.println("The price is RM8,999");
		}
			else
				if(product.equals("C")) {
					System.out.println("The price is RM5,599");
				}
				else
					if(product.equals("D")) {
						System.out.println("The price is RM1,940");
					}
					else
						if(product.equals("E")) {
							System.out.println("The price is RM4,469");
						}
						else
							if(product.equals("F")) {
								System.out.println("The price is RM2,090");
							}
							else
								System.out.println("None product available, we are sorry!");
		
		System.out.println();
		
		//passing method
		
	    //how many item that customer purchase
		final int SIZE = 4; //size array
		
		int[] num_array = new int[SIZE];
		
		//passing array
		fillArray(num_array, SIZE);
		System.out.println("Limit number items when shopping are: ");
		
		printArray(num_array, SIZE);
		
		System.out.println();

		
		System.out.print("Enter how many item purchase: ");
		item = in.nextInt();
		
		System.out.println();
		
		//calculate the total price
		System.out.print("Enter the price given is RM ");
		price = in.nextInt();
		
		total = price * item;
		System.out.println("The total price:                                   RM" +total);
		System.out.println("Qty:                                                 " +item);
		//discount
	
		if(total<1000) {
			discount =Math.round(total * 0.1);
		}
		else
			discount =Math.round(total * 0.2);
		
		System.out.println("Discount received:                                 RM" +discount);
		System.out.println("                                                 ------------");
		System.out.println("Price to be paid on the product after discout:     RM"+(total-discount));
		System.out.println("Free delivery:                                     RM ");
		
		System.out.println();
		
		System.out.println("Delivery to your house, press 'Y' for YES, press 'N' for 'NO':");
		char delivery = in.next().charAt(0);
		
		if(delivery=='Y') {
			System.out.println("Customer address to deliver: ");
			String address = in.next();
			System.out.println("Thank you! We will inform you around 2 days start from your purchase.");
			System.out.println("If you have any questions, do contact En Faisal (+60194789087) for the detalils.");
		}
		else {

			if(delivery=='N') {
				System.out.println("Thank you for the confirmation! Have a nice day.");
			}
		}
		System.out.println();
		
		//WHILE LOOP
		System.out.println("Before you go back, let's pick one that you like and go redeem your coupon! Interesting isn't it!?");
		
		//Single Array
		String[] array1 = new String[] {"KFC", "Mcdonald", "Subway"};
		
		//iterating all elements in the array
		for(int i=0; i< array1.length; i++) {
			System.out.println(array1[i]);
		}

		System.out.println();
		System.out.println("***************THANK YOU MY BELOVED CUSTOMER, HOPE TO SEE YOU AGAIN!***************");
		System.out.println("Closed Sat-Sun");
		System.out.println("When you spend min RM100 on your next visit to our store.");
		System.out.println("-Complete a brief survey at-");
		System.out.println("www.communication_store.sintok.com.my/feedback");
		System.out.println("------------------------------------------------");
		System.out.println( "             NO SIGNATURE REQUIRED             ");
		System.out.println("------------------------------------------------");
		//Method
		guest();


	}
	
	//method displayListPass
	public static void displayListPass(String x[]) {
		for(int counter=0;counter<4;counter++) {
			System.out.println(counter+x[counter]);

}//close for
	}//close method displayListPass
 //method invalidPurchase
	private static void invalidPurchase() {
		  System.out.println("You have insufficient balance!Please top up ");
		
	}//close method
	

	
	public static void PhoneList() {
		System.out.println(); 
		System.out.println("                       *Iphone*                                 ");
		System.out.println("1.  Iphone 12  \\2.  Iphone 12 Mini  \\3. Iphone 12 Pro Max     ");
		System.out.println("                        *Vivo*                                  ");
		System.out.println("4.   V20 Pro   \\5.     V20 SE       \\6.      X50              ");
		System.out.println("                        *Asus*                                  ");
		System.out.println("7. Zenfone Max \\8.    ROG Phone     \\9.    ROG Phone 2        ");
	}
	
	public static void change (int x[]) {
		for (int j=0; j<x.length; j++) {
			x[j]++;
		}
	}
	
	public static void laptopBrand() {
		String[] laptopBrand = {"1.hp" , "2.ASUS" , "3.Acer" , "4.Lenovo"};
		System.out.println("Brand of Laptop We Sell: ");
		for (int i = 0; i < laptopBrand.length; i++) {
			System.out.println(laptopBrand[i]);
		}
	}

	public static void fillArray(int[] num_array, int n) {
		Scanner in = new Scanner (System.in);
		
	System.out.println("Enter all " + n + " integer(1 until 4):");
		
		for(int i=0; i<n; i++) {
			
			num_array[i] = in.nextInt();
	}
	}
	public static void printArray(int[] num_array, int n) {
		Scanner in = new Scanner (System.in);
		
		for(int i=0; i<n; i++) {
			
			System.out.print(num_array[i] + " ");
		}
	}
	public static String[] passing() {
			String[] welcome = new String[] {"Please,", "come", "again!"};
			return welcome;
	}
	public static void guest() {
		System.out.println("Guest Relations Center  :  1300-13-1300");
	}
	 

}

	
	

