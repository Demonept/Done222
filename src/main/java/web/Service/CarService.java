package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll();

    List<Car> getSome(int count);
}
