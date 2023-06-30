package Basics.CompareTwoObject;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        // if (this == obj) {
        // return true;
        // }

        // if (obj == null || getClass() != obj.getClass()) {
        // return false;
        // }

        Car other = (Car) obj;
        return this.brand.equals(other.brand) && this.model.equals(other.model);
    }
}
