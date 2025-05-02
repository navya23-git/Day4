public class Patient{
public void printDetailes(String hospitalName,String patientName,int age){
System.out.println("Hospital Name:"+hospitalName);
System.out.println("patient name:"+patientName);
System.out.println("patient age:"+patientName);
}
public static void main(String args[]){
Patient p=new Patient();
p.printDetailes("city care hospital","John Doe",45);
p.printDetailes("city care hospital","Emma watson",30);
}}