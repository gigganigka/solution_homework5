public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("house1.jpg");
        img1.displayThumbnail();
        img1.displayFullImage();

        User guest = new User("John", false);
        User agent = new User("Alice", true);

        ImageUploader guestUploader = new Protection(guest);
        ImageUploader agentUploader = new Protection(agent);

        guestUploader.uploadImage("new_house.jpg"); //cancel
        agentUploader.uploadImage("villa.jpg"); //access
    }
}
