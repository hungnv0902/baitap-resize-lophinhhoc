import interFace.Resizeable;

public class ResizeCircle extends Circle implements Resizeable {

    public ResizeCircle() {
    }

    public ResizeCircle(double radius) {
        super(radius);
    }

    public ResizeCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public void resize(double percent) {
        setRadius(super.getRadius()*percent);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
