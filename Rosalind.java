package Afvink6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Rosalind {

    //static HashMap<String, String> codes = new HashMap<>();


    public static void main(String[] args) throws FileNotFoundException {

        int colums = 2;
        int rows = 5;

        String[][] codes = new String[colums][rows] ;

        codes[0][0] = ">Rosalind_0498";
        codes[1][0] = "AAATAAA";

        codes[0][1] = ">Rosalind_2391";
        codes[1][1] = "AAATTTT";

        codes[0][2] = ">Rosalind_2323";
        codes[1][2] = "TTTTCCC";

        codes[0][3] = ">Rosalind_0442";
        codes[1][3] = "AAATCCC";

        codes[0][4] = ">Rosalind_5013";
        codes[1][4] = "GGGTGGG";

        System.out.println(Arrays.deepToString(codes));

//        for (String row : rows) {
//            System.out.println(row);
//        }
//            if (row[-3]==row[0:3]){
//
//            }
        }

//        if (codes[1][0][-3] == codes[1][1][0:3]){
//
//        }

//
//        codes.put(">Rosalind_0498", "AAATAAA");
//        codes.put(">Rosalind_2391", "AAATTTT");
//        codes.put(">Rosalind_2323", "TTTTCCC");
//        codes.put(">Rosalind_0442", "AAATCCC");
//        codes.put(">Rosalind_5013", "GGGTGGG");
//
//        //System.out.println(codes);
//
//        String[] values = codes.values().toArray(new String[codes.size()]);
//        System.out.println(values);
//        for (int i = 0; i < values.length; i++) {
//            for (int j = i+1; j<values.length; j++) {
//                if (values[i].equals(values[j])) {
//                    System.out.println(values);
//                }
//            }
//        }
//
//        for (String i : codes.values()) {
//            if (i[-3]==[0:3]){}
//        }

//        ArrayList<ArrayList<String>> graph = new ArrayList<ArrayList<String>>();
//
//        Scanner readScan = new Scanner(new File("Rosalind.txt"));
//
//        System.out.println(readScan);

//        String vertic = readScan.nextLine();
//        String edges = readScan.nextLine();
//
//        System.out.println("There are " + vertic +" vertic and " + edges + " edges.");
//        for(int i=0; i<=vertic.length(); i++){
//            ArrayList<String> temp = new ArrayList<String>();
//            graph.add(temp);
//        }
//        while(readScan.hasNext()) {
//
//            String v1 = readScan.nextLine();
//            String v2 = readScan.nextLine();
//
//            graph.get(v1).add(v2);
//            graph.get(v2).add(v1);
//        }
//
//        readScan.close();
//
//        System.out.println();
//        for(int i=1; i<=vertic.length(); i++){
//            System.out.print(graph.get(i).size() +" ");
//        }

//        codes.put(">Rosalind_0498", "AAATAAA");
//        codes.put(">Rosalind_2391", "AAATTTT");
//        codes.put(">Rosalind_2323", "TTTTCCC");
//        codes.put(">Rosalind_0442", "AAATCCC");
//        codes.put(">Rosalind_5013", "GGGTGGG");


    }

