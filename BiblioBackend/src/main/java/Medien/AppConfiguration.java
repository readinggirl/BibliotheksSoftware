package Medien;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public MedienDataService createDataService(){
        MedienDataService mds = new MedienDataService();
        mds.createInitialMedien();
        return mds;
    }
}
