import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int num1, int num2){
        boolean check = true;
        if (num1 < 0 || num1 > inventory.size() -1 || num2 < 0 || num2 > inventory.size() -1){
            return false;
        }
        else{
            Car change = inventory.set(num1, inventory.get(num2));
            inventory.set(num2, change);
            return true;
        }
    }
}
