import java.util.ArrayList;
import java.util.Arrays; 

public class ALInsertionSort {

    public static void main(String[] args) {
        Integer[] myNumbers = {0, 15, 6, 8, 2, 37};
        ArrayList<Integer> sorted = new ArrayList<>();
        boolean inserted = false;

        System.out.println("Unsorted array: " + Arrays.toString(myNumbers));

       
        sorted.add(myNumbers[0]);

     
        for (int i = 1; i < myNumbers.length; i++) {
            int currentNumber = myNumbers[i];
            inserted = false; 

           
            for (int j = 0; j < sorted.size(); j++) {
              
                if (currentNumber < sorted.get(j)) {
                    sorted.add(j, currentNumber);
                    inserted = true;
                    break; 
                }
            }

           
            if (!inserted) {
                sorted.add(currentNumber);
            }
        }

       

        System.out.println("Sorted ArrayList: " + sorted);

      
        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = sorted.get(i);
        }

      
        System.out.println("Sorted array: " + Arrays.toString(myNumbers));
    }
}