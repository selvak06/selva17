public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
    public void setKitchenState (boolean coffeeFlag, boolean fridgeflag, boolean dishWasherFlag) {
        brewMaster.setHasWorktoDo(coffeeFlag);
        dishWasher.setHasWorktoDo(dishWasherFlag);
        iceBox.setHasWorktoDo(fridgeflag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.OrderFood();
        dishWasher.doDishes();
    }
}
class CoffeeMaker {
    private boolean hasWorktoDo;

    public void setHasWorktoDo(boolean hasWorktoDo) {
        this.hasWorktoDo = hasWorktoDo;
    }
    public void brewCoffee() {
        if (hasWorktoDo) {
            System.out.println("The BrewCoffee is happening");
            hasWorktoDo= false;
        }
    }
}

class DishWasher {
    private boolean hasWorktoDo;

    public void setHasWorktoDo(boolean hasWorktoDo) {
        this.hasWorktoDo = hasWorktoDo;
    }
    public void doDishes() {
        if (hasWorktoDo) {
            System.out.println("The DoDishes is happening");
            hasWorktoDo= false;
        }
    }
}

class Refrigerator {
    private boolean hasWorktoDo;

    public void setHasWorktoDo(boolean hasWorktoDo) {
        this.hasWorktoDo = hasWorktoDo;
    }
    public void OrderFood() {
        if (hasWorktoDo) {
            System.out.println("The OrderFood is happening");
            hasWorktoDo= false;
        }
    }
}
