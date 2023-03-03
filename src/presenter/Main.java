package presenter;

import java.util.Scanner;
import model.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    Customer customer = new Customer( 0, scanner.next(), " ", scanner.nextInt());
    customer.writerBufferesWiter(scanner.next());
    }
}