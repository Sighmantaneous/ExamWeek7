import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductApp {

    public static void main(String[] args) {

        ArrayList<String> ProductArray = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            String userChoice = "";

            System.out.println("To add Product please enter: add");
            System.out.println("To update a product please enter: update");
            System.out.println("To Display all products please enter : display");
            System.out.println("To exit please enter: exit");
            userChoice = scanner.next();
            switch (userChoice) {

                case "add":
                      Product product1 = getProductInfo(scanner);
                    break;

                case "update":
                    break;

                case "display":
                    for (String product : ProductArray) {
                        System.out.println(product);
                    }
                    break;

                case "exit":
                    break;

                default:
                    System.out.println("Incorrect selection");
                    break;
            }
        }catch(InputMismatchException e){
            System.out.println("Please enter valid input");
        }
    }
    public static Product getProductInfo(Scanner scanner){
        System.out.println("Enter Product Id");
        String ProductId = scanner.next();
        System.out.println("Enter Product Name");
        String name = scanner.next();
        System.out.println("Enter Price");
        double price = Double.parseDouble(scanner.next());
        int quantity = Integer.parseInt(scanner.next());

        return new Product (ProductId,name,price,quantity);

    }
}
