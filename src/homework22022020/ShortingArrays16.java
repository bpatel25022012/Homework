package homework22022020;

import java.util.Arrays;

public class ShortingArrays16 {
    /*
 Write a Java program to sort a numeric array and a string array.
 */
    public static void main(String[] args) {//main method

        // calling user define method through object

        ShortingArrays16 sa = new ShortingArrays16();
        sa.arrayString();
    }


    public void arrayString() {

        // declaration of int array and string

        int[] arrays = {1888, 1895, 1865, 1700, 1600, 1500, 1650};//numeric

        String[] arrays1 = {
                "London", "Birmingham", "Surrey", "Coventry", "Sheffield", "Derby", "Exter"}; //alphabety

        // printing statement for sorting out arrays

        System.out.println("Original numeric array : " + Arrays.toString(arrays));
        Arrays.sort(arrays);
        System.out.println("Sorted numeric array : " + Arrays.toString(arrays));

        System.out.println("Original string array : " + Arrays.toString(arrays1));
        Arrays.sort(arrays1);
        System.out.println("Sorted string array : " + Arrays.toString(arrays1));


    }
}



