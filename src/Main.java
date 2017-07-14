import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "Grey"));
        cars.add(new Car("Lamborgini", "Car"));
        cars.add(new Car("Zhiguli", "White"));

        for (Car car: cars) {
            System.out.println(String.format("%s - %s", car.getName(), car.getColor()));
        }
    }
}
