public class Reservation{
public String getReservationDetailes(String hotelName,String guestName,int nights){
return "hotel Name:"+hotelName+"guest Name:"+guestName+"nights"+ nights;
}
public static void main(String args[]){
Reservation r=new Reservation();
String s=r.getReservationDetailes("grand palace","david",3);
String s1=r.getReservationDetailes("grand palace","maria",2);
System.out.println(s);
System.out.println(s1);
}}