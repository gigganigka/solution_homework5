package FlyWeight;
import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    private static Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String iconType, String color, String labelStyle) {
        String key = iconType + "-" + color + "-" + labelStyle;

        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(iconType, color, labelStyle));
        }

        return styles.get(key);
    }

    public static int getTotalStyles() {
        return styles.size();
    }
}
