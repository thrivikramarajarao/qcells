package org.techVedika.test;

import org.techVedika.*;
import org.techVedika.enums.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CarTest {

    @DataProvider(name = "CarData")
    public Object[][] carData() {

        Car car1 = new Car("Tesla", "S", CarType.SEDAN, CarColor.BLACK);
        Car car2 = new Car("Benze", "C", CarType.HATCHBACK, CarColor.BLUE);
        Car car3 = new Car("XXX", "Z", CarType.CONVERTIBLE, CarColor.RED);
        Car car4 = new Car("ZZZZ", "X", CarType.CONVERTIBLE, CarColor.WHITE);
        ElectricCar ecar =new ElectricCar("Tesla","Model S",CarType.SEDAN,CarColor.WHITE,100, BatteryCapacityUnits.KILOWATT_HOUR,500, DistanceUnit.MILES,50);
        return new Object[][]{
                {car1, true},
                {car2, false},
                {car3, true},
                {car4, true},
                {car4, false},
                {car2, true},
                {ecar,false}
        };
    }

    @Test(dataProvider = "CarData")
    public void testCarConvertableOrNot(Car car, boolean convert) {
        System.out.print( car.toStringDec());
        car.toggleConvertibleTop(convert);
    }

    @Test(dataProvider = "CarData")
    public void testStartOfCar(Car car,boolean convert){
        car.startCar();
    }


    @DataProvider(name="tripdata")
    public Object[][] tripData(){
        TripPlan tripPlan=new TripPlan("San Francisco","Las Vegas", TripType.ROUND_TRIP,520,0,DistanceUnit.MILES,50,1,48);
        ElectricCarInstrumentPanel instrumentPanel=new ElectricCarInstrumentPanel("yes",false,false,false,tripPlan,100,0,false,0,ECarStatus.STOPEED);
        ElectricCar ecar =new ElectricCar("Tesla","Model S",CarType.SEDAN,CarColor.WHITE,100, BatteryCapacityUnits.KILOWATT_HOUR,500, DistanceUnit.MILES,50,instrumentPanel);



        ElectricCarInstrumentPanel instrumentPanel1=new ElectricCarInstrumentPanel("yes",false,false,false,tripPlan,100,0,false,0,ECarStatus.STOPEED);
        ElectricCar ecar1 =new ElectricCar("Mercedes","-AMG",CarType.CONVERTIBLE,CarColor.WHITE,80, BatteryCapacityUnits.KILOWATT_HOUR,300, DistanceUnit.MILES,25,instrumentPanel1);

        ElectricCarInstrumentPanel instrumentPanel2=new ElectricCarInstrumentPanel("yes",false,false,false,tripPlan,100,0,false,0,ECarStatus.STOPEED);
        ElectricCar ecar2 =new ElectricCar("KIA","-EForce",CarType.HATCHBACK,CarColor.WHITE,120, BatteryCapacityUnits.KILOWATT_HOUR,600, DistanceUnit.MILES,75,instrumentPanel2);


        return new Object[][]{
                {ecar,ecar.getElectricCarInstrumentPanel().getTripPlan()},
                {ecar1,ecar1.getElectricCarInstrumentPanel().getTripPlan()},
                {ecar2,ecar2.getElectricCarInstrumentPanel().getTripPlan()}
        };

    }
    @Test(dataProvider = "tripdata")
    public void testDrivingPlan(Car car,TripPlan plan){
        DriveCar driveCar=new DriveCar();

        driveCar.driveToTrip(car,plan);
    }

}
