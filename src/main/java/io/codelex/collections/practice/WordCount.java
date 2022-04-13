package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);

        int numOfLines = lines.size();
        int numOfWords = 0;
        int numOfCharacters = 0;

        for (String line : lines) {
            String[] words = line.replace("'", " ").split("\\s+");
            numOfWords = numOfWords + words.length;
        }
        for (String line : lines) {
            numOfCharacters = numOfCharacters + line.length();
        }
        System.out.println("Lines = " + numOfLines);
        System.out.println("Words = " + numOfWords);
        System.out.println("Chars = " + numOfCharacters);
    }
}
