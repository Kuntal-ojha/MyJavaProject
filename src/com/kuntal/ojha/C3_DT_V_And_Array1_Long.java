package com.kuntal.ojha;
// Compute distance light travels using long variables.
public class C3_DT_V_And_Array1_Long {
    public static void main(String args[]){
        int lightspeed;
        long days = 1000;
        long seconds;
        long distance;
        // Approximate speed of light in miles per seconds
        lightspeed=1000; // Specify number of days here
        seconds=days*24*60*60; // Convert to seconds
        distance=lightspeed*seconds; // Compute distance
        System.out.print("In "+ days);
        System.out.print(" days light will travel about ");
        System.out.println(distance +" miles.");
    }
}
