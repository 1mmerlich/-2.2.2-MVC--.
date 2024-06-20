package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.Color;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements ICarService {

    List<Car> cars;
    @PostConstruct
    public void init() {
        Car car1 = new Car("Ауди", "ТТ", Color.BLACK);
        Car car2 = new Car("Жигули", "7", Color.WHITE);
        Car car3 = new Car("Лада", "14", Color.DARK);
        Car car4 = new Car("Лада", "15", Color.GREEN);
        Car car5 = new Car("Запорожец", "Турбо 8", Color.RED);
        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }
    public List<Car> getListCar (int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
