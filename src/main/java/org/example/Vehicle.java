package org.example;

// import statement
import java.util.ArrayList;

public abstract class Vehicle
{
    protected ArrayList<ParkingSlot> parkingSlots = new ArrayList<ParkingSlot>();
    protected String licPlate;
    protected int slotsNeeded;
    protected VSize size;

    public int getSlotsNeeded()
    {
        return slotsNeeded;
    }

    public void parkInSlot(ParkingSlot s)
    {
        parkingSlots.add(s);
    }

    public VSize getSize()
    {
        return size;
    }

    public void clearSlots()
    {
// remove car from slot, and notify the slot that the vehicle gone
        for (int i = 0; i < parkingSlots.size(); i++)
        {
            parkingSlots.get(i).removeVehicle();
        }
        parkingSlots.clear();
    }


    public abstract boolean canFitInSlot(ParkingSlot spot);
}
