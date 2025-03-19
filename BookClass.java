public class BookClass{
	private String Title;
	private int id;
	private String Author;
	private static int i=0;
	private String issuedTo;
	public BookClass(String Titl , String Athr){
		Title=Titl;
		Author=Athr;
		id=i++;
		
	}
	public String getTitle() {
		return Title;
	}
	public String getAuthor() {
		return Author;
	}
	public String getIssuedTo() {
		if(issuedTo==null) {
			return null;
		}
		else {
			return issuedTo;
		}
	}
	public int getId() {
		return id;
	}
	public void setIssuedTo(String NameWhoIssued) {
		issuedTo=NameWhoIssued;
	}
  }