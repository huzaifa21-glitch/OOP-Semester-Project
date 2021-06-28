public interface Sign {
    boolean verify(String id, String Pass);
    int lines(String id);
    String[] fetch(String id);
}
