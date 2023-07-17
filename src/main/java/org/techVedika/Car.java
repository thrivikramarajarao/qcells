package org.techVedika;

import org.techVedika.enums.CarColor;
import org.techVedika.enums.CarType;

public class Car {
    String Brand;
    String modelName;
    CarType carType;
    CarColor carColor;


    public Car(String brand, String modelName, CarType carType, CarColor carColor) {
        Brand = brand;
        this.modelName = modelName;
        this.carType = carType;
        this.carColor = carColor;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModelName() {
        return modelName;
    }

    public CarType getCarType() {
        return carType;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }


    private boolean isConvertible() {
        return this.carType == CarType.CONVERTIBLE;
    }

    public void toggleConvertibleTop(boolean up) {
        if (this.isConvertible()) {
            if (up) {
                System.out.println("Convertible top is UP.");
            } else {
                System.out.println("Convertible top is Down");
            }
        } else {
            System.out.println("This car is not a convertible.");
        }
    }

    public void startCar(){
        System.out.println(this.toStringDec());

    }

    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + Brand + '\'' +
                ", modelName='" + modelName + '\'' +
                ", carType=" + carType +
                ", carColor=" + carColor +
                '}';
    }

    public String toStringDec(){
        return " "+Brand+" "+modelName+" ,"+carColor+" color ";
    }

}
