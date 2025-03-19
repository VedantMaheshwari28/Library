import java.util.*;
public class LibraryClass{
	ArrayList <BookClass> book = new ArrayList<BookClass>();
	public LibraryClass() {
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
		 public void SearchBookByTitle(String s) {
			 int flag =0;
			 for(BookClass i:book) {
			 if(i.getTitle().equals(s)) {
				 System.out.println(s+ " is present");
				 flag=1;
				 System.out.println(i.getId()+" "+i.getTitle()+" "+i.getAuthor());
				 break;
			     }
			 }
			 if(flag==0) {
				 System.err.println("Book not found");
			 }
	}
		 public void SearchByAuthor(String n) {
			 int flag1=1;
			 for(BookClass j: book) {
				 if(j.getAuthor().equals(n)) {
					 System.out.println("Yes Book of "+ n +" is present");
					 System.out.println(j.getId()+" "+ j.getTitle()+ " "+ j.getAuthor());
					 flag1=0;
					 break;
				 }
			 }
			 if(flag1==1) {
				 System.err.println("BOOK OF AUTHOR *"+n+"* IS NOT PRESENT PLEASE RECHECK AUTHOR");
			 }
		 }
		 public void IssueBook(String IssuerName,String BookName) {
			 int flag2 =1;
			 for(BookClass k: book) {
				 if(k.getTitle().equals(BookName)) {
					 flag2 =0;
					 if(k.getIssuedTo()==null|| k.getIssuedTo().equals("")) {
						 k.setIssuedTo(IssuerName);
						 System.out.println("BOOK IS ALLOTED TO YOU");
					 }
					 else{
						 System.err.println("BOOK IS NOT PRESENT AT THIS MOMENT"); 
					}
				  }
			   }
			 if(flag2==1) {
				 System.err.println("Book is not in library");
			 }
		 }
		 public void returnBook(String IssuerName,String Bookname) {
			 for(BookClass l: book) {
				 if(l.getTitle().equals(Bookname)) {
					 if(l.getIssuedTo().equals(IssuerName)) {
						 l.setIssuedTo("");
						 System.out.println("RETURNED SUCESSFULLY");
					 }
					 else {
						 System.err.println("BOOK IS NOT ISSUED BY YOU");
					 }
				 }
			 }
		 }
		 public void BooksImformation() {
			 System.out.println("ID  NAME  AUTHOR  ISSUED_TO");
			 for(BookClass i: book) {
				 System.out.println(i.getId()+ " "+ i.getTitle()+ " " + i.getAuthor() + " "+ i.getIssuedTo());
			 }
		 }
		 public void isIssued(String Bookname) {
			 int flag3=0;
			 for(BookClass i: book) {
				 if(i.getTitle().equals(Bookname)){
				   if(i.getIssuedTo()==null || i.getIssuedTo().equals("")) {
					 System.out.println("BOOK IS NOT ISSUED" );
					 flag3=1;
					 break;
				 }
				   else {
					   System.out.println("Book is issued by "+ i.getIssuedTo() );
				   }
			 }
			 }
		 } 
}