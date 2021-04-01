package package_01;


public class Rectangle {
    double side1;
    double side2;

    double areaCalculator (double side1, double side2){
        return side1 * side2;
    }

    double perimeterCalculator (double side1, double side2) {
        return (side1 + side2) * 2;
    }

    public static void main(String[] args) {
        Rectangle result = new Rectangle();
        System.out.println(result.areaCalculator(5, 7));
        System.out.println(result.perimeterCalculator(5, 8));
    }
}
