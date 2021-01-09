package com.inforhomex.jtarot.restcontroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("jtarotapi")
@RestController
public class RestTarotController{
    
    //http://localhost:8090/jtarotapi/saludo
    @GetMapping("/saludo")
    public String saludo(){
    	return new String("Bienvenido a JTarot!!");
    }
}