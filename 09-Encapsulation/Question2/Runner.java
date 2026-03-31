package Question2;

import java.util.*;
public class Runner{
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(new Car("UP 93 CT 7085",2000,"CAR247"));
        vehicles.add(new Bike("UP 93 SX 5971",500,"BIKE143"));
        vehicles.add(new Truck("UP 93 AZ 1871",3000,"TRUCK777"));
        int days=3;
        for(Vehicle v:vehicles){
            double rentalCost=v.calculateRentalCost(days);
            Insurable i=(Insurable)v;
            double insurance=i.calculateInsurance();
            System.out.println("Vehicle: "+v.getType());
            System.out.println("Number: "+v.getVehicleNumber());
            System.out.println("Rental Cost: "+rentalCost);
            System.out.println("Insurance: "+insurance);
            System.out.println(i.getInsuranceDetails());
            System.out.println();
        }
    }
}