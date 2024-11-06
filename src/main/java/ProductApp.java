import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductApp {

    public static void main(String[] args) {

        ArrayList<Product> ProductArray = new ArrayList<>();
        //try with resources to automatically close Scanner class
        try (Scanner scanner = new Scanner(System.in)) {
            String userChoice = "";
            int i = 0;
            //do while set to break if userChoice = "exit".
            do {
                System.out.println("To add Product please enter: add");
                System.out.println("To update a product please enter: update");
                System.out.println("To Display all products please enter : display");
                System.out.println("To exit please enter: exit");
                userChoice = scanner.next();
                switch (userChoice) {

                    case "add":
                        System.out.println("Please enter the product Id you wish to update");
                        String checkId = scanner.next();
                        for(Product products: ProductArray) {
                            if (products.getProductId().equals(checkId)) {
                                System.out.println("Id already in use");
                                break;
                            }
                        }
                        //want to add new instance of product from getProductInfo to arrayList
                        //dont know how to store the return of function in the array

                        getProductInfo(scanner);
                        break;

                    case "update":
                        //want to check to see if productID exists
                        System.out.println("Please enter the product Id you wish to update");
                        String checkIdUpdate = scanner.next();
                        for(Product products: ProductArray){
                           if(products.getProductId().equals(checkIdUpdate)){
                                continue;
                            }else
                               System.out.println("Id not in Use");break;

                    }



                        break;

                    case "display":
                        //using enhancedLoop to cycle through ArrayList
                       // enhancedLoop(ProductArray);
                        for(Product product : ProductArray){
                            System.out.println(product);
                        }


                        break;

                    case "exit":
                        System.out.println("Thank you, Goodbye ");
                        break;

                    default:
                        System.out.println("Incorrect selection");
                        break;
                }

            }while(!userChoice.equals("exit"));

        //exception catch
        }catch(InputMismatchException e){
                System.out.println("Please enter valid input");
            }
        }




    //using a single function to take product details
    public static Product getProductInfo(Scanner scanner){
        System.out.println("Enter Product Id");
        String ProductId = scanner.next();
        System.out.println("Enter Product Name");
        String name = scanner.next();
        System.out.println("Enter Price");
        double price = Double.parseDouble(scanner.next());
        System.out.println("Enter quantity");
        int quantity = Integer.parseInt(scanner.next());
        return new Product (ProductId,name,price,quantity);
    }

    //Function that takes a ArrayList and loops through content
    public static void enhancedLoop(ArrayList <Product> listArray){
        int x = 0;
        for(Product product : listArray){
            System.out.println(product);
            x++;
        }
    }
}
