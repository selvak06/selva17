public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avacodo = new Item("Topping", "avacodo", 1.50);
//        avacodo.printItem();
//        avacodo.setSize("SMALL");
//        avacodo.printItem();


//    Burger burger = new Burger ("regular", 4.0);
//    burger.addToppings("BACON", "CHEESE", "MAYO");
//    burger.printItem();
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondOrder = new MealOrder("Turkey", "7-up", "Chili");
//        secondOrder.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondOrder.setDrinkSize("SMALL");
//        secondOrder.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("Deluxe", "7-up", "Chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}
