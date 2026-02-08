package javaLab.Lab8;

public class MovieInfo {
	
	String movie_Name;
	String hero_Name;
	String director_Name;
	int release_Date;
	float gross_Collections;
	
	
	public MovieInfo(String movie_Name, String hero_Name, String director_Name, int release_Date,
			float gross_Collections) {
		super();
		this.movie_Name = movie_Name;
		this.hero_Name = hero_Name;
		this.director_Name = director_Name;
		this.release_Date = release_Date;
		this.gross_Collections = gross_Collections;
	}


	@Override
	public String toString() {
		return movie_Name + "," + hero_Name + "," + director_Name
				+ "," + release_Date + "," + gross_Collections;
	}
	
	
	
	
}
