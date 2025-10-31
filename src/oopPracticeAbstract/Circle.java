package oopPracticeAbstract;

public class Circle extends Shape{

    public Circle(String colour) {
        super();
    }

    @Override
    public void draw(String colour) {
        System.out.println("Фигура рисуется, цвет: " + colour);
    }
}