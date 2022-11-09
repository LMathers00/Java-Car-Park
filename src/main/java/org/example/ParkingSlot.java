package org.example;

public class ParkingSlot
{
    private Vehicle vh;
    private VSize size;
    private int lane;
    private int slotNumber;
    private Lvl l;

    public ParkingSlot(Lvl lvl, int r, int num, VSize vs)
    {
        l = lvl;
        lane = r;
        slotNumber = num;
        size = vs;
    }
    public boolean isAvailable()
    {
        return vh == null;
    }
    public boolean canFitVehicle(Vehicle vh)
    {
//check if the spot is big enough and is available
        return isAvailable() && vh.canFitInSlot(this);
    }
    public boolean park(Vehicle vObj)
    {
        if (!canFitVehicle(vObj))
        {
            return false;
        }
        vh = vObj;
        vh.parkInSlot(this);
        return true;
    }
    public int getLane()
    {
        return lane;
    }

    public int getSlotNumber()
    {
        return slotNumber;
    }
    public VSize getSize()
    {
        return size;
    }
    public void removeVehicle()
    {
        l.slotFreed();
        vh = null;
    }
}
