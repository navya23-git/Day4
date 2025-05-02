public class Mobile{
public void showDetailes(String storeName,String brand,String price){
System.out.println("tech world :"+storeName);
System.out.println("mobile brand :"+brand);
System.out.println("mobile price"+price);
}
public static void main(String args[]){
Mobile m=new Mobile();
m.showDetailes("Tech world","Apple","1200");
m.showDetailes("Tech world","Samsung","900");
}}
