package com.core_java;

class Movie {
    String name;
    String language;
    String genre;
    double rating;

    Movie(String name, String language, String genre, double rating) {
        this.name = name;
        this.language = language;
        this.genre = genre;
        
        this.rating = rating;
    }

    void displayMovieInfo() {
        System.out.println("Movie: " + name);
        System.out.println("Language: " + language);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + "/5");
    }
}
    public class Movies{
    public static void main(String[] args) {
        Movie m = new Movie("KGF", "Kannada", "Action", 4.9);
        m.displayMovieInfo();
    }
}




	
