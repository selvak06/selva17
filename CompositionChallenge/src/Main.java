public class Main {
    public static void main(String[] args) {
       SmartKitchen sk = new SmartKitchen();
//       sk.getDishWasher().setHasWorktoDo(true);
//       sk.getIceBox().setHasWorktoDo(true);
//       sk.getBrewMaster().setHasWorktoDo(true);
//
//       sk.getDishWasher().doDishes();
//       sk.getIceBox().OrderFood();
//       sk.getBrewMaster().brewCoffee();

        sk.setKitchenState(true, false, true);
        sk.doKitchenWork();
    }
}
