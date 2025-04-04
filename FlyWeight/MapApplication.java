package FlyWeight;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapApplication {
    public static void main(String[] args) {
        List<MapMarker> markers = new ArrayList<>();
        Random random = new Random();

        String[] types = {"gas", "restaurant", "hospital"};
        String[] colors = {"red", "blue", "green"};
        String[] fonts = {"Arial", "Verdana", "Tahoma"};

        int totalMarkers = 10_000;

        for (int i = 0; i < totalMarkers; i++) {
            String type = types[random.nextInt(types.length)];
            String color = colors[random.nextInt(colors.length)];
            String font = fonts[random.nextInt(fonts.length)];

            MarkerStyle style = MarkerFactory.getStyle(type, color, font);

            int x = random.nextInt(1000);
            int y = random.nextInt(1000);

            MapMarker marker = new MapMarker(x, y, style);
            markers.add(marker);
        }

        for (int i = 0; i < 5; i++) {
            markers.get(i).draw();
        }

        System.out.println("\nTotal markers created: " + totalMarkers);
        System.out.println("Unique styles used (Flyweight objects): " + MarkerFactory.getTotalStyles());
    }
}

