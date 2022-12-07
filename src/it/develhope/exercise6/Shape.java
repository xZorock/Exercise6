package it.develhope.exercise6;

public class Shape {
    private String shapeName;
    private int numberOfEdge;

    public Shape(){
        shapeName="Undefined";
        System.out.println("A shape has been created");

    }

    public Shape(double radius){

        shapeName="Circle";
        System.out.println("A circle has been created");


    }

    public Shape(int edges, double edgeLength){

        numberOfEdge=4;
        shapeName="Square";
        System.out.println("A Square has been created");

    }
    public Shape(int edges,double e1, double e2){

        numberOfEdge=4;
        shapeName="Rectangle";
        System.out.println("A Rectangle has been created");

    }
    public Shape(int edges,double e1, double e2, double e3){

        numberOfEdge=3;
        shapeName="Triangle";
        System.out.println("A Triangle has been created");

    }

    public String getShapeDetails(){
        return shapeName + " " + numberOfEdge;
    }
}
