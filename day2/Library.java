package week1.day2;

public class Library {
	
	String addBook(String booktitle)
	{
	  System.out.println("Book added successfully");
		return "Bookname: "+booktitle; 
	}
	
	void issueBook(){
		System.out.println("Book Issued Successfully");
	}
	
	public static void main(String[] args) {
		
		Library Li=new Library();
		System.out.println(Li.addBook("Selenium Book"));
		Li.issueBook();
		}
}
