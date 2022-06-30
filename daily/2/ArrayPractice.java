import java.util.*;
import java.io.*;

/* Instructions

   This file contains stubs (empty methods) for the following methods


   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip

   The stubs will have comments describing what they should do

   Levels:
   Basic:
   Complete these methods:
     - buildRandomArray
     - printArray
     - arraySum
     - firstOccurence 
     - findMaxValue

   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds

   Advanced:
   Complete all the methods
   
   
*/

public class ArrayPractice{

    /*
      Parameters: size - how large the array should be
                  startValue - the value of the first element
		  step - the interval to the next value
      Returns: a new array of integers

      Examples:
      buildIncreasingArray(5,3,2) will return an array
      with the values 3,5,7,9,11 (five values, starting with 3 with a step of 2)
      
    */
    public static int[] buildIncreasingArray(int size, int startValue, int step){
	int[] data = new int[size];

	// loop through each element of the array and
	// assign the appropriate value to each one.

	return data;
    }

    /* Parameters: size - how many elements in the array
                   maxValue - the largest possible random value to use

       Returns: a new array where each element is an integer between 0
       and up to but not including maxValue

    */
    public static int[] buildRandomArray(int size, int maxValue){
	Random r = new Random();
	int[] data = new int[size];

	// your code here

	return data;
    }


    /* Parameters: data - ana rray of ints 

       Returns: nothing

       prints out the array

       Note: data.length stores the length of the array

    */
    public static void printArray(int[] data){
    }
    


    /* Parameters: data - an array of integers
                   value - the value to search for
		   
       Returns: the index (location) of the first occurence of value

       Example: assume the array data has 1,5,2,7,5,8,5,12,19,5
       firstOccurence(data,5) would return 1 since the first
       occurence of the value 5 is at a[1]
    */
    public static int firstOccurence(int[] data, int value){

	// your code here
	
	return 0; // change this
    }
    
    
    
    /* Parameters: data - an array of ints

       Returns: an integer that is equal to the sum of all the elements in the array

       Ex: If the input array has the values 5,2,4,10 the return
       value will be 21 (5+2+4+10)

    */
    public static int arraySum(int[] data){

	// your code here
	
	return 0; // replace this
    }


    /* Parameters: data - an array of integers

       Returns: true if the array is sorted, false otherwise

       That is if every element is < the element to it's right the array is
       sorted.

       An array with values 5,6,10,15 is sorted and one with values
       5,6,10,13,15 isn't

    */
    public static boolean isSorted(int[] data){

	// yourcode here
	
	return true; // replace this 
	
    }

    /* Parameters: data - an array of integers

       Returns: the value of the largest element in the array

    */
    public static int findMaxValue(int[] data){
	int m; // will hold the maximum value;

	// your code here
	
	return m;
    }


    /* Parameters: data - an array of integers

       Returns: the number of odd elements in the array

       Ex: if data holds 5,6,7,8,9,10 the return value will be 3 since
       three of the elements are odd.

    */
    public static int countOdds(int[] data){
	int count;

	// your code here
	// note the % operator is the mod (basically remainder) function
	// in java, You can use that to determine if an integer is odd

	return count;
    }

    /* Parameters: data - an array of integers

       Returns: no return value since this is a void function but you
       will manipulate the values in the array parameter

       This routine will flip all the elements in the array, that is,
       swap all the values.

       If the input array contains 5,8,13,7,27,2
       After the routine, the array will contain 2,27,7,13,8,5

    */
    public static void flip(int[] data){

	// your code here
    }
    
    

    public static void main(String[] args) {

	// remove the comments as you complete each routine
	// and add more lines as you add additional routines.
	
	// int[] data = buildRandomArray(10, 20);
	// int[] data2 = buildincreasingArray(10,5,3);
	// printArray(data);
	// printArray(data2);

	// add calls to show that the methods you write work.
    }
}