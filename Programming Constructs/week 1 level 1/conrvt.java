public class conrvt {
    public static void main(String[] args) {
    double distanceInKm = 10.8; // Conversion factor: 1 km = 1.6 miles
    double kmToMilesConversionFactor = 1.6;
    double distanceInMiles = distanceInKm *
    kmToMilesConversionFactor;
    System.out.println("The distance " + distanceInKm + " km in miles is" + distanceInMiles);
    }
    }