//抗力4-5
public class book {
	String title;
	String author;
	
	void show() {
		System.out.println("力格 : "+title+" 历磊 : "+author);
	}
	
	public  book() {
		this("Bible", "alot");

		
	}
	
	public book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	public  book(String name) {
		this.title = title;
		author = "Unknown";
	}
	
	public static void main(String[] args) {
		book bible = new book();
		book Java = new book("Java", "Kim");
		book phyton = new book("Phyton");
		
		bible.show();
		Java.show();
		phyton.show();
	}
}
