package gr.aueb.cf.ch6;


/*Αναζητά το ελάχιστο στοιχείο ενός πίνακα  */
public class ArraySearchMin {
    public static void main(String[] args) {
        int[] marks = {15, 20, 6, 4, 11, 3, 1};
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int minPosition = -1;
        int maxPosition = - 1;

        for (int i = 0; i < marks.length; i++){
            if (marks[i] < minValue) {
                minValue = marks[i];
                minPosition = i;
            }
        }

        for (int i = 0; i < marks.length; i++){
            if (marks[i] > maxValue) {
                maxValue = marks[i];
                minPosition = i;
            }
        }
        System.out.printf("Minvalue = %d & Minpossition = %d", minValue, minPosition + 1);
        System.out.printf("Maxvalue = %d & Minpossition = %d", maxValue, minPosition + 1);
    }
}
