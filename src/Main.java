import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes"));
        cars.add(new Car("Lamborgini"));
        cars.add(new Car("Zhiguli"));

        for (Car car: cars) {
            System.out.println(car.getName());
        }
    }
}
