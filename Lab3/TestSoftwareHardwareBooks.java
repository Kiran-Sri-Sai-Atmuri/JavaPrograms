//	Write a program that stores the details of the Software and Hardware books. 
//	The Software book includes the software version and software name. The 
//	Hardware book includes the hardware category and publisher. However, both 
//	the books include some common details, such as author name, title, price, and 
//	number of pages. Therefore, you need to store and display the book details by 
//	implementing the code reusability in the program

package javaLab.Lab3;

public class TestSoftwareHardwareBooks {

	public static void main(String[] args) {
		SoftwareHardwareBooks softwareBook = new SoftwareHardwareBooks();
		softwareBook.setSoftwareVersion("1.10.5");
		softwareBook.setSoftwareName("Java");
		softwareBook.setAuthorName("kiran");
		softwareBook.setBooktitle("Java By Kiran");
		softwareBook.setBookDetails("This is Java book Written by The Great Java Developer Kiran ");
		softwareBook.setBookPrice(999);
		
		System.out.println(softwareBook);
		
		SoftwareHardwareBooks hardwareBook = new SoftwareHardwareBooks();
		hardwareBook.setHardwareCategory("Laptop");
		hardwareBook.setHardwarePublisher("Kiran private Limited");
		hardwareBook.setAuthorName("kiran");
		hardwareBook.setBooktitle("Laptop By Kiran");
		hardwareBook.setBookDetails("This is book related to Laptop");
		hardwareBook.setBookPrice(1999);
		
		System.out.println();
		System.out.println(hardwareBook);
		
		
		

	}

}

class SoftwareHardwareBooks{
	
	private String softwareVersion;
	private String softwareName;
	private String hardwareCategory;
	private String hardwarePublisher;
	private String bookDetails;
	private String authorName;
	private String booktitle;
	private double bookPrice;
	
	
	public String getSoftwareVersion() {
		return softwareVersion;
	}
	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getHardwareCategory() {
		return hardwareCategory;
	}
	public void setHardwareCategory(String hardwareCategory) {
		this.hardwareCategory = hardwareCategory;
	}
	public String getHardwarePublisher() {
		return hardwarePublisher;
	}
	public void setHardwarePublisher(String hardwarePublisher) {
		this.hardwarePublisher = hardwarePublisher;
	}
	public String getBookDetails() {
		return bookDetails;
	}
	public void setBookDetails(String bookDetails) {
		this.bookDetails = bookDetails;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		if(hardwareCategory == null && hardwarePublisher==null)
			return "softwareVersion=" + softwareVersion + "\nsoftwareName=" + softwareName
					+ "\nbookDetails=" + bookDetails + "\nauthorName=" + authorName + "\nbooktitle=" + booktitle
					+ "\nbookPrice=" + bookPrice;
		
		return  "hardwareCategory=" + hardwareCategory + "\nhardwarePublisher=" + hardwarePublisher
				+ "\nbookDetails=" + bookDetails + "\nauthorName=" + authorName + "\nbooktitle=" + booktitle
				+ "\nbookPrice=" + bookPrice;
	}
	
	
	
	
}
