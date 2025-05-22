/*Problem Description

You are given the speed of a car S in kilometers per hour (Km/h). Convert this speed into meters per second (m/s) and then prints only the integral (whole number) part of the converted speed.

To convert the speed from Km/h to m/s, you can use the following conversion formula:

Speed in m/s=Speed in Km/h × 1000/3600


Problem Constraints

1 <= S <= 105


Input Format

Take integer input S.


Output Format

Print integral part of speed after conversion.


Example Input

Input 1:
10
Input 2:
120


Example Output

Output 1:
2
Output 2:
33


Example Explanation

Explanation 1:
Speed in m/s after conversion is 2.77. Integral part is 2.
Explanation 2:
Speed in m/s after conversion is 33.333. Integral part is 33. */
import java.lang.*;
import java.util.*;

public class Q3_Beginner_Contest_1_Data_Types,_If-Else_&_Loops{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        int Smps=(S*1000)/3600;
        System.out.print(Smps);
        
    }
}