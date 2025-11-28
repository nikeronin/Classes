package CollectionBox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BoxCheckWidth {

    public static List<Box> ReplaceBoxesBigger30 (List<Box> boxes) {

        List<Box> BigBoxes = new ArrayList<>();

        Iterator<Box> iterator = boxes.iterator();

        while (iterator.hasNext()) {
            Box box = iterator.next();
            if (box.getWidth() > 30) {
                BigBoxes.add(box);
                iterator.remove();
            }
        }

        return BigBoxes;
    }

}
