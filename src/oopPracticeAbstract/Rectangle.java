package oopPracticeAbstract;

public class Rectangle extends Shape{

    public Rectangle(String colour) {
        super();
    }

    @Override
    public void draw(String colour) {
        System.out.println("Фигура рисуется, цвет: " + colour);
    }
}
