package web.Dao;

import web.model.Car;

import java.util.List;

public interface DaoCar {
    List<Car> getCars(int count);
}
