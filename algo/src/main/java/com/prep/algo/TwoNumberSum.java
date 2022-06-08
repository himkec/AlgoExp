package com.prep.algo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
  public static void main(String[] args){
    // Write a function that takes non empty integer array and an int targetSum
    // Return all two numbers who's sum equal to target sum
    int[] array = {3,5,-4,8,11,1,-1,6};
    int targetSum = 10;
    System.out.println(Arrays.toString(twoNumberSum(array,targetSum)));
  }

  public static int[] twoNumberSum(int[] array, int targetSum) {
    Set<Integer> set = new HashSet<>();
    for (int num : array){
      int potentialMatch = targetSum - num;
      if (set.contains(num)){
        return new int[] {potentialMatch, num};
      }
      else{
        set.add(potentialMatch);
      }
    }
    return new int[0];
  }
}
