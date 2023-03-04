package presenter;

import java.util.Scanner;
import model.*;
public class Main {
    static final String PATH = "src/customer/Customer.txt";
    static final String PATH2 = "src/customer/Supplier.txt";

    //static final String
    public static void main(String[] args) {
        FileManagement operations = new fileManageA();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            option = scanner.nextInt();
            switch (option){
                case 1:  System.out.println("Esta ingresando datos del cliente:");
                    System.out.println("Ecriba RUT cliente  ");
                    operations.writeFile(PATH, "===========INFO CLIENTE ============");
                    System.out.println("Ingrese RUT del cliente");
                    operations.writeFile(PATH,"RUT:");
                    operations.writeFile(PATH, scanner.next());
                    System.out.println("Ingrese nombre del cliente");
                    operations.writeFile(PATH, "Nombre: ");
                    operations.writeFile(PATH, scanner.next());
                    System.out.println("Ingrese direccion del cliente separadon por -");
                    operations.writeFile(PATH, "Direccion: ");
                    operations.writeFile(PATH,scanner.next());
                    System.out.println("Ingrese Telefono del cliente");
                    operations.writeFile(PATH, "Telefono: ");
                    operations.writeFile(PATH,scanner.next());
                    System.out.println(operations.readFile(PATH));
                    System.out.println("Cliente ingresado");
                    break;
                case 2:
                    System.out.println("Esta ingresando datos del cliente:");
                    System.out.println("Ecriba RUT cliente  ");
                    operations.writeFile(PATH2, "===========INFO CLIENTE ============");
                    System.out.println("Ingrese RUT del cliente");
                    operations.writeFile(PATH2,"RUT:");
                    operations.writeFile(PATH2, scanner.next());
                    System.out.println("Ingrese nombre del cliente");
                    operations.writeFile(PATH2, "Nombre: ");
                    operations.writeFile(PATH2, scanner.next());
                    System.out.println("Ingrese direccion del cliente separadon por -");
                    operations.writeFile(PATH2, "Direccion: ");
                    operations.writeFile(PATH2,scanner.next());
                    System.out.println("Ingrese Telefono del cliente");
                    operations.writeFile(PATH2, "Telefono: ");
                    operations.writeFile(PATH2,scanner.next());
                    System.out.println(operations.readFile(PATH2));
                    System.out.println("Cliente ingresado");
                    break;
            }
        }while (option !=0);
    }


}




   /** FileManagement operations = new fileManageA();
        System.out.println("Esta ingresando datos del cliente:");
                System.out.println("Ecriba RUT cliente  ");
                operations.writeFile(PATH, "===========INFO CLIENTE ============");
                System.out.println("Ingrese RUT del cliente");
                operations.writeFile(PATH,"RUT:");
                operations.writeFile(PATH, scanner.next());
                System.out.println("Ingrese nombre del cliente");
                operations.writeFile(PATH, "Nombre: ");
                operations.writeFile(PATH,scanner.next());
                System.out.println("Ingrese direccion del cliente separadon por -");
                operations.writeFile(PATH, "Direccion: ");
                operations.writeFile(PATH,scanner.next());
                System.out.println("Ingrese Telefono del cliente");
                operations.writeFile(PATH, "Telefono: ");
                operations.writeFile(PATH,scanner.next());
                System.out.println(operations.readFile(PATH));
                System.out.println("Run SUCCESS");**/