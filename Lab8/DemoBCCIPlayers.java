package javaLab.Lab8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DemoBCCIPlayers {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BCCIPlayersList player = new BCCIPlayersList();
		try {
			BufferedReader br = new BufferedReader(new FileReader("BCCIPlayer.txt"));
			String st = "";
			while((st = br.readLine())!=null) {
				String[] str = st.split(",");
				String playerName = str[0];
				int totalRuns = Integer.parseInt(str[1]);
				float average = Float.parseFloat(str[2]);
				player.add(playerName,totalRuns, average);
			}
			br.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println(" --- Enter --- \n1 to add\n2 to search\n3 to remove\n4 to sort and store\n5 to exit : ");
			System.out.print("Enter your choice : ");
			int choice = s.nextInt();
			s.nextLine();
			switch(choice) {
			case 1 :
				
				System.out.print("Enter playerName : ");
				String playerName = s.nextLine();
				
				System.out.print("Enter totalRuns : ");
				int totalRuns = s.nextInt(); 
				s.nextLine();
				
				System.out.print("Enter average : ");
				float average = s.nextFloat();
				s.nextLine();
				
				player.add(playerName,totalRuns,average);
				
				System.out.println("Added Successfully");
				
				break;
			case 2:
				System.out.print("Enter playerName : ");
				String playerName1 = s.nextLine();
				
				player.serach(playerName1);
				
				break;
			case 3 :
				
				System.out.print("Enter playerName1 to remove : ");
				
				String playerName3 = s.nextLine();
				
				player.delete(playerName3);
				
				System.out.println("Removed Successfully");
				
				break;
			case 4:
				player.sort();
				break;
			case 5:
				System.exit(1);
			default : 
				System.out.println("Invalid Request");
				
			}
			

		}
		
	}

}
