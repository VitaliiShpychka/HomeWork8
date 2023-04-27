package hw;

public class Circle implements Shape {
    private Point point;
    private String name = "Circle";
    private int radius;


    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(Point point, int radius, String name){
        this.point = point;
        this.radius= radius;
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}


