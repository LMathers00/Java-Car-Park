package org.example;

public class Main {
    public static void main(String[] args)
    {
        ParkingLot pl = new ParkingLot(4);
        Car car1 = new Car("1234");
        Motorcycle m1 = new Motorcycle("4016");
        Van v1 = new Van("5555");
        Car car2 = new Car("1609");
        Motorcycle m2 = new Motorcycle("1389");
        Car car3 = new Car("1809");
        Van v2 = new Van("r2d2");
        Motorcycle m3 = new Motorcycle("WYVN");
        Van v3 = new Van("COYS");


//  parking the vehicles
        pl.parkVehicle(car1);
        pl.parkVehicle(m1);
        pl.parkVehicle(v1);
        pl.parkVehicle(car2);

        pl.leave(m1,0) ;
        pl.parkVehicle(m2);
        pl.parkVehicle(car3);
        pl.leave(v1,0);
        pl.parkVehicle(v2);

        pl.parkVehicle(m3);
//        pl.parkVehicle(v3); triggers parking is full
    }
}