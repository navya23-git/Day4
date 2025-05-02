public class Order{
public String getOrderDetails(String restaurantName,String foodItem,int quantity){
return "Restaurant Name:"+restaurantName+"\nFood Item"+foodItem+"\nQuantity"+quantity;
}
public static void main(String args[]){
Order o=new Order();
String detailes=o.getOrderDetails("Spice garden","paneer buter masala",2);
String detailes1=o.getOrderDetails("Spice garden","chicken biryani",1);
System.out.println(detailes);
System.out.println(detailes1);
}}