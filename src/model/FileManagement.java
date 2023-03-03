package model;

public interface FileManagement {
    void writeFile(String path,int Rut , String NameC, String Adress, int Telefono );
    String readFile(String path);
}
