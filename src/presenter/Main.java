package presenter;

import java.util.Scanner;
import model.*;
public class Main {
    static final String PATHCUSTOMER = "src/customer/prueba1.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            FileManagement operations = new fileManageA();
        System.out.println("dijite el nombre del cliente ");
            operations.writeFile(PATHCUSTOMER, scanner.nextInt(),);
        System.out.println("dijite direccion del cliente ");
            operations.writeFile(PATHCUSTOMER,scanner.next());
            System.out.println(operations.readFile(PATHCUSTOMER));
            System.out.println("TAREA TERMINADA");


    }
}