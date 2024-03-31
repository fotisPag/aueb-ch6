package gr.aueb.cf.ch6;

/*
* Ορίζει και εκτυπώνει ένα δισδιάστατο πίνακα
*
* @author fotisPag
* */
public class ArrayTwoDimensional {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2},{3, 4}};//unsized initialiazation
        int[][] array2 = new int[5][];
        array2[0] = new int [2];
        array2[1] = new int [3];
        array2[2] = new int [1];
        array2[3] = new int [5];
        array2[4] = new int [7];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
//foreach
        for (int[] row: array1){
            for (int element : row){
                System.out.print (element + " ");
            }
            System.out.println();
        }

    }
}
