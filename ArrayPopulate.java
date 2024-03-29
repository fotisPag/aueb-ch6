package gr.aueb.cf.ch6;

import java.util.Scanner;
public class ArrayPopulate {

    public static void main(String[] args) {
        //aαρχικοποίηση - populate
        Scanner in = new Scanner(System.in);
        int[] ages = new int[5];

        for (int i=0; i < ages.length; i++){
            System.out.println("Δώστε τον αριθμό για την θέση " + (i + 1));
            ages[i] = in.nextInt();
        }


//        int[] ages = {19, 20, 21, 22, 23};

//        int[] ages = new int[5];
//        ages[0] = 19;
//        ages[1] = 20;
//        ages[2] = 21;
//        ages[3] = 22;
//        ages[4] = 23;


    //εκτύπωση των στοιχείων του πίνακα
    for (int i = 0; i < ages.length; i++) {
        System.out.print(ages[i] + " ");
    }
        }

}
