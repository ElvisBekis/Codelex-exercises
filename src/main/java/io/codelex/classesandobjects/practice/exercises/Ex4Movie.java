package io.codelex.classesandobjects.practice.exercises;

public class Ex4Movie {

    String title;
    String studio;
    String rating;

    public Ex4Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Ex4Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public Ex4Movie[] getPg(Ex4Movie[] movies) {
        Ex4Movie[] pgMovies = new Ex4Movie[movies.length];

        int index = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("PG")) {
                pgMovies[index] = movies[i];
                index++;
            }
        }
        return pgMovies;
    }

    Ex4Movie movie = new Ex4Movie("Casino Royale", "Eon Productions", "PG13");
    Ex4Movie movie2 = new Ex4Movie("Glass", "Buena Vista International", "PG13");
    Ex4Movie movie3 = new Ex4Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG13");
}
