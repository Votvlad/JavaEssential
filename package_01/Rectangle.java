package package_01;
// Создать класс с именем Rectangle. В теле класса
//создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
//вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
//прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая
//принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и
//площадь.

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
