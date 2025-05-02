public class Enrollment{
public String getEnrollmentInfo(String platform,String course ,String student){
return "platform :"+platform+" course :"+course +" student:"+student;
}
public static void main(String args[]){
 Enrollment t=new Enrollment();
String detail=t.getEnrollmentInfo("udemy","java programming","Alice");
String detailes=t.getEnrollmentInfo("udemy","webdevelopment","Bob");
System.out.println(detail);
System.out.println(detailes);
}}