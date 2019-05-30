public class ResizeCircleTest {
    public static void main(String[] args) {
        Circle circle = new ResizeCircle(3.4);

        ResizeCircle circle1 = (ResizeCircle) circle;

        circle1.resize(1.56);
        System.out.println(circle1.toString());
    }
}
