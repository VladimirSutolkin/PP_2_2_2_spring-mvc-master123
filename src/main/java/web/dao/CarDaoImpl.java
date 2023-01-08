package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("ВАЗ 2110", "Красный",  120_000));
        carList.add(new Car("ВАЗ 2109", "Оранжевый",  95_000));
        carList.add(new Car("ВАЗ 2108", "Желтый", 78_000));
        carList.add(new Car("ВАЗ 2107", "Зеленый", 190_000));
        carList.add(new Car("ВАЗ 2106", "Голубой",  36_000));

    }
    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
