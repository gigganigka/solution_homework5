public class Protection implements ImageUploader {
    private User user;
    private RealImageUploader uploader;

    public Protection(User user) {
        this.user = user;
        this.uploader = new RealImageUploader();
    }

    @Override
    public void uploadImage(String filename) {
        if (user.isAgent()) {
            uploader.uploadImage(filename);
        } else {
            System.out.println("Access denied. Only agents can upload images.");
        }
    }
}
