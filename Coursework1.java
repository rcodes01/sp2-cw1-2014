
/**
 * Write a description of class Coursework1 here.
 * 
 * @author Ricardo Pedrosa 
 * @version 1.0
 */

import java.util.Scanner;

public class Coursework1 {
    
    final static int ARRAY_LIMIT_SIZE = 100;
    
    // Display common data between two arrays of integers or number of common data
    public static void displayCommon(int[] a, int[] b, boolean print_count_common) {
        String common = "";
        int count_common = 0;
        for(int elem_a : a) {
            for(int elem_b : b) {
                if(elem_a == elem_b) {
                    common += elem_a + " ";
                    count_common++;
                }
            }
        }
        if (print_count_common) {
            System.out.println(count_common);
        } else {
            if(a.length == 0 || b.length == 0) {
                common = "no common data as one of the arrays is empty";
            }
            System.out.println(common);
        }
    }
   
    
    // Display non common data or empry string
    public static void displayNonCommon(int[] base, int[] compare) {
        
        String noncommon = "";
        
        if(base.length == 0) {
            noncommon = "empty array";
        } else {
            for(int elem_base : base) {
                int count = 0;
                for(int elem_compare : compare) {                
                    if(elem_base == elem_compare) count++;
                }
                if(count == 0) {
                    noncommon += elem_base + " ";
                }
            }
        }
        System.out.println(noncommon);
   }
    
   // Display elements of an array
    public static void displayElements(int[] arr) {
        if(arr.length == 0) {
            System.out.print("empty array");
        }
        for(int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println("");
    }
    
    // Read integers from keboard and save in an array
    public static int[] fillArray(int array_number) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[ARRAY_LIMIT_SIZE];
        int count = 0;
        System.out.print("Enter data array for array " + array_number + ": ");
        int readint = input.nextInt();
        while(readint != 0 && count < ARRAY_LIMIT_SIZE) {
        //for(int i=0; i < ARRAY_MAX_SIZE; i++) {
            arr[count] = readint;
            System.out.print("Enter data array for array " + array_number + ": ");
            readint = input.nextInt();
            count++;
        }
        
        return arr;
    }
      
    
    public static void main(String[] args) {
        int[] set1 = fillArray(1);
        int[] set2 = fillArray(2);
        if (set1.length == 0 && set2.length == 0) {
            System.out.println("Both array are empty");
            System.exit(0);
        }
        System.out.print("Values for array 1: ");
        displayElements(set1);
        System.out.print("Values for array 2: ");
        displayElements(set2);
        System.out.print("Common data is: ");
        displayCommon(set1, set2, false);
        System.out.print("Number of common data is: ");
        displayCommon(set1, set2, true);
        System.out.print("Non-common values for array 1 is: ");
        displayNonCommon(set1, set2);
        System.out.print("Non-common values for array 2 is: ");
        displayNonCommon(set2, set1);
        
    }
}
