package hw;

public class Triangle  implements Shape{
    public Point point;
    private String name = "Triangle";
    private int lengthSide;
    public Triangle(Point point, int lengthSide){
        this.point = point;
        this.lengthSide= lengthSide;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point=" + point +
                ", name='" + name + '\'' +
                ", lengthSide=" + lengthSide +
                '}';
    }
}
