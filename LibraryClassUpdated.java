import java.util.ArrayList;
import java.util.Scanner;
public class LibraryClassUpdated{
	ArrayList <BookClass> book = new ArrayList<BookClass>();
	public LibraryClassUpdated() {
		 Scanner O =new Scanner (System.in);
		 for(int i=0;i<3;i++){
			 System.out.println("Enter Title of Book");
			 String BT = O.nextLine();
			 System.out.println("Enter Author of Book");
			 String AU = O.nextLine();
			 book.add(new BookClass(BT,AU));
		 }
	}
		 //methods
		 public BookClass SearchBookByTitle(String s) {
			 for(BookClass i:book) {
			 if(i.getTitle().equals(s)) {
				 return i;
			     }
			 }
			 return null;
	}
		 public BookClass SearchBookByAuthor(String n) {
			 for(BookClass j: book) {
				 if(j.getAuthor().equals(n)) {
					 return j;
				 }
			 }
			 return null;
		 }
		 
		 public boolean IsBookPresent(String BookName) {
			BookClass x=SearchBookByTitle(BookName);
			 if(x!=null) {
				 return true;
			 }
			 else {
				 return false;
			 }
		 }
		 
		 public String IssueBook(String IssuerName,String BookName) {
			 boolean BookPresent = IsBookPresent(BookName);
			 for(BookClass k: book) {
				 if( BookPresent && k.getTitle().equals(BookName)) {
					 if(isIssued(BookName)==false) {
						 k.setIssuedTo(IssuerName);
						 return "Book issued to you";
					 }
					 else{
						 return "Book is already Issued";
					}
				  }
			   }
			 return "Book is not present";
		 }
		 
		 public String returnBook(String IssuerName,String Bookname) {
			 for(BookClass l: book) {
				 if(IsBookPresent(Bookname) &&  l.getTitle().equals(Bookname)) {
					 if(l.getIssuedTo().equals(IssuerName)) {
						 l.setIssuedTo("");
						 return "Returned";
					 }
					 else {
						 return "BookNotIssuedByyou";
					 }
				 }
			 }
			 return "Book Not Present";
		 }
		 public ArrayList<BookClass> BooksImformation() {
			 return book;
		 }
		 public boolean isIssued (String Bookname) {
			 BookClass z=SearchBookByTitle(Bookname);
			 if(z.getIssuedTo()==null || z.getIssuedTo().equals("")) {
				 return false;
			 }
			 else {
				 return true;
			 }
		 }
}