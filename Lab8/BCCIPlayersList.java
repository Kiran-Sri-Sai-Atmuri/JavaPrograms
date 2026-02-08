package javaLab.Lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class BCCIPlayersList {
	LinkedList<Player> list = new LinkedList<>();

	public void add(String playerName,
			int totalRuns, float average) {
		Player player = new Player(playerName,totalRuns,average);
		list.add(player);
				
	}
	
	public void serach(String playerName) {
		boolean flag = false;
		for(Player p : list) 
			if(p.playerName.equalsIgnoreCase(playerName)) {
				System.out.println(p);
				flag= true;
			}
		if(flag == false)
			System.out.println("Player NOT Found");
	}
	
	public void delete(String playerName) {
		for(Player p : list)
			if(p.playerName.equalsIgnoreCase(playerName))
				list.remove(p);
		
	}
	
	public void sort() {
		
		LinkedList<Player> player = new LinkedList<>(list);
		for(int i=0;i<player.size()-1;i++) {
			for(int j=i+1;j<player.size();j++) {
				if(player.get(i).average  >player.get(j).average) {
					
					Player temp = player.get(i);
					player.set(i, player.get(j));
					player.set(j, temp);
				}
			}
		}
		
		for(Player p : player)
			System.out.println(p);
		
		store(player);
	}
	
	public void store(LinkedList<Player> p) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("BCCIPlayer.txt"));
			String str = "";
			for(int i=0 ; i<p.size() ; i++) {
				str += p.get(i)+"\n"; 
			}
			bw.write(str);
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
