package figuresObjectsHomework;

public class FabricFigures{
    Figure[] figures = new Figure[3];

    public boolean addFigureToKit(Figure figure) {
        boolean added = false;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] == null) {
                figures[i] = figure;
                added = true;
                break;
            }
        }
        return added;
    }

}
