public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("house1.jpg");
        Image img2 = new ProxyImage("apartment2.jpg");

        // Отображение миниатюр
        img1.displayThumbnail();
        img2.displayThumbnail();

        System.out.println("---");

        // Загрузка и отображение изображения — только по запросу
        img1.displayFullImage();

        System.out.println("---");

        // Повторный вызов — без повторной загрузки
        img1.displayFullImage();
    }
}
