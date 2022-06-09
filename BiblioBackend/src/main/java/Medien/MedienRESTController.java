package Medien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import packaje.CarDataService;
import packaje.CarResource;

import java.util.List;

@CrossOrigin
@RestController
public class MedienRESTController {
    @Autowired
    private MedienDataService dataService;

    @RequestMapping(value ="/medien", method = RequestMethod.GET)
    public HttpEntity<List<MediumDto>> getMedien() {
        List<MediumDto> medien = dataService.getMedien();
        return new HttpEntity<>(medien);
    }

}
