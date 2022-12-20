package web.Dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getAll();

    List<Car> getSome(int count);

}
