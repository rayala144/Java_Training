package com.jdk8.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestMovieLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie();
		m.setMovieName("KGF");// setter method is used to set the value.
		m.setReleaseYear(2022);// getter method is used to get or receive the values.
		m.setActorName("Yash");

		Movie m1 = new Movie();
		m1.setMovieName("Master");
		m1.setReleaseYear(2021);
		m1.setActorName("Vijay");

		Movie m2 = new Movie();
		m2.setMovieName("Baahubali");
		m2.setReleaseYear(2022);
		m2.setActorName("Prabhas");

		Movie m3 = new Movie();
		m3.setMovieName("Beast");
		m3.setReleaseYear(2022);
		m3.setActorName("vijay");

		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(m);
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);

		getAllMovieDetails(movieList, movie -> movie.getReleaseYear() == 2022);
		// getAllMovieDetails(movieList, movie1 -> movie1.getActorName().equalsIgnoreCase("vijay"));

	}

	private static void getAllMovieDetails(List<Movie> movies, Predicate<Movie> moviePredicate) {
		for (Movie movie : movies) {
			if (moviePredicate.test(movie)) {
				System.out.println("Movie Name is:\t" + movie.getMovieName());
			}
		}
	}

//    //no lamda expression implemented here we used old approach it means traditional approach
//    private static void findMovieActor(List<Movie> obj) {
//        for(Movie m3:obj) {
//            if(m3.getActorName().equalsIgnoreCase("vijay")) {
//                System.out.println("Movie name is:\t"+m3.getMovieName());
//            }
//        }
//    }

}
