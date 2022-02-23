package io.codelex.typesandvariables.exercises;

public class Ex_5 {
    public static void main(String[] args) {

        int[] nr = new int[8];
        nr[0] = 1;
        nr[1] = 2;
        nr[2] = 3;
        nr[3] = 4;
        nr[4] = 5;
        nr[5] = 6;
        nr[6] = 7;
        nr[7] = 8;

        String[] courses = new String[8];
        courses[0] = "English III";
        courses[1] = "Precalculus";
        courses[2] = "Music Theory";
        courses[3] = "Biotechnology";
        courses[4] = "Principles of Technology I";
        courses[5] = "Latin II";
        courses[6] = "AP US History";
        courses[7] = "Business Computer Information Systems";

        String[] teachers = new String[8];
        teachers[0] = "Ms. Lapan";
        teachers[1] = "Mrs. Gideon";
        teachers[2] = "Mr. Davis";
        teachers[3] = "Ms. Palmer";
        teachers[4] = "Ms. Garcia";
        teachers[5] = " Mrs. Barnett";
        teachers[6] = "Ms. Johannessen";
        teachers[7] = "Mr. James";


        String rightAlignFormat = "| %1s | %37s | %15s |%n";

        System.out.format("+-------------------------------------------------------------+%n");

        for (int i = 0; i < nr.length; i++) {
            System.out.format(rightAlignFormat, nr[i], courses[i], teachers[i]);
        }
        System.out.format("+-------------------------------------------------------------+%n");
    }
}
