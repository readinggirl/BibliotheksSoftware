package packaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CarRESTController {
    @Autowired
    private CarDataService carDataService;

    @RequestMapping(value ="/cars", method = RequestMethod.GET)
    public HttpEntity<List<CarResource>> getAllCars() {
        List<CarResource> carResources = carDataService.getCarResources();
        return new HttpEntity<>(carResources);
    }

    @RequestMapping(value ="/cars", method = RequestMethod.POST)
    public CarResource addCar(@RequestBody CarDto carDto) {
        return carDataService.addCar(carDto);
    }

    @RequestMapping(value ="/cars/{carId}", method = RequestMethod.PUT)
    public CarResource editCar(@PathVariable int carId, @RequestBody CarDto
            carDto) {
        return carDataService.editCar(carId, carDto);
    }

    @RequestMapping(value ="/cars/{carId}", method = RequestMethod.DELETE)
    public CarResource deleteCar(@PathVariable int carId) {
        return carDataService.deleteCar(carId);
    }

}
