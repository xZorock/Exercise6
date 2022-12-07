package it.develhope.exercise6;

public class Start {
    public static void main(String[] args) {
        Shape shape0= new Shape();
        Shape shape1= new Shape(2);
        Shape shape2= new Shape(4,2);
        Shape shape3= new Shape(4, 2, 2);
        Shape shape4= new Shape(3, 2, 2, 2);

        String undefined =shape0.getShapeDetails();
        System.out.println(undefined);

        String circle =shape1.getShapeDetails();
        System.out.println(circle);

        String square =shape2.getShapeDetails();
        System.out.println(square);

        String rectangle =shape3.getShapeDetails();
        System.out.println(rectangle);

        String triangle =shape4.getShapeDetails();
        System.out.println(triangle);
    }
}
