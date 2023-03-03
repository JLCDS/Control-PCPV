package presenter;

import java.util.Scanner;
import Model.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    Customer customer = new Customer( 0, scanner.next(), scanner.next(), scanner.nextInt());
    customer.writerBufferesWiter(scanner.next());
    }
}