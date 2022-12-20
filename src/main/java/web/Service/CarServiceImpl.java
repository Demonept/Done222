package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    private final CarDaoImpl carDao;
    @Autowired
    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }

    @Override
    public List<Car> getSome(int count) {
        return carDao.getSome(count);
    }
}
