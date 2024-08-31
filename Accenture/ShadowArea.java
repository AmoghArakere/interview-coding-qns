/*You are developing a feature for an environmental awareness app that helps users to know how much area their tree's shadow covers. You have the distance D from a tree's trunk to the edge of the shadow. Your task is to calculate and return an integer value representing the shadow area of the canopy.
Note:- Round off the resuit to nearest integer.
Input Specification:
inputt: An integer value D, representing the distance from the tree trunks to the edge of shadow.*/

public class TreeShadowArea {

    // Method to calculate the shadow area of the tree canopy using 3.14 for pi
    public static int calculateShadowArea(int D) {
        double area = 3.14 * D * D; // Use 3.14 as the value of pi
        
        // Apply the given logic for rounding
        if (area - (int) area <= 0.5) {
            return (int) area;
        } else {
            return (int) area + 1;
        }
    }

    public static void main(String[] args) {
        int D = 5; // Example distance from tree trunk to edge of shadow
        int shadowArea = calculateShadowArea(D);
        System.out.println("The shadow area of the canopy is: " + shadowArea);
    }
}
