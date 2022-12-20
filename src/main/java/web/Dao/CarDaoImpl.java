package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("porche", 1993, 320));
        cars.add(new Car("nissan", 2017, 340));
        cars.add(new Car("dodge", 2022, 150));
        cars.add(new Car("bmw", 2007, 270));
        cars.add(new Car("wolksvagen", 2011, 532));
    }
    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public List<Car> getSome(int count) {
        return  cars.stream().limit(count).collect(Collectors.toList());
    }
}
