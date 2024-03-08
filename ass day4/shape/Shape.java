import java.util.List;
abstract class Shapee {
    public abstract void draw();
}

class circle extends Shapee {
    @Override
    public void draw() {
        System.out.println("You draw circle");
    }
}

class Rec extends Shapee {
    @Override
    public void draw() {
        System.out.println("You draw rectangle");
    }
}
class TestClass {
    public void drawTest(List<? extends Shapee> shapeList) {
        for (Shapee shape : shapeList) {
            shape.draw();
        }
    }

}

public class Shape {
    public static void main(String[] args) {
        TestClass test = new TestClass();

        List<circle> circle_List = List.of(new circle());
        List<Rec> rectangle_List = List.of(new Rec());
        test.drawTest(circle_List);
        test.drawTest(rectangle_List);
        test.drawTest(circle_List);
        test.drawTest(rectangle_List);
       // test.drawTest(rectangle_List);
    }
}