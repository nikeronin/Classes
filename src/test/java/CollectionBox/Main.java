package CollectionBox;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(30.0, 11.0, 5.0));
        boxes.add(new Box(30.1, 15.0, 8.0));
        boxes.add(new Box(29.9, 20.0, 10.0));
        boxes.add(new Box(31.0, 8.0, 4.0));
        boxes.add(new Box(29.0, 10.0, 5.0));
        boxes.add(new Box(20.0, 30.0, 8.0));
        boxes.add(new Box(40.0, 29.9, 10.0));
        boxes.add(new Box(20.0, 30.1, 4.0));
        boxes.add(new Box(25.0, 29.0, 5.0));
        boxes.add(new Box(35.0, 15.0, 30.0));
        boxes.add(new Box(40.0, 20.0, 29.9));
        boxes.add(new Box(20.0, 8.0, 30.1));
        boxes.add(new Box(20.0, 8.0, 29.0));

        List<Box> largeBoxes = BoxCheckWidth.ReplaceBoxesBigger30(boxes);

        System.out.println("Коробки, перемещенные в коллекцию largeBoxes:");
        for (Box box : largeBoxes) {
            System.out.println(box);
        }

    }

}
