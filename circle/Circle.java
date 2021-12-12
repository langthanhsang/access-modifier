package accessmodifier.circle;

public class Circle {
    public double radius = 1;
    private String color = "red";
    public Circle() {
    }
    public Circle(double radius, String color ) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
     void getArea() {
        System.out.println(Math.PI * Math.pow(radius,2));
    }
    public void setRadius(double r) {
        this.radius = r;
    }

}

