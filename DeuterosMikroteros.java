package gr.aueb.cf.ch6;

public class DeuterosMikroteros {
    public static void main(String[] args) {
        int[] array1 = {1,2, 3, 4, 5};
        int minValue = Integer.MAX_VALUE;
        int minValue2 = Integer.MAX_VALUE;
        int minPosition = Integer.MAX_VALUE;
        int secondMinPosition = Integer.MAX_VALUE;
        int hello;

        for (int i = 0; i < array1.length; i++){
            if (array1[i] < minValue){
                minValue2 = minValue;
                secondMinPosition = minPosition;
                minValue = array1[i];
                minPosition = i;
            }else if (array1[i] < minValue2 && array1[i] != minValue2) {
                minValue2 = array1[i];
                secondMinPosition = i;
            }
        }
        System.out.println("Ο μικρότερος αριθμός είναι ο " + minValue + " και βρίσκεται στη θέση " + minPosition);
        System.out.println("Ο δεύτερος μικρότερος αριθμός είναι ο " + minValue2 + " και βρίσκεται στη θέση " + secondMinPosition);
    }
}
