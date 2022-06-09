package packaje;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/myApi")
public class DemoRestController {
    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String pong(){
        return "pong";
    }
}
