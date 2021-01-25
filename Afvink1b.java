package Afvink1;

import java.util.ArrayList;
import java.util.Random;

public class Afvink1b {

    public static void main(String[] args) {

        Random rand = new Random(); //instance of random class
        ArrayList<Integer> array_numlist = new ArrayList<Integer>();
        for(int i = 0; i < 100000; i++){
            int int_random = rand.nextInt(1000000000);
            array_numlist.add(int_random);
        }
//        System.out.println(array_numlist);
//        long startTime = System.nanoTime(); // checking time
//        for(int i=0;i<array_numlist.size();++i){ // start insertion sort
//            int j = i;
//            while(j > 0 && array_numlist.get(j - 1) > array_numlist.get(j)){
//
//                int key = array_numlist.get(j);
//                array_numlist.set(j, array_numlist.get(j - 1));
//                array_numlist.set(j - 1, key);
//                j = j-1;
//            }
//        }
//        long endTime = System.nanoTime();
//        long timeElapsed = endTime - startTime;
//        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
//        System.out.println(array_numlist);

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        long startTime = System.nanoTime();
        int i, j, tijdelijk; // start bubblesort
        for (j = 0; j < array_numlist.size(); j++) {
            for (i = 1; i < array_numlist.size() - j; i++) {
                if (array_numlist.get(i - 1) > array_numlist.get(i)) {
                    tijdelijk = array_numlist.get(i);
                    array_numlist.set(i, array_numlist.get(i - 1));
                    array_numlist.set(i - 1, tijdelijk);
                }
            }
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
        //System.out.println(array_numlist);
    }
}

