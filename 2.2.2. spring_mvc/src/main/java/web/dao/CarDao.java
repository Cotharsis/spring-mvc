package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarDao {
    private List <Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Molika",23,1800));
        cars.add(new Car("Vogue",2,600));
        cars.add(new Car("BMV",4,900));
        cars.add(new Car("HelicoGrot",8,2300));
        cars.add(new Car("Puschok",0,20));
    }

    public List<Car> index(int count) {
            return cars.stream().limit(count).collect(Collectors.toList());
    }

    public List<Car> all(){return cars;}
}
