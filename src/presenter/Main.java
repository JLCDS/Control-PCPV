package presenter;

import java.util.Scanner;
import model.*;
public class Main {
    static final String PATH = "src/customer/Customer.txt";
    static final String PATH2 = "src/customer/Supplier.txt";
    static final String PATH3 = "src/customer/Product.txt";

    //static final String
    public static void main(String[] args) {
        FileManagement operations = new fileManageA();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Bienvenido al menu PCPV ");
            System.out.println(" Ingrese: \n (1) Para registrar un cliente \n (2) Para registrar un proveedor \n (3) Para registrar un producto \n (0)para salir del menu  " +
                    "Ingrese su opcion: " );
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Esta ingresando datos del cliente:");
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
                    System.out.println("Esta ingresando datos del proveedor:");
                    System.out.println("Ecriba RUT cliente  ");
                    operations.writeFile(PATH2, "=========== INFO PROVEEDOR ============");
                    System.out.println("Ingrese RUT del proveedor");
                    operations.writeFile(PATH2,"RUT:");
                    operations.writeFile(PATH2, scanner.next());
                    System.out.println("Ingrese nombre del proveedor");
                    operations.writeFile(PATH2, "Nombre: ");
                    operations.writeFile(PATH2, scanner.next());
                    System.out.println("Ingrese direccion del proveedor separadon por -");
                    operations.writeFile(PATH2, "Direccion: ");
                    operations.writeFile(PATH2,scanner.next());
                    System.out.println("Ingrese Telefono del proveedor");
                    operations.writeFile(PATH2, "Telefono: ");
                    operations.writeFile(PATH2,scanner.next());
                    System.out.println("Ingrese Pagina web del proveedor");
                    operations.writeFile(PATH2, "Pagina Web: ");
                    operations.writeFile(PATH2,scanner.next());
                    System.out.println(operations.readFile(PATH2));
                    System.out.println("Proveedor ingresado");
                    break;
                case 3:
                    System.out.println("Esta ingresando un Producto :");
                    operations.writeFile(PATH3, "=========== INFO PRODUCTO ============");
                    System.out.println("Ingrese nombre del producto ");
                    operations.writeFile(PATH3, "Producto: ");
                    operations.writeFile(PATH3,scanner.next());
                    System.out.println("Ingrese id del producto ");
                    operations.writeFile(PATH3, "id: ");
                    operations.writeFile(PATH3,scanner.next());
                    System.out.println("Ingrese precio del producto ");
                    operations.writeFile(PATH3, "Precio: ");
                    operations.writeFile(PATH3,scanner.next());
                    System.out.println("Ingrese Stock del producto ");
                    operations.writeFile(PATH3, "Stock: ");
                    operations.writeFile(PATH3,scanner.next());
                    System.out.println("Ingrese Categoria del producto ");
                    operations.writeFile(PATH3, "Categoria : ");
                    operations.writeFile(PATH3,scanner.next());
                    System.out.println(operations.readFile(PATH3));
                    System.out.println("Producto ingresado");
                case 0:
                    System.out.println("Salio del menu \n Gracias por usar el Menu PCPV ");

            }
        }while (option !=0);
    }


}


