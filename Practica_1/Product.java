package com.nebrija.jp;
import java.util.Scanner;

public class Product {
	
		 static String name;
		 int id;
		 static float price;
		 String selC;
		 Category selC1;
		 String selP;
		 
		 static int quantity;
		 int select;
		 static String category;
		 static boolean euro=false;
		 static boolean dollar=true;
		 static boolean pound=false;
		
		boolean exist=true;
		
		Product(String category, String name, float price, int quantity){
			this.category=category;
			this.name=name;
			this.price=price;
			this.quantity=quantity;
		}
		
		public static void setName(String name1) {
			name = name1;
		}

		public static void setQuantity(int quantity1) {
			quantity = quantity1;
		}
		
		 String getName() {
			return name;
		}
		
		int getId() {
			return id;
		}
		
		float getQuantity() {
			return quantity;
		}
		
		 public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		 
		 public String getCategory() {
			return category;
		}

		public static void setCategory(String category1) {
			category = category1;
		}

		static void sellProduct() {
			
			System.out.print("Add name: ");
			Scanner sc2 = new Scanner(System.in);
			setName(sc2.nextLine());
			System.out.print("Add quantity: ");
			Scanner sc3 = new Scanner(System.in);
			setQuantity(sc3.nextInt());
			System.out.print("Add price: ");
			Scanner sc4 = new Scanner(System.in);
			setQuantity(sc4.nextInt());
			System.out.print("In wich category: ");
			Scanner sc5 = new Scanner(System.in);
			setCategory(sc5.nextLine());
			Product selP1;
			selP1=new Product(category, name, price, quantity);
			Scanner sc1 = new Scanner(System.in);
			Category selC1;
			selC1 = Category.searchCategories(selP1.getCategory());
			if(selC1.getName() == null) {
				Category.Categories.add(new Category(selP1.getCategory()));
			} 
			else {
				selC1.getProducts().add(selP1);
			}
		}
		
		 
		
		 static void currency() {
	      int select;
			System.out.println("Choose an option");
		    System.out.println("   1. � ");
			System.out.println("   2. $");
			System.out.println("   3. �");
			Scanner sc1 = new Scanner(System.in);
			select = sc1.nextInt();
			
		    switch(select) {
		    
		    case 1:
		    	euro=true;
		    	dollar=false;
		    	pound=false;
		    	break;
		    case 2:
		    	euro=false;
		    	dollar=true;
		    	break;
		    case 3:
		    	euro=false;
		    	dollar=false;
		    	pound=true;
		    	break;
		    }
		}

		
		   static void menuP() {
			int select;
			do {
				
				System.out.println("Choose an option");
				System.out.println("   1. Buy ");
				System.out.println("   2. Sell");
				System.out.println("   3. Basket");
				System.out.println("   4. �/$/�");
				System.out.println("   5. Exit");
				Scanner sc = new Scanner(System.in);
				select = sc.nextInt();
					
				switch(select) {
					case 1:
						Category.buyProduct();
						break;
					case 2:
						sellProduct();
						break;
				    case 3:
				    	User.Users.get(User.selL).showBasket();
				    	break;
				    case 4:
				    	currency();
				    	break;
				    case 5:
				    	
			    }	
			}while(select!=5);
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
