
/**
 * Write a description of class Coursework1 here.
 * 
 * @author Ricardo Pedrosa 
 * @version 1.0
 */
public class Coursework1 {
    
    // Display common value between two arrays of integers
    public static void displayCommon(int[] a, int[] b) {
        String common = "";
        for(int elem_a : a) {
            for(int elem_b : b) {
                if(elem_a == elem_b) common += elem_a + " ";
            }
        }
        System.out.print(common);
    }
    
    public static void displayNonCommon(int[] base, int[] compare) {
        String noncommon = "";
        for(int elem_base : base) {
            int count = 0;
            for(int elem_compare : compare) {                
                if(elem_base == elem_compare) count++;
            }
            if(count == 0) noncommon += elem_base + " "; 
        }
        System.out.print(noncommon);
    }
    
    public static void displayElements(int[] arr) {
        for(int elem : arr) System.out.print(elem + " ");
    }
    
    
    public static void main(String[] args) {
        int[] set1 = {2, 5, 6, 8, 9};
        int[] set2 = {3, 5, 7, 8, 10};
        //displayCommon(set1, set2);
        displayNonCommon(set2, set1);
        //displayElements(set1);
    }
}
