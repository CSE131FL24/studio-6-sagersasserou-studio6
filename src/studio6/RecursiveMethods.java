package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int i) {
		if (i == 0) {
			return 0;
		}else {
			return 1/(Math.pow(2.0, i)) + geometricSum(i - 1);
		}
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if (radius > radiusMinimumDrawingThreshold) {
			StdDraw.circle(xCenter, yCenter, radius);

			double newRadius = radius / 3.0;
			circlesUponCircles(xCenter + radius, yCenter, newRadius, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter - radius, yCenter, newRadius, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter + radius, newRadius, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter - radius, newRadius, radiusMinimumDrawingThreshold);
		}
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		toReversedHelper(0, array);
		return array;
	}

	public static int[] toReversedHelper(int index, int[] array) {
		if (array.length < array.length /2) {
			int a = array[index];
			array[index] = array[array.length - index];
			array[array.length - index] = a;
			toReversedHelper(index + 1, array);
		}
		return array;
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {

		// FIXME compute the gcd of p and q using recursion
		return 0;

	}

}
