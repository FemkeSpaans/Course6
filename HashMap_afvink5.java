package Afvink5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap_afvink5 {

    static HashMap<String, String> one_letter = new HashMap<>();
    static HashMap<String, String> three_letters = new HashMap<>();
    static HashMap<String, String> name = new HashMap<>();

    public static void main(String[] args) throws IOException {

        Scanner question = new Scanner(System.in);
        System.out.println("Pick one: either an one letter amino acid, a three letter amino acid, or the name of an amino acid");
        String anwser = question.nextLine();

        one_letter.put("A", "Ala, Alanine");
        one_letter.put("R", "Arg, Arginine");
        one_letter.put("N", "Asn, Asparagine");
        one_letter.put("D", "Asp, Aspartic acid");
        one_letter.put("C", "Cys, Cysteine");
        one_letter.put("Q", "Gln, Glutamine");
        one_letter.put("E", "Glu, Glutamic acid");
        one_letter.put("G", "Gly, Glycine");
        one_letter.put("H", "His, Histidine");
        one_letter.put("I", "Ile, Isoleucine");
        one_letter.put("L", "Leu, Leucine");
        one_letter.put("K", "Lys, Lysine");
        one_letter.put("M", "Met, Methionine");
        one_letter.put("F", "Phe, Phenylalanine");
        one_letter.put("P", "Pro, Proline");
        one_letter.put("S", "Ser, Serine");
        one_letter.put("T", "Thr, Threonine");
        one_letter.put("W", "Trp, Tryptophan");
        one_letter.put("Y", "Tyr, Tyrosine");
        one_letter.put("V", "Val, Valine");

        three_letters.put("Ala", "A, Alanine");
        three_letters.put("Arg", "R, Arginine");
        three_letters.put("Asn", "N, Asparagine");
        three_letters.put("Asp", "D, Aspartic acid");
        three_letters.put("Cys", "C, Cysteine");
        three_letters.put("Gln", "Q, Glutamine");
        three_letters.put("Glu", "E, Glutamic acid");
        three_letters.put("Gly", "G, Glycine");
        three_letters.put("His", "H, Histidine");
        three_letters.put("Ile", "I, Isoleucine");
        three_letters.put("Leu", "L, Leucine");
        three_letters.put("Lys", "K, Lysine");
        three_letters.put("Met", "M, Methionine");
        three_letters.put("Phe", "F, Phenylalanine");
        three_letters.put("Pro", "P, Proline");
        three_letters.put("Ser", "S, Serine");
        three_letters.put("Thr", "T, Threonine");
        three_letters.put("Trp", "W, Tryptophan");
        three_letters.put("Tyr", "Y, Tyrosine");
        three_letters.put("Val", "V, Valine");

        name.put("Alanine", "A, Ala");
        name.put("Arginine", "R, Arginine");
        name.put("Asn", "N, Asp");
        name.put("Aspartic acid", "D, Asp");
        name.put("Cysteine", "C, Cys");
        name.put("Glutamine", "Q, Gln");
        name.put("Glutamic acid", "E, Glu");
        name.put("Glycine", "G, Gly");
        name.put("Histidine", "H, His");
        name.put("Isoleucine", "I, Ile");
        name.put("Leucine", "L, Leu");
        name.put("Lysine", "K, Lys");
        name.put("Methionine", "M, Met");
        name.put("Phenylalanine", "F, Phe");
        name.put("Proline", "P, Pro");
        name.put("Serine", "S, Ser");
        name.put("Threonine", "T, Thr");
        name.put("Tryptophan", "W, Trp");
        name.put("Tyrosine", "Y, Tyr");
        name.put("Valine", "V, Val");

        if(one_letter.containsKey(anwser)){
            System.out.println(anwser + " = " + one_letter.get(anwser));
        }
        else if(three_letters.containsKey(anwser)){
            System.out.println(anwser + " = " + three_letters.get(anwser));
        }
        else if(name.containsKey(anwser)){
            System.out.println(anwser + " = " + name.get(anwser));
        }

    }

}
