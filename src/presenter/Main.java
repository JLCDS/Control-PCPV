package presenter;

import java.util.Scanner;
import model.*;
public class Main {
    static final String PATH = "src/customer/prueba1.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            FileManagement operations = new fileManageA();
        System.out.println("Esta ingresando datos del cliente:");
        System.out.println("Ecriba RUT cliente  ");
        operations.writeFile(PATH, "===========INFO CLIENTE ============");
        System.out.println("Ingrese RUT del cliente");
        operations.writeFile(PATH,"RUT:");
            operations.writeFile(PATH, scanner.next());
        System.out.println("Ingrese ombre del cliente4");
        System.out.println("dijite direccion del cliente ");
            operations.writeFile(PATH,scanner.next());
            System.out.println(operations.readFile(PATH));
            System.out.println("Run SUCCESS");


    }
}