
/*Problem Description

You are given marks of a student as input. You have to assign Grade to student based on marks

If marks lie in range 80 to 100, then print "Grade: A"

If marks lie in range 50 to 79, then print "Grade: B"

If marks lie in range 25 to 49, then print "Grade: C"

If marks lie in range 0 to 24, then print "Grade: D"

For any other marks, print "Invalid Marking"



Problem Constraints

-1000 <= marks <= 1000


Input Format

First line of input is integer marks.


Output Format

If marks are valid, print "Grade: X" according to marks.
Otherwise print "Invalid Marking".


Example Input

Input 1:
99
Input 2:
-10


Example Output

Output 1:
Grade: A
Output 2:
Invalid Marking


Example Explanation

Explanation 1:
Since marks lie in range 80 to 100, so we print "Grade: A".
Explanation 2:
Since marks do not lie in range 0 to 100, so we print "Invalid Marking".
 */

import java.lang.*;
import java.util.*;

public class Q2_Beginner_Contest_1_Data_Types,_If-Else_&_Loops{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if (N>=80 & N<=100)
            System.out.print("Grade: A");
        else if(N>=50 & N<=79)
            System.out.print("Grade: B");
        else if(N>=25 & N<=49)
            System.out.print("Grade: C");
        else if(N<=24 && N>=0)
            System.out.print("Grade: D");
        else
            System.out.print("Invalid Marking");
        
    }
}