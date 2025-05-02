public class Travel{
public String getBookingDetailes(String agency,String destination,int travellers){
return  "agency:"+agency+"destination:"+destination+"travellers:"+travellers;
}
public static void main(String args[]){
Travel t=new Travel();
String s=t.getBookingDetailes("wanderlust travels","paris",2);
String s1=t.getBookingDetailes("wanderlust travels","tokyo",3);
System.out.println(s);
System.out.println(s1);
}}