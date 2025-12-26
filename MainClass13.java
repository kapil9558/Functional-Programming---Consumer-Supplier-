package com.nit.java8;
import java.util.Scanner;
import java.util.function.Consumer;

class Order
{
	int id;
	String customer;
	int amount;
	String address;
	
	public Order(int id, String customer, int amount, String address)
	{
		this.id = id;
		this.customer = customer;
		this.amount = amount;
		this.address = address;
	}
}

public class MainClass13
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Order: ");
		
		int n = Integer.parseInt(sc.nextLine());
		
		Order[] order = new Order[n];
		for(int i=0; i < n; i++)
		{
			System.out.println("Enter the custmoer id : " + (i+1) + ": ");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter the custmoer name: " + (i+1) + ": ");
			String customer = sc.nextLine();
			
			System.out.println("Enter the customer amount " + (i+1) + ": ");
			int amount = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter the address: " + (i+1) + ": ");
			String address = sc.nextLine();
			Order o=new Order(id, customer, amount, address);
			order[i]=o;
			
		}	
		Consumer<Order> printInvoice = o -> System.out.println("Invoice: " + o.customer + "-Rs. "+ o.amount + "-" + o.address);
		
		for (Order order2 : order) {
			printInvoice.accept(order2);
		}
		
	}
}

