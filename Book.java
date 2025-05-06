public class Book {
	public void displayInfo(String libraryName, String title, String author) {
       System.out.println("Library Name is"+ libraryName);
       System.out.println("Book Title is"+ title);
       System.out.println("Book autor is"+ author);
	}
	public static void main(String args[]) {
		Book f2=new Book();
		f2.displayInfo("city public library","The great gatsby","f.scott fitzgerald");
		f2.displayInfo("city public library","1986","george orwell");
	}
       
}
