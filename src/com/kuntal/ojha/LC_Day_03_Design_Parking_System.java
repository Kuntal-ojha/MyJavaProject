package com.kuntal.ojha;
// Design Parking System
// Website Link: https://leetcode.com/problems/design-parking-system/
public class LC_Day_03_Design_Parking_System {
    private int[] slots;
    public LC_Day_03_Design_Parking_System(int big, int medium, int small)
    {
        slots = new int[]{big,medium,small};
    }
    public boolean addCar(int CarType)
    {
        if (slots[CarType-1]>0)
        {
            slots[CarType-1]--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LC_Day_03_Design_Parking_System lc_day_03_design_parking_system =new LC_Day_03_Design_Parking_System(1,1,0);
        System.out.println("Add car on big slot "+lc_day_03_design_parking_system.addCar(1));
        System.out.println("Add car on medium slot "+lc_day_03_design_parking_system.addCar(1));
        System.out.println("Add car on small slot "+lc_day_03_design_parking_system.addCar(1));
    }
}
