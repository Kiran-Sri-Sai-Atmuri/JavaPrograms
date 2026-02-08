package javaLab.Lab8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DemoMovie {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MovieList ml = new MovieList();
		try {
			BufferedReader br = new BufferedReader(new FileReader("movie.txt"));
			String st = "";
			while((st = br.readLine())!=null) {
				String[] str = st.split(",");
				String movie_Name = str[0];
				String hero_Name = str[1];
				String director_Name = str[2];
				int release_Date = Integer.parseInt(str[3]); 
				float gross_Collections = Float.parseFloat(str[4]);
				ml.add(movie_Name, hero_Name, director_Name, release_Date, gross_Collections);
			}
			br.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		while(true) {
			System.out.println("Enter: \n1 to add\n2 to search\n3 to delete\n4 to sort\n5 to exit");
			System.out.print("Enter your choice : ");
			int choice=s.nextInt();
			s.nextLine();
			switch(choice) {
			case 1:
				System.out.print("Enter movie_Name : ");
				String movie_Name = s.nextLine();
				
				System.out.print("Enter hero_name : ");
				String hero_Name = s.nextLine();
				
				System.out.print("Enter director_Name : ");
				String director_Name = s.nextLine();
				
				System.out.print("Enter release date : ");
				int release_Date = s.nextInt();
				
				System.out.print("Enter gross_Collections : ");
				float gross_Collections = s.nextFloat();
				
				ml.add(movie_Name, hero_Name, director_Name, release_Date, gross_Collections);
				System.out.println("Added Successfully");
				break;
			case 2:
				System.out.print("Enter movie_Name");
				String movie_Name2 = s.nextLine();
				
				ml.serach(movie_Name2);
				
				break;
			case 3:
				System.out.print("Enter movie_Name");
				String movie_Name3 = s.nextLine();
				
				ml.delete(movie_Name3);
				break;
				
			case 4:
				ml.sort();
				break;
			case 5:
				System.out.println("చదువుకోరా ముందు తరువాతా సినిమాలు చూసుకోవచ్చు");
				System.exit(1);
			default:
				System.out.println("Invalid choice number");
			}
		}

	}

}
