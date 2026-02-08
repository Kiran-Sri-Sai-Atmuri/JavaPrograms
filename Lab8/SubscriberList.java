package javaLab.Lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class SubscriberList {

	LinkedList<SubscriberInfo> list = new LinkedList<>();

	public void add(String subscriber_Id,
			String subscriber_Name, int balance) {
		SubscriberInfo subinfo = new SubscriberInfo(subscriber_Id,subscriber_Name,balance);
		list.add(subinfo);
				
	}
	
	public void serach(String subscriber_Id) {
		for(SubscriberInfo si : list) 
			if(si.subscriber_Id.equalsIgnoreCase(subscriber_Id))
				System.out.println(si);
		
	}
	
	public void delete(String subscriber_Id) {
		for(SubscriberInfo si : list)
			if(si.subscriber_Id.equalsIgnoreCase(subscriber_Id))
				list.remove(si);
		
	}
	
	public void sort() {
		
		LinkedList<SubscriberInfo> info = new LinkedList<>(list);
		for(int i=0;i<info.size()-1;i++) {
			for(int j=i+1;j<info.size();j++) {
				if(Integer.parseInt(info.get(i).subscriber_Id)  > Integer.parseInt(info.get(j).subscriber_Id)) {
					
					SubscriberInfo temp = info.get(i);
					info.set(i, info.get(j));
					info.set(j, temp);
				}
			}
		}
		
		for(SubscriberInfo sinfo : info)
			System.out.println(sinfo);
		
		store(info);
	}
	
	public void store(LinkedList<SubscriberInfo> l) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("BSNLData.txt"));
			String str = "";
			for(int i=0 ; i<l.size() ; i++) {
				str += l.get(i)+"\n"; 
			}
			bw.write(str);
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
