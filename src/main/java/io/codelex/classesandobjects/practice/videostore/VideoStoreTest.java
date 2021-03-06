package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    static VideoStore videoStore = new VideoStore();
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);


        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to check list of movies in store");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    videoStore.listInventory();
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            scanner.nextLine();
            System.out.println("Enter movie name");
            String movieName = scanner.nextLine();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            videoStore.addVideo(movieName);
            videoStore.receiveRating(movieName, rating);

        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name you want to rent");
        scanner.nextLine();
        String movieName = scanner.nextLine();
        videoStore.doCheckout(movieName);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie name you want to return");
        scanner.nextLine();
        String movieName = scanner.nextLine();
        videoStore.doReturn(movieName);
    }
}
