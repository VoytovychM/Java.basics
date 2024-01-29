package org.example.january;

public class Main {
    public static void main(String[] args) {

        // модификаторы доступа
        // public - виден во всём проекте
        // protected - виден в пакете и наследниках класса
        // default - виден только внутри пакета где находится этот класс
        // private - виден только в рамках этого класса

        Car myCar = new Car("Volvo", 2010, "xc70", 200);
        myCar.move();
        Car car = new Car("BMW", 2015, "x5", 300);
        car.move();

        myCar.turnLeft();
        myCar.stop();
        myCar.turnRight();
        System.out.println(myCar.getBrand());
        System.out.println("**************");

        System.out.println(myCar.getMaxSpeed());
        myCar.setMaxSpeed(300);
        System.out.println(myCar.getMaxSpeed());


    }
}