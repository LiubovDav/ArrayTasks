package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray303_3_2 {

    public static void main(String[] args) {

        /*
        Write a program that creates an array of integers with a length of 3.
         Assign the values 1, 2, and 3 to the indexes. Print out each array element.
         */

        System.out.println("_______1________");

        int[] arrayFirst = new int[3];

        arrayFirst[0] = 1;
        arrayFirst[1] = 2;
        arrayFirst[2] = 3;
        System.out.println(arrayFirst[0]);
        System.out.println(arrayFirst[1]);
        System.out.println(arrayFirst[2]);


        /*
        Write a program that returns the middle element in an array.
        Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
         */

        System.out.println("_______2________");

        int[] arraySecond = {13, 5, 7, 68, 2};
        System.out.println(arraySecond[2]);



        /*
        Write a program that creates an array of String type and initializes
        it with the strings “red”, “green”, “blue” and “yellow”.
        Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method
        on the new array to verify that the original array was copied.
         */
        System.out.println("________3_______");

        String[] arrayThird = {"red", "green", "blue", "yellow"};
        System.out.println(arrayThird.length);

        String[] newArrayThird = arrayThird.clone();
        System.out.println(Arrays.toString(newArrayThird));

        /*
        Write a program that creates an integer array with 5 elements (i.e., numbers).
         The numbers can be any integers.  Print out the value at the first index and
         the last index using length - 1 as the index. Now try printing the value at index = length
         ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced.
          Now try to assign a value to the array index 5. You should get the same type of exception.
         */

        System.out.println("_______4________");

        int[] arrayForth = {130, 55, 47, 8, 5};
        System.out.println(arrayForth[0]);
        System.out.println(arrayForth[arrayForth.length - 1]);
//       System.out.println(arrayForth[arrayForth.length]); ArrayIndexOutOfBoundsException
//       System.out.println(arrayForth[5]);

        /*
         Write a program where you create an integer array with a length of 5.
         Loop through the array and assign the value of the loop control variable (e.g., i)
         to the corresponding index in the array.
         */

        System.out.println("_______5________");

        int[] arrayFifth = new int[5];

        for (int i = 0; i < arrayFifth.length; i++) {
            arrayFifth[i] = i;
        }

//        for (int i = 0; i < arrayFifth.length; i++) {
//            System.out.println(arrayFifth[i]);
//        }

        for (int arrayFifthElement : arrayFifth) {
            System.out.println(arrayFifthElement);
        }

        /*
        Write a program where you create an integer array of 5 numbers.
        Loop through the array and assign the value of the loop control variable multiplied
        by 2 to the corresponding index in the array.
         */

        System.out.println("_______6________");

        int[] arraySixth = new int[5];

        for (int i = 0; i < arraySixth.length; i++) {
            arraySixth[i] = i * 2;
            System.out.println(arraySixth[i]);
        }

        /*
        Write a program where you create an array of 5 elements.
        Loop through the array and print the value of each element,
        except for the middle (index 2) element.
         */

        System.out.println("_______7________");

        int[] arraySeven = {-12, 23, -32, -1, 323};

        for (int i = 0; i < arraySeven.length; i++) {
            if (i != 2) {
                System.out.println(arraySeven[i]);
            }
        }

        /*
        Write a program that creates a String array of 5 elements and swaps the first
        element with the middle element without creating a new array.
         */

        System.out.println("_______8________");

        String[] arrayEight = new String[5];
        arrayEight[0] = "red";
        arrayEight[1] = "green";
        arrayEight[2] = "blue";
        arrayEight[3] = "yellow";
        arrayEight[4] = "red";

        String oldFirstElement = arrayEight[0];

        arrayEight[0] = arrayEight[2];
        arrayEight[2] = oldFirstElement;
        System.out.println(Arrays.toString(arrayEight));

        /*
        Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        Print the array in ascending order, and print the smallest and the largest element of the array.
        The output will look like the following:
        Array in ascending order: 0, 1, 2, 4, 9, 13
        The smallest number is 0
        The biggest number is 13  */

        System.out.println("_______9________");

        int[] arrayNinth = {4, 2, 9, 13, 1, 0};
        Arrays.sort(arrayNinth);
        System.out.println("Array in ascending order: " + Arrays.toString(arrayNinth));
        System.out.println("The smallest number is " + arrayNinth[0]);
        System.out.println("The biggest number is " + arrayNinth[arrayNinth.length - 1]);

        /*
        Create an array that includes an integer, 3 strings, and 1 double. Print the array.
        */

        System.out.println("________10_______");

        /*
        Write some Java code that asks the user how many favorite things they have.
        Based on their answer, you should create a String array of the correct size.
        Then ask the user to enter the things and store them in the array you created.
        Finally, print out the contents of the array.
        Example
        How many favorite things do you have?
        7
        Enter your thing: phone
        Enter your thing: tv
        Enter your thing: xbox
        Enter your thing: wine
        Enter your thing: beer
        Enter your thing: sofa
        Enter your thing: book
        Your favorite things are:
        phone tv xbox wine beer sofa book
         */

        System.out.println("________11_______");

        Scanner sc = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int number = sc.nextInt();
        String[] arrayOfFavoriteThings = new String[number];
        sc.nextLine();

        for (int i = 0; i < arrayOfFavoriteThings.length; i++) {
            System.out.print("Enter your thing: ");
            arrayOfFavoriteThings[i] = sc.nextLine();
        }

        System.out.println("Your favorite things are:");
//        for (int i = 0; i < arrayOfFavoriteThings.length; i++) {
//            System.out.print(arrayOfFavoriteThings[i] + " ");
//        }

        for (String arrayOfFavoriteThingsElement : arrayOfFavoriteThings) {
            System.out.print(arrayOfFavoriteThingsElement + " ");
        }

    }

}
