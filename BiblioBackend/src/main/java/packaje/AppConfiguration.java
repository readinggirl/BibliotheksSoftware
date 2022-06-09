package packaje;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public CarDataService createDataService(){
        CarDataService d = new CarDataService();
        d.createInitialCars();
        return d;
    }

}
