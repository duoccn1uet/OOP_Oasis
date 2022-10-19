import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape newShape) {
        shapes.add(newShape);
    }

    /**
     * f.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); ) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            } else {
                ++i;
            }
        }
    }

    /**
     * f.
     */
    public String getInfo() {
        String info = "Layer of crazy shapes:\n";
        for (int i = 0; i < shapes.size(); ++i) {
            info += shapes.get(i).toString() + "\n";
        }
        return info;
    }

    /**
     * f.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); ++i) {
            for (int j = i + 1; j < shapes.size(); ) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                } else {
                    ++j;
                }
            }
        }
    }
}
