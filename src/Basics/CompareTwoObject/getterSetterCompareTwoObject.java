package Basics.CompareTwoObject;

public class getterSetterCompareTwoObject {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Toyota", "Camry");
        Car car3 = new Car("Honda", "Accord");

        System.out.println(car1.equals(car1)); // true
        System.out.println(car1.equals(car2));// true
        System.out.println(car1.equals(car3)); // false
    }
}
