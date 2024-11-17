package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    public static List<Car> carsCount(List<Car> cars, int num) {
        if (num == 0 || num >= 5) {
            return cars;
        }
        return cars.stream().limit(num).collect(Collectors.toList());
    }
}
