package edu.escuelaing.ieti.taller2.controller.health;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping("/health")
    public String checkAPI() {
        return "<h2>The API is working ok!</h2>";
    }
}
