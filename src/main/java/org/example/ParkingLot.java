package org.example;
public class ParkingLot
{
    private Lvl[] lvls;
    private final int NUM_LVLS = 2;
    private int numberSlots;
    public ParkingLot(int numberSlots)
    {
        this.numberSlots = numberSlots;

        lvls = new Lvl[NUM_LVLS];
        for (int j = 0; j < NUM_LVLS; j++)
        {
            lvls[j] = new Lvl(j, numberSlots);
            System.out.println("Level " + j + " created with " + numberSlots + " " +  "slots");
        }
    }

    // a method for handling a vehicle parking
    public boolean parkVehicle(Vehicle vh)
    {
        System.out.println(" ------------------------------------ ");

        for (int i = 0; i < lvls.length; i++)
        {
            if (lvls[i].parkVehicle(vh))
            {
                System.out.println(" Level " + i + " with Vehicle Number " + vh.licPlate );
                return true;
            }
        }
        System.out.println("PARKING IS FULL");
        return false;
    }

    // method for handling the scenario when a vehicle leaves
    public boolean leave(Vehicle vh, int lvl) {
        System.out.println(" ------------------------------------------ ");
        lvls[lvl].slotFreed();
        System.out.println("Slot freed from  Level " + lvl + " by exiting vehicle  " + vh.licPlate);

        return false;
    }
}
