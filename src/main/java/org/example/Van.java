package org.example;

public class Van extends Vehicle {
    public Van(String licPlate) {
        slotsNeeded = 1;
        size = VSize.VanSize;
        this.licPlate = licPlate;
    }

    public boolean canFitInSlot(ParkingSlot spot) {
        return spot.getSize() == VSize.VanSize;
    }
}