package figuresObjectsHomework;

import java.util.Random;

public class ColorOfFiguresGenerator {
    String[] colors = {"Green", "Black", "White", "Yellow", "Blue", "Pink", "Purple", "Grey", "Brown", "Orange"};

    public String randomizeFigureColor() {
        Random random = new Random();
        int randomNumberOfColor = random.nextInt(0, colors.length);
        return colors[randomNumberOfColor];
    }
}
