package med.vol.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //essa anotacao e o que faz o controller funcionar
@RequestMapping("/hello")
public class HelloController{

    @GetMapping
    public String olaMundo(){
        return "hello World Spring";
    }
}