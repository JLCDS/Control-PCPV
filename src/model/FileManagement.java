package model;

public interface FileManagement {
    void writeFile(String path, Object info);
    String readFile(String path);
}
