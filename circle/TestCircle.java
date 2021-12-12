package accessmodifier.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4,"black");
        circle.getArea();
        Circle c1 = new Circle();
        c1.setRadius(10);
        c1.getArea();

    }

}
