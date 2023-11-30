package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.DaoCar;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private DaoCar daocar;
    @Override
    public List<Car> getCars(int count) {
        return daocar.getCars(count);
    }
}
