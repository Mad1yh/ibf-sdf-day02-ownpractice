import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle honda = new Vehicle("Black", 1500, "SNK1599", "2020", "Hyundai", "steel");
        Vehicle avante = new Vehicle("white", 3000, "SHK4670", "2015", "Hyundai", "steel");
        honda.honk();
        honda.moveLeft();

        //Method 1 

        List<Vehicle> vehicles= new ArrayList<>();
        vehicles.add(honda);
        vehicles.add(avante);

        for (Vehicle veh: vehicles){ //re-iterating the for loop for each element of type Vehicle in the ArrayList named vehicles 
            System.out.println(veh.toString()); 
        }

        //Method 2

        Container <Vehicle> container = new Container<>();
        container.addItem(honda);
        container.addItem(avante);

        List<Vehicle> vehiclelist = container.getItems(); //Retrieving the list of vehicles from the container
        for (Vehicle vehicle:vehiclelist) {             //iterating through the list
            System.out.println(vehicle.toString()); //toString function returns a string representation of the object
        }

        //Methods 1 and 2 both store and retrieve 'Vehicle' objects--> both methods give the same output.
        // In both cases, you are adding instances of Vehicle to a collection (List or Container), retrieving the collection, and then iterating through it to print the string representation of each Vehicle object. The result will be the same.

            
        


    }
}
