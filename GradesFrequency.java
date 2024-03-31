package gr.aueb.cf.ch6;


/*Ορίζει ένα πίνακα με τους βαθμούς κάθε μαθητή.
* Στη συνέχεια εμφανίζει τη συχνότητα κάθε βαθμού
* με τη χρήση της for-each
*
* @author fotisPag
* */
public class GradesFrequency {
    public static void main(String[] args) {
        int[] grades = {1, 2, 5, 3, 5, 4, 2, 3, 1, 1, 3, 0, 5};
        int[] count = new int[6];

//        for (int i = 0; i < grades.length; i++) {
//            count[grades[i]]++;
//        }
        //foreach
        for (int grade : grades){
            count[grade]++;
        }

        for (int i = 0; i < count.length; i++){
            System.out.printf("Τα αποτελέσματτα είναι \n%d - %.2%%\n", i, (double) count[i] / grades.length * 100);
        }
    }
}
