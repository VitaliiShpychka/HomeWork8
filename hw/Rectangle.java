package hw;

public class Rectangle implements Shape{
    private Point point;
    private String name = "Rectangle";
    private int length;
    public Rectangle(Point point, int length){
        this.point = point;
        this.length= length;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "point=" + point +
                ", name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
