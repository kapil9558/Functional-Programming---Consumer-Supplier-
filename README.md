Scenario:
In an e-commerce platform, the system needs to generate and print invoices for each order placed. Each invoice includes:

Customer name
Total bill amount
Delivery address

Requirement:
Write a Java program that:

Defines an Order class with id, customer, amount, and address.
Uses a Consumer<Order> to print the invoice in the required format.
Calls .accept() to process and print details of all orders.

Class and Method Structure:
Class: Order

Attributes:
int id
String customer
int amount
String address

Constructor:
Order(int id, String customer, int amount, String address)
Hint:
- Use Consumer<Order> like this:
Consumer<Order> printInvoice = order ->
System.out.println("Invoice: " + order.customer + " - Rs. " + order.amount + " - " + order.address);

- Then use:
for (Order o : orders) {
printInvoice.accept(o);
}
