package it.unina.ci_pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/api")
    public String hello() {
        return "Hello";
    }
}
