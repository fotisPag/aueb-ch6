package gr.aueb.cf.ch6;

public class ArraySearchAndReplace {
    public static void main(String[] args) {
        int[] marks = {5, 3, 1, 8, 6, 10};
        boolean found = false;

        for (int i = 0; i < marks.length; i++){
            if(marks[i] == 9){
                found = true;
                marks[i] = 10;
            }
        }
        System.out.printf("Η αντικατάσταση %s έγινε επιτυχώς", (found) ? "" : "δεν" );
    }

}
