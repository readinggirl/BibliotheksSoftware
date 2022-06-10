package Medien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MedienRESTController {
    @Autowired
    private MedienDataService dataService;

    @RequestMapping(value ="/medien", method = RequestMethod.GET)
    public HttpEntity<List<Medium>> getMedien() {
        List<Medium> medien = dataService.getMedien();
        return new HttpEntity<>(medien);
    }

    @RequestMapping(value ="/medien", method = RequestMethod.POST)
    public void addMedium(@RequestBody MediumDto mediumDto) {
        dataService.addMedium(mediumDto);
    }
}
