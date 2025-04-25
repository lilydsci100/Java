package com.itheima.exercise.movieDemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1,"水月桥", 38.9, 9.8, "徐克", "你猜", "info");
        movies[1] = new Movie(2,"水", 38.9, 9.8, "克", "你猜", "info");
        movies[2] = new Movie(3,"月", 38.9, 9.8, "徐", "你猜", "info");
        movies[3] = new Movie(4,"桥", 38.9, 9.8, "徐克", "你猜", "info");

        MovieOperator operator = new MovieOperator(movies);
        operator.printMovies();
        operator.searchById(3);

        Scanner sc = new Scanner(System.in);
        int command = sc.nextInt();

        while (true) {
            switch (command) {
                case 1:
                    operator.printMovies();
                    break;
                case 2:
                    System.out.println("Enter the movie id: ");
                    int id = sc.nextInt();
                    operator.searchById(id);
                    break;
                default: System.out.println("Invalid command");
            }
        }
    }
}
