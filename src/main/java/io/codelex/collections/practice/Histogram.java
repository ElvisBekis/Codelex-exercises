package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {

        printHistogram(fillBins());
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static int[] getIntArray(String scores) {
        String[] splitArray = scores.split("\\s+");
        int[] intArray = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            intArray[i] = Integer.parseInt(splitArray[i]);
        }
        return intArray;
    }

    private static int[] fillBins() throws URISyntaxException, IOException {
        final String scores = fileContent();
        final int[] intScores = getIntArray(scores);
        final int[] bins = new int[11];
        for (int intScore : intScores) {
            if (intScore == 100) {
                ++bins[10];
            } else {
                ++bins[intScore / 10];
            }
        }
        return bins;
    }

    private static void printHistogram(int[] bins) {
        for (int i = 0; i < bins.length; ++i) {
            if (i != 10) {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            } else {
                System.out.printf("%5d: ", 100);
            }
            for (int itemNo = 0; itemNo < bins[i]; ++itemNo) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
