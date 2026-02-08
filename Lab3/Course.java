

package javaLab.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Course {

	
	private String courseName;
	private int courseId;
	private float courseDuration;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public float getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(float courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	
	
	@Override
	public String toString() {
		return "[courseName=" + courseName + ", courseId=" + courseId + ", courseDuration=" + courseDuration
				+ "]";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Course[] course = new Course[5];
		
		for(int i=0 ; i<5 ; i++) {
			Course cs = new Course();
			System.out.print("Enter "+(i+1)+" couse name : ");
			String name  = sc.nextLine();
			cs.setCourseName(name);
			System.out.print("Enter "+(i+1)+" couse Id : ");
			int id = sc.nextInt();
			cs.setCourseId(id);
			System.out.print("Enter "+(i+1)+" couse Duration : ");
			float duration = sc.nextFloat();
			cs.setCourseDuration(duration);
			course[i] = cs;
			sc.nextLine();
		}
		
		
		for(Course c : course)
			System.out.println(c);
	}
}
