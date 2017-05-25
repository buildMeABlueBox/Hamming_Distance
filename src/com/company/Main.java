package com.company;

/**
 * Created by Abhijit on 5/23/2017.
 */
public class Main {
    /*
    The Hamming distance between two integers is the number of
    positions at which the corresponding bits are different.
    Given two integers x and y, calculate the Hamming distance.

                        Explanation:
                        1   (0 0 0 1)
                        4   (0 1 0 0)
                               ↑   ↑

       Hamming Distance for example above = 2

    */

    /*Runtime: O(1) - constant time since it
      is finding hamming distance of integers which it is bound by
      32 bits.. which would mean O(1) runtime.
     */
    public int hammingDistance(int x, int y) {
        int xor = x^y;
        int count = 0;

        while (xor != 0){
            if( (xor & 1) == 1){
                count++;
            }
            xor = xor >> 1;
        }
        return count;
    }
}