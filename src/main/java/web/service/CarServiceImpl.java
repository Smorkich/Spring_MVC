package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.DaoCar;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private DaoCar daocar;
    @Autowired
    public CarServiceImpl(DaoCar daocar) {
        this.daocar = daocar;
    }
    @Override
    public List<Car> getCars(int count) {
        return daocar.getCars(count);
    }
}
