package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DaoCarImpl implements DaoCar{
    List<Car> carList = new ArrayList<>();
    public DaoCarImpl() {
        carList.add(new Car("Opel", "Astra","2005"));
        carList.add(new Car("Lada", "Granta","2014"));
        carList.add(new Car("Renault", "Logan","2006"));
        carList.add(new Car("Kia", "K5","2020"));
        carList.add(new Car("BMW", "M5","2019"));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
