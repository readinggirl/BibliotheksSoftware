package packaje;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarDataService {
    private HashMap<Integer, Car> cars = new HashMap<>();

    public void createInitialCars() {
        Car c1 = new Car();
        c1.setId(1);
        c1.setBrand("VW");
        c1.setName("Golf");
        c1.setHorsePower(90);
        this.cars.put(c1.getId(), c1);
        Car c2 = new Car();
        c2.setId(2);
        c2.setBrand("Mercedes");
        c2.setName("C200d");
        c2.setHorsePower(150);
        this.cars.put(c2.getId(), c2);
    }

    List<CarResource> getCarResources() {
        List<CarResource> result = new ArrayList<>();
        for (Car cCar : cars.values()) {
            CarResource cResource = convertCarToCarResource(cCar);
            result.add(cResource);
        }
        return result;
    }

    private CarResource convertCarToCarResource(Car cCar) {
        CarResource cr = new CarResource();
        cr.setId(String.valueOf(cCar.getId()));
        cr.setBrandAndName(cCar.getBrand()+";"+cCar.getName());
        cr.setHorsePower(String.valueOf(cCar.getHorsePower()));
        return cr;
    }

    public CarResource addCar(CarDto carDto) {
        Car newCar = new Car();
        newCar.setId(this.cars.size() + 1);
        newCar.setHorsePower(psToInt(carDto.getHorsePower()));
        newCar.setBrand(carDto.getBrand());
        newCar.setName(carDto.getName());
        this.cars.put(newCar.getId(), newCar);
        return convertCarToCarResource(newCar);
    }
    private int psToInt(String psString) {
        String psRaw = psString.replace(" ", "").replace("PS", "");
        return Integer.parseInt(psRaw);
    }

    public CarResource editCar(int carId, CarDto carDto) {
        Car carToChange = cars.get(carId);
        carToChange.setBrand(carDto.getBrand());
        carToChange.setName(carDto.getName());
        carToChange.setHorsePower(psToInt(carDto.getHorsePower()));
        return convertCarToCarResource(carToChange);
    }

    public CarResource deleteCar(int carId) {
        Car carToRemove = cars.get(carId);
        this.cars.remove(carId);
        return convertCarToCarResource(carToRemove);
    }
}
