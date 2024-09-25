class AreaCalculator {

    // Method for square
    public double calculateArea(double side) {
        return side * side;
    }

    // Method for rectangle
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Method for circle
    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }
}

public class question5 {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Area of Square: " + calc.calculateArea(5.0));
        System.out.println("Area of Rectangle: " + calc.calculateArea(4.0, 6.0));
        System.out.println("Area of Circle: " + calc.calculateArea(3.0, true));
    }
}
