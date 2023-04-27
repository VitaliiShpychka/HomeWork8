package hw;

public class Quad  implements Shape{
    private Point point;
    private String name = "Quad";
    private int length;
    public Quad(Point point, int length){
        this.point = point;
        this.length= length;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Quad{" +
                "point=" + point +
                ", name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}

