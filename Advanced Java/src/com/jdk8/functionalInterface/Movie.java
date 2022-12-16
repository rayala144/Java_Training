package com.jdk8.functionalInterface;

public class Movie {
	
	private int releaseYear;
	private String movieName;
	private String leadName;
	
	public int getReleaseYear() {
		return releaseYear;
	}
	public String getMovieName() {
		return movieName;
	}
	public String getActorName() {
		return leadName;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setActorName(String leadName) {
		this.leadName = leadName;
	}
	
	
}


