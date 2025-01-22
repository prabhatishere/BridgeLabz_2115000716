class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378; // Create a variable radiusKm and assign 6378 (Radius of earth in km).
        double volumeKm3 = (4 / 3.0) * Math.PI * Math.pow(radiusKm, 3); // Create a variable volumeKm3 to Calculate Volume of earth in km^3
        double volumeMiles3 = volumeKm3 / Math.pow(1.609, 3); // Create a variable volumeMies3 and Calculate the volume of earth in miles.
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    } // Print the volume in kms and miles.
}
