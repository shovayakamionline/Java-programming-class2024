package com.perScholas.glabJavaInterfaces;

public class MyRunner {
    public static void main(String[] args) {

        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());
    }
}

/*Output:
Area of Circle 12.566370614359172
Coordinates are (1,2)
After move Down, Coordinates are (1,1)
After move right, Coordinates are (2,1)
After move Up, Coordinates are (2,2)
After move left, Coordinates are (1,2)
--------Test Polymorphism-------
After move up , Coordinates are (5,11)
After move Left , Coordinates are (4,11)
*/



