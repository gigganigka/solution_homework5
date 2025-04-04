public class RealImageUploader implements ImageUploader {
    @Override
    public void uploadImage(String filename) {
        System.out.println("Uploading image: " + filename);
    }
}
