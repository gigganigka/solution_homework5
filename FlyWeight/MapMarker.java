package FlyWeight;

public class MapMarker {
    private int x;
    private int y;
    private MarkerStyle style;

    public MapMarker(int x, int y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void draw() {
        System.out.print("Drawing marker at (" + x + "," + y + ") with style -> ");
        style.displayStyle();
    }
}

