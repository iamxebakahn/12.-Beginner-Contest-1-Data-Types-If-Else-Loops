
/*Problem Description

Given an integer A, determine the count of perfect square numbers that are within the range 1 to A.

Note: If a number can be expressed as the product of an integer multiplied by itself, it is considered a perfect square.
For example, if A = 15 then 1, 4 and 9 are perfect squares.


Problem Constraints

1 <= A <= 10000


Input Format

The Only line consists of an Integer, A.


Output Format

Print the Integer, representing the count of perfect square numbers that are within the range 1 to A.


Example Input

Input 1:
A = 15
Input 2:
A = 6


Example Output

Output 1:
3
Output 2:
2


Example Explanation

Explanation 1:
Perfect squares less than or equal to 15 are 1, 4 and 9.
Explanation 2:
Perfect squares less than or equal to 6 are 1 and 4.
 */

 import java.util.*;

public class Q1_Beginner_Contest_1_Data_Types,_If-Else_&_Loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int count = 0;

        for (int i = 1; i * i <= A; i++) {
            count++;
        }

        System.out.println(count);
    }
}