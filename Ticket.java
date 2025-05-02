public class Ticket{
public String getTicketInfo(String theaterName,String movieName,String seatNumber){
return "Theater Name :"+theaterName+" Movie Name :"+movieName+" Seat Number:"+seatNumber;
}
public static void main(String args[]){
Ticket t=new Ticket();
String detail=t.getTicketInfo("galaxy cinemas","Interstellar","A10");
String detailes=t.getTicketInfo("galaxy cinemas","Inception","B12");
System.out.println(detail);
System.out.println(detailes);
}}