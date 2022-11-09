package org.example;

public class Motorcycle extends Vehicle {
    public Motorcycle(String licPlate)
    {
        slotsNeeded = 1;
        size = VSize.Motorcycle;
        this.licPlate = licPlate;
    }

    public boolean canFitInSlot(ParkingSlot slot)
    {
        return slot.getSize() == VSize.CarSize || slot.getSize() == VSize.Motorcycle;
    }
}
