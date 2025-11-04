package Module1_Programming_Assignment_1;
/**
Chapter 6:  Programming Exercise 6.9

This program defines two conversion methods:
    - footToMeter
    - meterToFoot

Then prints a side by side table to display the conversion results.
The formula for the conversion is:
    - meter = 0.305 * foot
    - foot = 3.279 * meter
*/

public class FeetToMetersConversion {
    /* Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    /* Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return meter / 0.305;
    }
    // Print results in the form of a table
    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("----------------------------------------");

        // Left table starts at 1.0 feet and goes up by 1.0.
        double feet = 1.0;
        // Right table starts at 20.0 meters and goes up by 5.0 each row.
        double meters = 20.0;

        // Using a while loop for iterations and to stay within range
        // Feet goes from 1.0 and stops at 10.0
        // Meters goes from 20.0 and stops at 65.0
        while (feet <= 10.0 && meters <= 65.0) {
            // Taking in feet and converting it to meters
            double metersFromFeet = footToMeter(feet);
            // Taking in meters and converting it to feet
            double feetFromMeters = meterToFoot(meters);

            /*
                Rounding to 3 decimals places.
                - Multiply by 1000 and use (int) to remove the fractions,
                add 0.5, then divide by 1000.0 to maintain the original format
            */

            double metersFromFeetRounded = (int)(metersFromFeet * 1000 + 0.5) / 1000.0;
            double feetFromMetersRounded = (int)(feetFromMeters * 1000 + 0.5) / 1000.0;

            // Formatting Strings to print the results
            System.out.println(feet + "\t" + metersFromFeetRounded + "\t|\t" + meters + "\t" + feetFromMetersRounded);
            // Ensure left column increases feet by 1.0 each iteration
            feet += 1.0;
            // Ensures right column increases by 5.0 each iteration
            meters += 5.0;
        }
    }
}
