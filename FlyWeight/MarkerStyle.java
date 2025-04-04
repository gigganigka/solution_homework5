package FlyWeight;

public class MarkerStyle {
    private String iconType;
    private String color;
    private String labelStyle;

    public MarkerStyle(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void displayStyle() {
        System.out.println("Icon: " + iconType + ", Color: " + color + ", Label: " + labelStyle);
    }

    // Геттеры при необходимости
    public String getIconType() {
        return iconType;
    }
}
