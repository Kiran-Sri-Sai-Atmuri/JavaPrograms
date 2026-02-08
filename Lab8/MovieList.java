package javaLab.Lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class MovieList {

	
	LinkedList<MovieInfo> mi = new LinkedList<>();
	
	public void add(String movie_Name,String hero_Name,
			String director_Name,int release_Date,
			float gross_Collections) {
		MovieInfo m = new MovieInfo(movie_Name, hero_Name, director_Name, release_Date, gross_Collections);
		mi.add(m);
				
	}
	
	public void serach(String movie_Name) {
		for(MovieInfo m : mi) 
			if(m.movie_Name.equalsIgnoreCase(movie_Name))
				System.out.println(m);
		
	}
	
	public void delete(String movie_Name) {
		for(MovieInfo m : mi) 
			if(m.movie_Name.equalsIgnoreCase(movie_Name))
				mi.remove(m);
		
	}
	
	public void sort() {
		
		LinkedList<MovieInfo> l = new LinkedList<>(mi);
		for(int i=0;i<l.size()-1;i++) {
			for(int j=i+1;j<l.size();j++) {
				if(l.get(i).gross_Collections > l.get(j).gross_Collections) {
					
					MovieInfo temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
				}
			}
		}
		
		for(MovieInfo mio : l)
			System.out.println(mio);
		
		store(l);
	}
	
	public void store(LinkedList<MovieInfo> l) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("movie.txt"));
			String str = "";
			for(int i=0 ; i<l.size() ; i++) {
				str += l.get(i)+"\n"; 
			}
			bw.write(str);
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
