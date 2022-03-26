package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
     Create the function that accepts an integer array ‘arr’, its length and two
     integer variables ‘num’ and ‘diff’. Implement this function to find and return
     the number of elements of ‘arr’ having an absolute difference of less than or equal
     to ‘diff’ with ‘num’. Note: In case there is no element in ‘arr’ whose absolute difference
     with ‘num’ is less than or equal to ‘diff’, return -1.

     Input Format
     size of array input array two integers num and diff

     Constraints
     1

     Output Format
     print count of elements of ‘arr’ having absolute difference of less than or equal to ‘diff’

     Sample Input 0
     6
     12 3 14 56 77 13
     13
     2

     Sample Output 0
     3
	 */
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }
    int num = sc.nextInt();
    int diff = sc.nextInt();
        System.out.println(absoluteDiff(arr,size,num,diff));
    }
    public static int absoluteDiff(int[] arr,int size,int num,int diff){
        int count = 0;
        for(int i=0;i< arr.length-1;i++){
            if((arr[i]-num)<=diff){
                count++;
            }
        }
        return count;
    }
}
