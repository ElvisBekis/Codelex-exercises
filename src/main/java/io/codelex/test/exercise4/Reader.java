package io.codelex.test.exercise4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reader {

    public Reader() throws FileNotFoundException {
    }

    File file = new File("C:\\Users\\zebie\\IdeaProjects\\Codelex Homework\\Codelex-exercises\\src\\main\\java\\io\\codelex\\test\\Test.md");

    BufferedReader br = new BufferedReader(new FileReader(file));

    String st;

    
}
