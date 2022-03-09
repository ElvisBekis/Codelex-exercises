package io.codelex.classesandobjects.practice.exercises;

public class Ex_4_Movie {

    String title;
    String studio;
    String rating;

    public Ex_4_Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Ex_4_Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public Ex_4_Movie[] getPg (Ex_4_Movie[] movies) {
        Ex_4_Movie[] pgMovies = new Ex_4_Movie[movies.length];

        int index = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("PG")) {
                pgMovies[index] = movies[i];
                index++;
            }
        }
        return pgMovies;
    }

    Ex_4_Movie movie = new Ex_4_Movie("Casino Royale", "Eon Productions", "PG13");
    Ex_4_Movie movie2 = new Ex_4_Movie("Glass", "Buena Vista International", "PG13");
    Ex_4_Movie movie3 = new Ex_4_Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG13");
}
