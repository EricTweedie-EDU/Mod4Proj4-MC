import java.util.LinkedList;
import java.util.Scanner;

/** Class NumList that is creating a Linked List from user input.
      * numberList A linked list of integer values
      * userinput User defined input for the list
      * numberListSize The size of the numberList, initially set at 0
      */
public class NumList {
     private LinkedList<Integer> numberList = new LinkedList<>(); // reusing the Linked List collection to create a new linked list
     private Scanner userinput = new Scanner(System.in); // reusing the scanner collection to get the user input
     private int numberListSize = 0;
     
     /** Method addNumbersToList used to gather user input,
           * 1. To get total number of entries for the list
           * 2. To collect the data entries as integers
           */
     public void addNumbersToList() {
          
          System.out.println("Enter the number of elements you want to add to the list: ");
          numberListSize = userinput.nextInt(); // stores the number from input to determine total number of entries, also reuses the scanner collection to go to the next input.
          
          for (int i = 0; i < numberListSize; i++) {  // using the number from the first input to get total # of elements to be added to the list.
               System.out.print("Enter number " + (i + 1) + ": ");
               numberList.add(userinput.nextInt()); // reuses the Linked List collection to add the input to the list.
               numberList.sort(null); // sorting the list in ascending order, also reuses the Linked List collection to sort the list.
          }
     }
     
     /** Method displayNumbers used to print the sorted list */
     public void displayNumbers() {
          
          System.out.println("The sorted list is: ");
          for (Integer number : numberList) {
               System.out.print(number + " ");
          }
     }
}