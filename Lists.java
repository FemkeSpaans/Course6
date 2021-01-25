package Afvink3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

/**
 * @author Femke Spaans
 * <p>
 * Write an application which opens a file,
 * give the user a choice of a linkedlist or an arraylist
 * put the chromosomes of said file into the chosen list
 * and pair the genes which are found on those chromosomes to said chromosomes
 * chromosomes are [6] genes are [1]
 */
public class Lists {

    public static void main(String[] args) throws IOException {
        array_or_linked();

    }

    public static void array_or_linked() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick either Arraylist or Linkedlist to check");
        String kind_of_list = scanner.nextLine();
        if (kind_of_list.equals("arraylist")) {
            arraylist();
        } else if (kind_of_list.equals("linkedlist")) {
            linkedlist();
        } else {
            System.out.println("You have not entered a correct list");
        }
    }

    public static void arraylist() {

        long start_time = System.currentTimeMillis();

        ArrayList<ArrayList<String>> list_genes = new ArrayList<>();

        try {
            ArrayList<String> file = new ArrayList<>();
            BufferedReader buffered_reader = new BufferedReader(new FileReader("C:/Users/FSpaa/OneDrive/Documenten/Homo_sapiens.gene_info"));
            String line;
            buffered_reader.readLine(); //
            while ((line = buffered_reader.readLine()) != null) {
                String[] temp = line.split("\t");
                if (!file.contains(temp[6])) {
                    file.add(temp[6]);
                }
                if (file.size() != list_genes.size()) {
                    list_genes.add(new ArrayList<>());
                }
                int index = file.indexOf(temp[6]);
                list_genes.get(index).add(temp[7]);
            }
            long end_time = System.currentTimeMillis();
            System.out.println("Creating an Array list takes " + (end_time - start_time) + " milliseconds");
            System.out.println(list_genes);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void linkedlist() throws IOException {

        long start_time = System.currentTimeMillis();

        LinkedList<LinkedList<String>> list_genes = new LinkedList();

        try {
            LinkedList<String> file = new LinkedList();
            BufferedReader buffered_reader = new BufferedReader(new FileReader("C:/Users/FSpaa/OneDrive/Documenten/Homo_sapiens.gene_info"));
            String line;
            buffered_reader.readLine(); //
            while ((line = buffered_reader.readLine()) != null) {
                String[] temp = line.split("\t");
                if (!file.contains(temp[6])) {
                    file.add(temp[6]);
                }
                if (file.size() != list_genes.size()) {
                    list_genes.add(new LinkedList<>());
                }
                int index = file.indexOf(temp[6]);
                list_genes.get(index).add(temp[7]);
            }
            long end_time = System.currentTimeMillis();
            System.out.println("Creating a Linked list takes " + (end_time - start_time) + " milliseconds");
            System.out.println(list_genes);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
