package ProgrammingElements.level1;

public class Problem7_EarthVolume {
    public static void main(String[] args) {
        double radius = 6378; // in kilometers
        double pi = Math.PI;
        double volumeKm = (4.0/3.0) * pi * Math.pow(radius, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3); // Convert to cubic miles
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + 
                         " and cubic miles is " + volumeMiles);
    }
} 