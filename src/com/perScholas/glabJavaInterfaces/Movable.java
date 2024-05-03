package com.perScholas.glabJavaInterfaces;

/*
Create an Interface named Movable. It is similar to creating a new class,
as shown below:
*/
public interface Movable {// An interface defines a list of public abstract methods to be implemented by the subclasses

    void moveUp();    // "public" and "abstract" by default

    void moveDown();

    void moveLeft();

    void moveRight();

    String getCoordinate();
}
