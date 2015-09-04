// Christine Gelotte
// September 5, 2015
// CSE 2, Lab 2, Cyclometer
// This code measures the number of rotations of the front wheel and time elapsed of two bicycle trips in order to calculate
// the distance traveled in each individual trip as well as the total distance of both trips. 
public class Cyclometer {
    // main method
    public static void main(String[] args){
        int secsTrip1=480;  // the number of seconds for the first bicycle trip
        int secsTrip2=3220;  // the number of seconds for the seconds bicycle trip
        int countsTrip1=1561;  //the number of front wheel rotations during the first trip
        int countsTrip2=9037; //the number of front wheel rotations during the second trip
        // the intermediate variables and output data.
        double wheelDiameter=27.0;  // diameter of wheel
        double PI=3.14159; // the value of pi
        double feetPerMile=5280;  // number of feet per mile
        double inchesPerFoot=12;   // number of inches per foot
        double secondsPerMinute=60;  // number of seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance;  // distance variables
        // time elapsed for each trip 
        System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        // values for the distances
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // above gives distance in inches
        //for each count, a rotation of the wheel travels the diameter in inches times PI (circumference = 2*pi*radius or diameter*pi)
        distanceTrip1=inchesPerFoot*feetPerMile; // calculates distance in miles for first trip
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // calculates distance in miles for second trip
        totalDistance=distanceTrip1+distanceTrip2; //calculates distance in miles for total trip
        // print out the distances calculated above
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total trip was "+totalDistance+" miles");
    }// end of main method
} // end of class