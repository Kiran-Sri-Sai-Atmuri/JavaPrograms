package javaLab.Lab8;

public class SubscriberInfo {
	 String subscriber_Id;
	 String subscriber_Name;
	 int balance;
	 public SubscriberInfo(String subscriber_Id, String subscriber_Name, int balance) {
		
		this.subscriber_Id = subscriber_Id;
		this.subscriber_Name = subscriber_Name;
		this.balance = balance;
	 }
	 
	 @Override
	 public String toString() {
		return subscriber_Id + "," + subscriber_Name + ","
				+ balance;
	 }
	 
	 
	 
	 
}
