package Afvink6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Overlap1 {
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
        StringBuilder overlap = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < seqs.size(); i++) {
            for (int j = 0; j < seqs.size(); j++) {
                String temp_i = seqs.get(i);
                String temp_j = seqs.get(j);
                for (int k = 0; k < temp_i.length(); k++) {
                    if (temp_i.length() / 2 < temp_i.length() - k) {
                        char pos_i = temp_i.charAt(temp_i.length()/2 + k);
                        char pos_j = temp_j.charAt(k);
                        if (pos_i == pos_j) {
                            counter++;
                        }
                    }
                }
                if (!headers.get(i).equals(headers.get(j))&& counter>1) {
                    overlap.append(headers.get(i)).append(headers.get(j)).append("\n");
                }
                counter = 0;
            }
        }
        System.out.println(overlap.toString());
    }
}
