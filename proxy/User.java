public class User {
    private String name;
    private boolean isAgent;

    public User(String name, boolean isAgent) {
        this.name = name;
        this.isAgent = isAgent;
    }

    public boolean isAgent() {
        return isAgent;
    }

    public String getName() {
        return name;
    }
}
