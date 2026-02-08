package javaLab.Lab3;

public class TestBook {

	public static void main(String[] args) {
		
		Book book = new Book("kiran",new Author("kiran",'m',"a.kiransrisai@gmail.com"),99.9,5);
		System.out.println(book.getAuthor().getName() + "\n" + book.getAuthor().getEmail());
		System.out.println(book.getAuthorName());
		System.out.println(book.getAuthorEmail());
		System.out.println(book.getAuthorGender());

	}

}
