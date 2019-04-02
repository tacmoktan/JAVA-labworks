/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractshape;

/**
 *
 * @author Tashi
 */
abstract class Shape {
    public abstract double area();
}

class Circle extends Shape{   //'public' access modifier isn't accepted ?
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double area(){
        return Math.PI* Math.pow(radius, 2);
    }

}

class Rectangle extends Shape{
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
  
    @Override
    public double area(){
        return length*breadth;
    }

}

class Triangle extends Shape{
    private double base;
    private double height;
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double area(){
        return 0.5*base*height;
    }
    
}

public class AbstractShape {
    public static void main(String[] arg){
        Circle c1 = new Circle(3);
        System.out.println(String.format("Circle area = %.2f ",c1.area()));
        
        Triangle t1 = new Triangle(3,4);
        System.out.println( String.format( "Triangle area = %.2f ", t1.area() ) );
        
        Rectangle r1 = new Rectangle(3,3);
        System.out.println( String.format( "Rectangle area = %.2f",r1.area() ) );
    }
}