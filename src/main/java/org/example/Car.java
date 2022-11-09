package org.example;

public class Car extends Vehicle {
    public Car(String licPlate) {
        slotsNeeded = 1;
        size = VSize.CarSize;
        this.licPlate = licPlate;
    }

    public boolean canFitInSlot(ParkingSlot spot) {
        return spot.getSize() == VSize.CarSize;
    }
}
