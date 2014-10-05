
/**
 * Write a description of class Coursework1 here.
 * 
 * @author Ricardo Pedrosa 
 * @version 1.0
 */
public class Coursework1 {
    
    // Display common value between two arrays ig integers
    public static void displayCommon(int[] a, int[] b) {
        String common = "";
        for(int elem_a : a) {
            for(int elem_b : b) {
                if(elem_a == elem_b) common += elem_a + " ";
            }
        }
        System.out.print("Common data is: " + common);
    }
    
    public static void displayElements(int[] arr) {
        for(int elem : arr) System.out.print(elem + " ");
    }
    
    
    public static void main(String[] args) {
        int[] set1 = {2, 5, 6, 8, 9};
        int[] set2 = {3, 5, 7, 8, 10};
        //displayCommon(set1, set2);
        displayElements(set1);
    }
}
