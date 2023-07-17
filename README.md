# qcells
Thank you for giving the opertunity to work on the assingment. 

problem: please refer the document. 

In order to run the code need below required softwares 

* Java (latest version)
* Maven
* Git
* IDE for import and run the test case

Logic for the Assingment is added in Src Main folder and I have followed TDD so created test casess for testing the above assignment 

Under Test folder CarTest class is having the testDrivingPlan method add this read data from trip data data provider. 

Sample input : 

TripPlan tripPlan=new TripPlan("San Francisco","Las Vegas", TripType.ROUND_TRIP,520,0,DistanceUnit.MILES,50,1,48);
        ElectricCarInstrumentPanel instrumentPanel=new ElectricCarInstrumentPanel("yes",false,false,false,tripPlan,100,0,false,0,ECarStatus.STOPEED);
        ElectricCar ecar =new ElectricCar("Tesla","Model S",CarType.SEDAN,CarColor.WHITE,100, BatteryCapacityUnits.KILOWATT_HOUR,500, DistanceUnit.MILES,50,instrumentPanel);


please reachout if any details need to run the sample to vikram.cherukuri@techvedika.com and +91 9347034762

Sample out put from the problem: 

 Tesla Model S ,100 kWh, WHITE     color 
Beginning the trip at San Francisco at 7/17/2023 13:47
7/17/2023 13:47, DRIVING, 50 MILES, 520 MILES, 100%
7/17/2023 14:47, DRIVING, 50 MILES, 470 MILES, 90%
7/17/2023 15:47, DRIVING, 50 MILES, 420 MILES, 80%
7/17/2023 16:47 CHARGING 50 MILES, 420 MILES, 90%
7/17/2023 17:47, DRIVING, 50 MILES, 370 MILES, 80%
7/17/2023 18:47 CHARGING 50 MILES, 370 MILES, 90%
7/17/2023 19:47, DRIVING, 50 MILES, 320 MILES, 80%
7/17/2023 20:47 CHARGING 50 MILES, 320 MILES, 90%
7/17/2023 21:47, DRIVING, 50 MILES, 270 MILES, 80%
7/17/2023 22:47 CHARGING 50 MILES, 270 MILES, 90%
7/17/2023 23:47, DRIVING, 50 MILES, 220 MILES, 80%
7/18/2023 00:47 CHARGING 50 MILES, 220 MILES, 90%
7/18/2023 01:47, DRIVING, 50 MILES, 170 MILES, 80%
7/18/2023 02:47 CHARGING 50 MILES, 170 MILES, 90%
7/18/2023 03:47, DRIVING, 50 MILES, 120 MILES, 80%
7/18/2023 04:47 CHARGING 50 MILES, 120 MILES, 90%
7/18/2023 05:47, DRIVING, 50 MILES, 70 MILES, 80%
7/18/2023 06:47 CHARGING 50 MILES, 70 MILES, 90%
7/18/2023 07:47, DRIVING, 50 MILES, 20 MILES, 80%
Reached the destination Las Vegas at 7/18/2023 07:47
Starting return trip bank to San Francisco
7/20/2023 07:47, DRIVING, 50 MILES, 520 MILES, 80%
7/20/2023 08:47, DRIVING, 50 MILES, 470 MILES, 90%
7/20/2023 09:47, DRIVING, 50 MILES, 420 MILES, 80%
7/20/2023 10:47, DRIVING, 50 MILES, 370 MILES, 70%
7/20/2023 11:47, DRIVING, 50 MILES, 320 MILES, 60%
7/20/2023 13:47 CHARGING 50 MILES, 320 MILES, 80%
7/20/2023 14:47, DRIVING, 50 MILES, 270 MILES, 70%
7/20/2023 15:47, DRIVING, 50 MILES, 220 MILES, 60%
7/20/2023 17:47 CHARGING 50 MILES, 220 MILES, 80%
7/20/2023 18:47, DRIVING, 50 MILES, 170 MILES, 70%
7/20/2023 19:47, DRIVING, 50 MILES, 120 MILES, 60%
7/20/2023 21:47 CHARGING 50 MILES, 120 MILES, 80%
7/20/2023 22:47, DRIVING, 50 MILES, 70 MILES, 70%
7/20/2023 23:47, DRIVING, 50 MILES, 20 MILES, 60%
Reached the destination San Francisco at 7/20/2023 23:47


