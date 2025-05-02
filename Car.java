public class Car{
public void displayDetailes(String showroomName,String modelName, int price){
System.out.println("Showroom Name"+showroomName);
System.out.println("car model"+modelName);
System.out.println("car price:"+price);
}
public static void main(String args[]){
Car c=new Car();
c.displayDetailes("Elite Motors","Tesla models",80000);
c.displayDetailes("Elite motors","BMW",75000);
}}