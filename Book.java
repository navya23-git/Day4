public class Book{
public void displayinfo(String libraryName,String bookTitle,String author){
System.out.println("Library name:"+libraryName);
System.out.println("booktitle:"+bookTitle);
System.out.println("book author:"+author);
}
public static void main(String args[]){
Book book=new Book();
book.displayinfo("city public library","the great gatsby","f.scott fitzzgerald");
book.displayinfo("city public library","1984","orwell");
}}
