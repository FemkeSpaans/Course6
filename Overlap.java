package Afvink6;

import java.io.*;
import java.util.ArrayList;

public class Overlap {

    public static void main(String[] args) throws IOException {

        ArrayList<String> seqs = new ArrayList<>();
        ArrayList<String> headers = new ArrayList<>();

        String file_name = "Rosalind.txt";
        BufferedReader file_reader = new BufferedReader(new FileReader(file_name));
        String line;
        while ((line = file_reader.readLine()) != null) {
            if (line.startsWith(">")) {
                headers.add(line);
            } else {
                seqs.add(line);
            }

        }
        System.out.println(seqs);
        System.out.println("original sequences above");

        ArrayList<String> overlap = new ArrayList<>();

        file_reader.close();
        for (String seq1 : seqs) {
            for (String seq2 : seqs){
                if (seq1.substring(4, 6).equals(seq2.substring(0, 2))){
                    overlap.add(seq1);
                }
            }
        }
        System.out.println(overlap);

    }
}

