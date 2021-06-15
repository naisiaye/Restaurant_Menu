package restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    //Use the main method to test your classes
    public static void main(String[] args) {
        // Create menu with a few food items to be added to
        ArrayList<MenuItem> menuItems = new ArrayList<>(Arrays.asList(
                new MenuItem(
                        "Pad Thai",
                        12.50,
                        "Thin rice noodles stir-fried with egg",
                        "main course"),
                new MenuItem(
                        "Pepperoni Pizza",
                        12.99,
                        "Hand tossed large pizza crust with house-made marinara sauce, topped with mozzarella cheese and pepperoni.",
                        "main course"),
                new MenuItem(
                        "Ice-cream",
                        5.50,
                        "Chocolate, Vanilla or Strawberry Gelato made in house.",
                        "dessert"),
                new MenuItem(
                        "Calamari",
                        10.95,
                        "Salt and pepper deep-fries calamari.",
                        "appetizer")));


//            MenuItem food6 = new MenuItem();
//            food6.setFoodName("Caprese Salad");
//            food6.setCategory("appetizer");
//            food6.setPrice(9.30);
//            food6.setDescription("The perfect combination of ripe, sun-kissed tomatoes, creamy buffalo milk mozzarella and fresh basil ");

        //Create several items and add them to a menu.
        Menu menu = new Menu(menuItems);
        menu.addMenuItem(new MenuItem(
                "Dumplings",
                9.95,
                "Steamed chicken dumplings.",
                "appetizer"));
//            menu.printMenu();

        //Print the entire, updated menu to the screen.
        menu.printMenu();


        //Print an individual menu item to the screen.
        System.out.println(menuItems.get(1));

        //Delete an item from a menu, then reprint the menu
        menuItems.remove(3);
        menu.printMenu();

    }
}

