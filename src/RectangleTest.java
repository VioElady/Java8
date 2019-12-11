
public class RectangleTest {
    public static void main(String[] args) {
        RectangleClass rectangle1 = new RectangleClass(8,2);
        System.out.printf("Perimeter of rectangle(length :%.2f, width :%.2f) is %.2f",
                rectangle1.getLength(),rectangle1.getWidth(),rectangle1.getPerimeter());
        System.out.printf("\nArea of rectangle(length :%.2f, width :%.2f) is %.2f",
                rectangle1.getLength(),rectangle1.getWidth(),rectangle1.getArea());

        RectangleClass rectangleDefault = new RectangleClass();
        System.out.printf("\nPerimeter of rectangle(length :%.2f, width :%.2f) is %.2f",
                rectangleDefault.getLength(),rectangleDefault.getWidth(),rectangleDefault.getPerimeter());
        System.out.printf("\nArea of rectangle(length :%.2f, width :%.2f) is %.2f",
                rectangleDefault.getLength(),rectangleDefault.getWidth(),rectangleDefault.getArea());

    }
}