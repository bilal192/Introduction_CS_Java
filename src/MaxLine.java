/**
 * A program that prints the maximum distance between three points in a coordinate plane.
 *
 * */
import java.util.Scanner;
public class MaxLine{
    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter first point coordinates:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();

        System.out.println ("Enter second point coordinates:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        System.out.println ("Enter third point coordinates:");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        // Calculate the distances between each pair of points (Using the distance formula)
        double distance1Vs2 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double distance1Vs3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double distance2Vs3 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));

        // Determine the maximum distance and the corresponding points
        if (distance1Vs2 >= distance1Vs3 && distance1Vs2 >= distance2Vs3) {
            System.out.printf("Max line created by the following points: (%d, %d),(%d, %d).", x1, y1, x2, y2, distance1Vs2);
        } else if (distance1Vs3 >= distance1Vs2 && distance1Vs3 >= distance2Vs3) {
            System.out.printf("Max line created by the following points: (%d, %d),(%d, %d)", x1, y1, x3, y3, distance1Vs3);
        } else {
            System.out.printf("Max line created by the following points: (%d, %d),(%d, %d)", x2, y2, x3, y3, distance2Vs3);
        }
    }
}