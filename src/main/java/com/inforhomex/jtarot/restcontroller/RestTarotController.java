package com.inforhomex.jtarot.restcontroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/tarotapi")
@RestController
public class RestTarotController{
    
    //http://localhost:8090/tarotapi/saludo
    @GetMapping("saludo")
    public String saludo(){
        return new String("Bienvenidos a JTarot");
    }
}