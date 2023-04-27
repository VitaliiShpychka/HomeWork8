package hw;

public class RightTriangle implements Shape{
    public Point point;
    private String name = "RightTriangle";
    private int lengthSide;
    public RightTriangle(Point point, int lengthSide){
        this.point = point;
        this.lengthSide= lengthSide;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "point=" + point +
                ", name='" + name + '\'' +
                ", lengthSide=" + lengthSide +
                '}';
    }
}
