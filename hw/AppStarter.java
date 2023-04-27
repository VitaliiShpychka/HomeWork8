package hw;

public class AppStarter {
    public static void main(String[] args) {
        doLogic();

    }
    public static void doLogic(){
        Shape[] shapes = createFirures();
        printFigures(shapes, new FigureConsolePrinter());
    }
    public static Shape[] createFirures(){

        Circle c1 = new Circle(new Point(1, 1), 1);
        Circle c2 = new Circle(new Point(2, 1), 2);

        Circle[] ca = {c1, c2};

        Quad q1 = new Quad(new Point(1,1), 3);
        Quad q2 = new Quad(new Point(1,2), 4);
        Quad[] qa = {q1, q2};

        Triangle t1 = new Triangle(new Point(1,1), 3);
        Triangle t2 = new Triangle(new Point(1,2), 4);
        Triangle[] ta = {t1, t2};

        Rectangle r1 = new Rectangle(new Point(1,1), 3);
        Rectangle r2 = new Rectangle(new Point(1,2), 4);
        Rectangle[] ra = {r1, r2};

        RightTriangle rt1 = new RightTriangle(new Point(1,1), 3);
        RightTriangle rt2 = new RightTriangle(new Point(1,2), 4);
        RightTriangle[] rta = {rt1, rt2};
        return ca;
    }
    public static void printFigures(Shape[] sa, FigurePrinter fp){
        new FigureArrayPrinter().printFiguresUsingFigurePrinter(sa, fp);

    }
}
