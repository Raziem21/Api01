package co.develhope.api01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    private StringBuilder name = new StringBuilder("Emanuele");


    @GetMapping
    public String getName() {
        return name.toString();
    }

    @PostMapping
    public String postName() {
        return name.reverse().toString();
    }
}
