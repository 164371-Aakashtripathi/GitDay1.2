package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class Movie_DetailsList {
	public static void main(String[] args) {

		Set<Movie_Details> Movies = new TreeSet<Movie_Details>();

		Movie_Details Movies1 = new Movie_Details("mnbgh","vgds","cssnhj","sbvjht");
		Movie_Details Movies2 = new Movie_Details("dsnbkhg","mhgygsd","ffsx","shuy");
		Movie_Details Movies3 = new Movie_Details("cankhgksa","csadytiuf ","csa,jy7y", "Mayank");
		Movie_Details Movies4 = new Movie_Details("hdkuh","khgytcqs","gkgdfd", "Ashish");
		
		Movies.add(Movies1);
		Movies.add(Movies2);
		Movies.add(Movies3);
		Movies.add(Movies4);
	

		for (Movie_Details per : Movies)
			per.toString();

	}
}
