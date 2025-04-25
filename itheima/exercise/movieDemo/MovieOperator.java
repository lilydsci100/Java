package com.itheima.exercise.movieDemo;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(){} //无参数constructor
    public MovieOperator(Movie[] movies) { //有参数constructor
        this.movies = movies;
    }

    public void printMovies() {
        for (Movie movie : movies) {
            System.out.println("Id: " + movie.getId());
            System.out.println("Name: " + movie.getName());
            System.out.println("Price: " + movie.getPrice());
            System.out.println("-------- ");

        }
    };

    public void searchById(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                System.out.println("Movie info: ");
                System.out.println("Id: " + movie.getId());
                System.out.println("Name: " + movie.getName());
                System.out.println("Price: " + movie.getPrice());
                return;
            }
        }
        System.out.println("Can't find the movie");
    };
}
