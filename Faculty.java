public class Faculty{
public void showFaculty(String universityName,String facultyName,String department){
System.out.println("university name"+universityName);
System.out.println("Faculty name:"+facultyName);
System.out.println("Department:"+department);
}
public static void main(String args[]){
Faculty f=new Faculty();
f.showFaculty("Stanford university","Dr.Robert Brown","computer science");
f.showFaculty("Stanford university","Dr.Lisa Green","physics");

}}